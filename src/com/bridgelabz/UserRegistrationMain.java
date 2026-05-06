package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();

        System.out.println("Welcome to User Registration Problem - UC13 Lambda Implementation");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        System.out.println("\nValidation Result:");

        System.out.println("First Name Valid: " + userRegistration.validateFirstName(firstName));
        System.out.println("Last Name Valid: " + userRegistration.validateLastName(lastName));
        System.out.println("Email Valid: " + userRegistration.validateEmail(email));
        System.out.println("Mobile Number Valid: " + userRegistration.validateMobile(mobile));
        System.out.println("Password Valid: " + userRegistration.validatePassword(password));

        if (userRegistration.validateFirstName(firstName)
                && userRegistration.validateLastName(lastName)
                && userRegistration.validateEmail(email)
                && userRegistration.validateMobile(mobile)
                && userRegistration.validatePassword(password)) {
            System.out.println("\nUser Registration Successful.");
        } else {
            System.out.println("\nUser Registration Failed. Please enter valid details.");
        }

        scanner.close();
    }
}