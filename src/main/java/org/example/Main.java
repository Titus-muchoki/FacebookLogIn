package org.example;

public class Main {
    static void checkAge(int age){
        if (age < 18) {
            System.out.println("your not old enough you cant join");
        } else if (age >=18) {
            System.out.println("your old enought enter your account detail.");

        }
    }
    public static void main(String[] args) {
        String name = " enter a name";
        int age = 18;
        String email = "verified";
        String logIn = "user input";

        //user interface.
        System.out.println("*****************");
        System.out.println("");
        System.out.println("Enter your name:");

        if (age == 18 || email ==name) {
            System.out.println("the user is verified: "+name);
        }else {
            System.out.println("the account is unknown");
        }
       // System.out.println("Hello world!");
        checkAge(10);
    }
}