package com.example.usermanagement_app.Registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class RegistrationRequest {
    private final String email;
    private final String password;
    private final String firstname;
    private final String lastname;

}
