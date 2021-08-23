package com.paynemiller.ch4;

import java.util.HashMap;
import java.util.Scanner;

public class PasswordValidator {
    //Exercise 15
    String usernameAttempt;
    String passwordAttempt;

    Scanner keyboard = new Scanner(System.in);
    HashMap<String, String> userPass = new HashMap<>();

    public void usersAndPasswords() {
        userPass.put("uncc", "asdf");
        userPass.put("Erick", "password");
        userPass.put("Payne", "Admin");
    }

    public void promptForUsernameHash() {
        System.out.print("What is your username? ");
        usernameAttempt = keyboard.next();
    }

    public void checkUserHash() {
        if (userPass.containsKey(usernameAttempt)) {
            promptForPasswordHash();
            checkPasswordHash();
        } else {
            System.out.println("Username is not on file.");
        }
    }
    public void promptForPasswordHash() {
        System.out.print("What is the password? ");
        passwordAttempt = keyboard.next();
    }
    public void checkPasswordHash() {
        if (userPass.get(usernameAttempt).equals(passwordAttempt)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }

    public void performPasswordValidatorHash() {
        usersAndPasswords();
        promptForUsernameHash();
        checkUserHash();
    }
}