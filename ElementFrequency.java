package com.bridgelabz12;
import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
       
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
