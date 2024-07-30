package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = "[,\n]";

        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf('\n');
            String customDelimiter = numbers.substring(2, delimiterEndIndex);
            numbers = numbers.substring(delimiterEndIndex + 1);
            delimiter = "[" + delimiter + "|" + customDelimiter + "]";
        }

        String[] nums = numbers.split(delimiter);
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;
        boolean throwException=false;
        for (String num : nums) {
            if (!num.isEmpty()) {
                if(Integer.parseInt(num)<0)
                {
                    throwException=true;
                    negatives.add(Integer.parseInt(num));
                }
                sum += Integer.parseInt(num);
            }
        }
        if (throwException) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
        }

        return sum;
    }
}
