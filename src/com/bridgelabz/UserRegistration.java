package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserValidator {
    boolean validate(String input);
}

public class UserRegistration {

    private static final String FIRST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
    private static final String LAST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{2})?$";
    private static final String MOBILE_REGEX = "^[0-9]{2}\\s[0-9]{10}$";

    // Minimum 8 characters, at least 1 uppercase, at least 1 number, exactly 1 special character
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[^a-zA-Z0-9]){1}$).{8,}$";

    // UC13: Lambda expressions for validation
    UserValidator firstNameValidator = firstName ->
            Pattern.matches(FIRST_NAME_REGEX, firstName);

    UserValidator lastNameValidator = lastName ->
            Pattern.matches(LAST_NAME_REGEX, lastName);

    UserValidator emailValidator = email ->
            Pattern.matches(EMAIL_REGEX, email);

    UserValidator mobileValidator = mobile ->
            Pattern.matches(MOBILE_REGEX, mobile);

    UserValidator passwordValidator = password ->
            Pattern.matches(PASSWORD_REGEX, password);

    public boolean validateFirstName(String firstName) {
        return firstNameValidator.validate(firstName);
    }

    public boolean validateLastName(String lastName) {
        return lastNameValidator.validate(lastName);
    }

    public boolean validateEmail(String email) {
        return emailValidator.validate(email);
    }

    public boolean validateMobile(String mobile) {
        return mobileValidator.validate(mobile);
    }

    public boolean validatePassword(String password) {
        return passwordValidator.validate(password);
    }
}