package com.ashfaq;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 2, 5, 10, 63};
        change(arr); // call by value
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99; // if we make change to the object via ref variable, same object will be change
    }
}
