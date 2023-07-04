package com.ashfaq;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // variable length arguments
        fun(2, 3, 6, 12, 34, 54, 34);
        multiple(2, 3, "Ashfaq", "Fardin", "Rahman");
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
