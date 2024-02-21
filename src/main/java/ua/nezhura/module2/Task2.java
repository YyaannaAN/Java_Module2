package ua.nezhura.module2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 1, 1, 8, 8, 7, 3};
        int count = countNonRepeatingNumbersInArray(numbers);
        System.out.println("The number of non-repeating elements is: " + count);
    }

    public static int countNonRepeatingNumbersInArray(int[] nums) {
        Map<Integer, Integer> frequencyMap = createNumberRepetitionMap(nums);
        return countUniqueNumbersInMap(frequencyMap);

    }

    public static Map<Integer, Integer> createNumberRepetitionMap (int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    public static int countUniqueNumbersInMap(Map<Integer, Integer> frequencyMap) {
        int count = 0;
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == 1) {
                count++;
            }
        }
        return count;
    }
}


