package com.ashfaq;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        System.out.println(num); // cannot access num
        { //block scope
//            int a = 88; cannot initialize since outside block already initialized
            a = 78; // reassigning new value
            int c = 99; // values initialized in the block, will remain in the block
        }
        int c = 1000; // does not know c initialized the previous block
        System.out.println(a);
//        System.out.println(c); // cannot access c

    }

    static void random(){
        int num = 55;
        System.out.println(num); // function scope
    }
}
