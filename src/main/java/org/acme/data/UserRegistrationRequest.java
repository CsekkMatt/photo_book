package org.acme.data;

import lombok.Data;

@Data
public class UserRegistrationRequest {
    private String username;
    private String password;

}
