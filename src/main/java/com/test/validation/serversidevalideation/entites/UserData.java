package com.test.validation.serversidevalideation.entites;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserData {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 10, message = "Name must be between 3 and 10 characters")
    private String name;
    @NotBlank(message = "Email cannot be blank")
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid email")
    private String email;

    @AssertTrue(message = "Must agree to terms and conditions")
    private boolean agreement;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserData(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public UserData() {
    }

    public boolean isAgreement() {
        return agreement;
    }

    public void setAgreement(boolean agreement) {
        this.agreement = agreement;
    }

    @Override
    public String toString() {
        return "UserData [name=" + name + ", email=" + email + "]";
    }
}
