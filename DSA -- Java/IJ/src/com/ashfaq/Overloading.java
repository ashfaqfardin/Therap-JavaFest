package com.ashfaq;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Ashfaq");
        fun("Ashfaq", "Fardin");
        fun(1, 2, 3, 5);
        fun("Ashfaq", "Rahman", "Gmail");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...x){
        System.out.println(Arrays.toString(x));
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static void fun(String name, String id){
        System.out.println(name);
        System.out.println(id);
    }
}
