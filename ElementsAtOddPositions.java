package com.bridgelabz12;

public class ElementsAtOddPositions {
    public static void main(String[] args) {
      
        int[] arr = {10, 25, 7, 32, 18};

        System.out.println("Elements at odd positions:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

