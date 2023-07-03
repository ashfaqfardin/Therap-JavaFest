package com.ashfaq;

import java.util.Scanner;

public class MyGreetExample {
    public static void main(String[] args) {
        String personalized = myGreet("Ashfaq");
        System.out.println(personalized);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalized2 = myGreet(naam);
        System.out.println(personalized2);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
