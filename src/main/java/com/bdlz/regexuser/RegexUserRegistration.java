package com.bdlz.regexuser;

import java.util.Scanner;

public class RegexUserRegistration {

    Scanner scanner = new Scanner(System.in);
    UserDetails userDetails = new UserDetails();

    public void userFirstName() {
        System.out.println("Enter Your First Name : ");
        String firstName = scanner.next();
        userDetails.firstName(firstName);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration program by Regex\n");

        RegexUserRegistration regexUserRegistration = new RegexUserRegistration();
        regexUserRegistration.userFirstName();
    }
}
