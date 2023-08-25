package com.robinsingh.ThymeleafValidation.entity;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull
    @Min(value = 0,message = "Value must be greater than or equal to 0")
    @Max(value = 10,message = "Value must be less than or equal to 0")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 digits/characters")
    private String postalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }
    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
