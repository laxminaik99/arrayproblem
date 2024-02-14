package com.bridgelabz12;
import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 32, 18};

        Arrays.sort(arr);

        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
