package com.ashfaq;

import java.util.Scanner;

public class MethodsSum {
    public static void main(String[] args) {
        sum();
        sum();
        sum();
    }

    static void sum(){
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    /*

    access modifier (OOP Concept) return_type name(){
        //body
        return statement;
    }

     */
}
