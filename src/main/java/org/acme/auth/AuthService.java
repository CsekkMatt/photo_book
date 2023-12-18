package org.acme.auth;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;

import io.quarkus.security.User;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuthService {

    public String generateJWT(User user) {
        // return Jwt.issuer("https://example.com/issuer")
        //         .upn(user.getUsername())
        //         .groups(new HashSet<>(user.getRoles()))
        //         .expiresAt(Instant.now().plus(15, ChronoUnit.MINUTES))
        //         .sign();

        return "";
    }

    public boolean validateJWT(String token) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
