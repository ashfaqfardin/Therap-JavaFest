package com.ashfaq;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        list.add(11);
//        list.add(12);

//        System.out.println(list.contains(10));
//        System.out.println(list.contains(16));
//
//        list.set(0, 99); // 0th index set to 99
//        list.remove(2);
//
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here
        }
    }
}
