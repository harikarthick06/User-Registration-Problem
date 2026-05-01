package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
    private static final String LAST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{2})?$";

    private static final String MOBILE_REGEX = "^[0-9]{2}\\s[0-9]{10}$";

    private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$).{8,}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(LAST_NAME_REGEX, lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches(MOBILE_REGEX, mobileNumber);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }
}