package com.ashfaq;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 12, 3, 11, -3, 28};
        int target = 11;

        int ans = linearSearch(nums, target);
        System.out.println(ans); // print index num 4
    }

    // return the element
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }

    // search in the array: return the index if item found
    // otherwise return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }

        return -1;
    }
}
