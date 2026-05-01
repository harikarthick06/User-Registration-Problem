package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();

        System.out.println("Welcome to User Registration Problem");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        if (userRegistration.validateFirstName(firstName)) {
            System.out.println("Valid First Name");
        } else {
            System.out.println("Invalid First Name");
        }

        scanner.close();
    }
}