package com.ashfaq;

public class CountNums {
    public static void main(String[] args) {
        int n = 53255432;

        int count = 0;
        int numToCount = 5;
        while(n > 0){
            int rem = n % 10;
            if(rem == numToCount){
                count++;
            }
            n = n / 10; // n /= 10
        }

        System.out.println(count);
    }
}
