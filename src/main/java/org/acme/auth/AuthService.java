package org.acme.auth;

import io.quarkus.security.User;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuthService {

    public String generateJWT(User User) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean validateJWT(String token) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
