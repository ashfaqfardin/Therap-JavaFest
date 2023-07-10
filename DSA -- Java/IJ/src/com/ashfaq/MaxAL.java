package com.ashfaq;

public class MaxAL {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 43, 22};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

    // imagine that arr is not empty
    static int max(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }


    static int maxRange(int[] arr, int start, int end) {
        // edge cases
        if (end > start){
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int maxVal = arr[0];
        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
