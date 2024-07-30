package org.example;

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
        int sum = 0;
        for (String num : nums) {
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }
}
