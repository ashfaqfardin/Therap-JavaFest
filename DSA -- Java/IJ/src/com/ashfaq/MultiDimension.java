package com.ashfaq;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
                1 2 3
                4 5 6
                7 8 9
         */
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][];

//        int[][] arr2D = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index --> arr2D[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows

        // input
        for (int row = 0; row < arr.length; row++){
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
        // output - enhanced version
        for (int[] ints : arr) {
            // for each col in every row
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // output - Array.toString()
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // output - Array.toString()
        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }


        // String array
        String[] str = new String[4];
        //input
        //....... write code in here
        System.out.println(str[0]);
        // print
        for (String element : str){
            System.out.println(element);
        }


    }
}
