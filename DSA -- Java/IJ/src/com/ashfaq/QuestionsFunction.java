package com.ashfaq;

import java.util.Scanner;

public class QuestionsFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);

//        System.out.println(isArmstrong(n));
        for (int i = 100; i < 1000; i++){
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    //Q1: print all the three digit armstrong numbers
    // 153 => 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
    // 153 == 153 true -- armstrong num
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n/ 10;
            sum = sum + rem*rem*rem; // rem^3
        }

        return sum == original;
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
