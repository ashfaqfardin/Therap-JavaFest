package com.ashfaq;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b); // will not swap the values

        System.out.println(a + " " + b);

        String name = "Ashfaq";
        changeName(name); // will not change the name
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Fardin";
    }


    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
