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

        scanner.close();
    }
}