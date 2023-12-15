package org.acme.auth;

import org.acme.data.UserRegistrationRequest;

import io.vertx.ext.auth.User;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {

    public User registerUser(UserRegistrationRequest userRegistrationRequest) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public User getUserById(Long userId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
