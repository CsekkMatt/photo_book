package org.acme.auth;

import org.acme.data.UserRegistrationRequest;
import org.acme.domain.user.UserEntity;
import org.acme.model.User;
import org.acme.repository.UserRepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserService {

    @Inject
    private UserRepository userRepository;

    public void registerUser(UserRegistrationRequest userRegistrationRequest) {
        PanacheQuery<UserEntity> user = userRepository.find("username", userRegistrationRequest.getUsername());
        UserEntity userEntity = user.singleResult();
        if (userEntity != null) {
            throw new RuntimeException("User already exists");
        }
        userEntity = new UserEntity();
        userEntity.setUsername(userRegistrationRequest.getUsername());
        userEntity.setPassword(userRegistrationRequest.getPassword());
        userRepository.persist(userEntity);
    }

    public User getUserById(Long userId) {
        UserEntity userEntity = userRepository.findById(userId);
        if (userEntity != null) {
            return mapUserEntityToUser(userEntity);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    private User mapUserEntityToUser(UserEntity userEntity) {
        User user = new User();
        user.setId(userEntity.id);
        user.setUsername(userEntity.getUsername());
        return user;
    }

}