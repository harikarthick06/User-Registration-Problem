package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();

        System.out.println("Welcome to User Registration Problem");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.println(userRegistration.validateFirstName(firstName)
                ? "Valid First Name"
                : "Invalid First Name");

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println(userRegistration.validateLastName(lastName)
                ? "Valid Last Name"
                : "Invalid Last Name");

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println(userRegistration.validateEmail(email)
                ? "Valid Email"
                : "Invalid Email");

        System.out.print("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine();
        System.out.println(userRegistration.validateMobileNumber(mobileNumber)
                ? "Valid Mobile Number"
                : "Invalid Mobile Number");

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.println(userRegistration.validatePassword(password)
                ? "Valid Password"
                : "Invalid Password");

        System.out.println("\nChecking Email Samples:");

        String[] validEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        String[] invalidEmails = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        System.out.println("\nValid Email Samples:");
        for (String sampleEmail : validEmails) {
            System.out.println(sampleEmail + " : " + userRegistration.validateEmail(sampleEmail));
        }

        System.out.println("\nInvalid Email Samples:");
        for (String sampleEmail : invalidEmails) {
            System.out.println(sampleEmail + " : " + userRegistration.validateEmail(sampleEmail));
        }

        scanner.close();
    }
}