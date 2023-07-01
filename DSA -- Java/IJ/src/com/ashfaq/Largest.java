package com.ashfaq;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of three numbers
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }

        // another approach
//        int max = 0;
//        if (a > b){
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c > max){
//            max = c;
//        }

        // based on ij suggestion
        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
    }
}
