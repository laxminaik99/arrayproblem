package com.bridgelabz12;

public class ReverseOrder {
    public static void main(String[] args) {
        
        int[] arr = {10, 25, 7, 32, 18};

        System.out.println("Elements in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
