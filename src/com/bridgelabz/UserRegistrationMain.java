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

        scanner.close();
    }
}