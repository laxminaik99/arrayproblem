package com.bridgelabz12;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
       
        int[] arr = {10, 25, 7, 32, 18};

        Arrays.sort(arr);

        int secondLargest = arr[arr.length - 2];

        System.out.println("The second largest element in the array is: " + secondLargest);
    }
}
