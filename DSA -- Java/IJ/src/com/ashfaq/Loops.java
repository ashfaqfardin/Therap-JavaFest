package com.ashfaq;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for loop
//        for (int num = 1; num <= 5; num += 1){
//            System.out.println(num);
//        }

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
//        }

        // while loops -- check and execute
        int num = 1;
        while (num <= 5){
//            System.out.println(num);
            num += 1;
        }

        // do while loops -- execute then check condition
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
