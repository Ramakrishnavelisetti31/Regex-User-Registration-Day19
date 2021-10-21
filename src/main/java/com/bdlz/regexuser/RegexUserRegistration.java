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

    public void userLastName() {
        System.out.println("Enter Your Last Name : ");
        String lastName = scanner.next();
        userDetails.lastName(lastName);
    }

    public void userEmailId() {
        System.out.println("Enter Your EmailId : ");
        String emailId = scanner.next();
        userDetails.emailId(emailId);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration program by Regex\n");

        RegexUserRegistration regexUserRegistration = new RegexUserRegistration();
//        regexUserRegistration.userFirstName();
//        regexUserRegistration.userLastName();
        regexUserRegistration.userEmailId();
    }
}
