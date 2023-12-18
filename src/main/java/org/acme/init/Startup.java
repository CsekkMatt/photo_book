package org.acme.init;

import org.acme.domain.user.UserEntity;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;

@Singleton
public class Startup {

    @Transactional
    public void loadUsers(@Observes StartupEvent evt) {
        // UserEntity.deleteAll();
        // UserEntity.add("admin", "admin", "admin");
        // UserEntity.add("user", "user", "user");
        System.out.println("Startup....");
    }
}
