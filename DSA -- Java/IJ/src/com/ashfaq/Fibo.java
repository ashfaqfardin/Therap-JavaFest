package com.ashfaq;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0; // 1st number
        int b = 1; // 2nd number
        int count = 2;

        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}
