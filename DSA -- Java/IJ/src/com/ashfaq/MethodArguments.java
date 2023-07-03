package com.ashfaq;

public class MethodArguments {
    public static void main(String[] args) {
        int ans = sum3(20, 30);
        System.out.println(ans);
    }
    // static int sum3(arguments){}
    static int sum3(int a, int b){
        int sum3;
        sum3 = a + b;
        return sum3;
    }
}
