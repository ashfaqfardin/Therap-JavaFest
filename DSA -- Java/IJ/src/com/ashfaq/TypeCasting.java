package com.ashfaq;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //type casting
//        int num1 = (int)(67.56f);
//        System.out.println(num1);

        //automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1

//        System.out.println(b); //should output 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//
//        System.out.println(d);

//        int number = 'a';
//        System.out.println(number);

//        System.out.println(3 + 5.231234124);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + integer - double = double
        System.out.println((f * b) + " " + (i / c) +" " + (d * s));
        System.out.println(result);

    }
}
