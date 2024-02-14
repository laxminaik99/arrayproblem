package com.bridgelabz12;

public class ElementsAtEvenPositions {
    public static void main(String[] args) {
        
        int[] arr = {10, 25, 7, 32, 18};

        System.out.println("Elements at even positions:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
