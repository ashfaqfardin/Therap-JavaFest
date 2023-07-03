package com.ashfaq;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Ashfaq Fardin";
        greet(name); // pass by value (copy of that reference)
    }
    // both name and name are pointing towards the same object "Ashfaq Fardin"
    static void greet(String naam) {
        System.out.println(naam);
    }
}

// primitives int, short, char, byte -- just passing values
// object and stuff: passing value of reference variable
