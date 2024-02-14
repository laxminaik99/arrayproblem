package com.bridgelabz12;

public class LargestElement {
    public static void main(String[] args) {
       
        int[] arr = {10, 25, 7, 32, 18};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
    }
}
