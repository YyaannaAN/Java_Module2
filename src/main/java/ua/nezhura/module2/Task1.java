package ua.nezhura.module2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = createRandomNumList(10);
        List<String> stringNumbers = filterAndConvertToString(numbers);
        System.out.println("Filtered and converted numbers: " + stringNumbers);
    }

    public static List<Integer> createRandomNumList(int length) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt(1, 200);
            numbers.add(randomInt);
        }
        return numbers;
    }

    public static List<String> filterAndConvertToString(List<Integer> numbers) {
        List<String> filteredNumbers = new ArrayList<>();

        for (Integer num : numbers) {
            if (num > 100) {
                filteredNumbers.add(String.valueOf(num));
            }
        }

        return filteredNumbers;
    }
}

