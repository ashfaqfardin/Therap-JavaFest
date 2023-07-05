package com.ashfaq;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 11;
        arr[2] = 22;
        arr[3] = 423;
        arr[4] = 25;
        System.out.println(arr[3]);

        // input using for loop
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        // enhanced for loop
        for (int j : arr) { // for every element in array, print the element
            System.out.print(j + " "); // here j represents element of the array
        }

//        System.out.println(arr[5]); // index out of bound error
    }
}
