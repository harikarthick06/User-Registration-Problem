package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
    private static final String LAST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(LAST_NAME_REGEX, lastName);
    }
}