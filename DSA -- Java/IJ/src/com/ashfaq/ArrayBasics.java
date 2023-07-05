package com.ashfaq;

public class ArrayBasics {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Ashfaq Fardin";

        // Q: store 5 roll numbers
        // syntax
        // datatype[] variable name = new datatype[size];
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 12};

        int[] ros; //declaration of array, ros is getting defined in the stack
        // compile time
        ros = new int[5]; // actually here object is being created in the heap memory
        // run time -- dynamic memory
        // new -- is used to create an object

        // primitives are stored in stack memory (int, double, etc.)
        // all other things are stored in heap memory
        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);



    }
}
