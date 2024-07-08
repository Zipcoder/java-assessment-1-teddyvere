package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {

        int count = 0;
        // Outer loop iterating over input string
        for (int i = 0; i < input.length(); i++) {

            // Inner loop iterating from current starting
            // character of outer loop current starting
            // character
            for (int j = i; j < input.length(); j++) {

                // Getting the substrings
                String subString = input.substring(i, j + 1);

                // Checking whether the substring is
                // palindrome

                // Increment the count only if
                // substring is palindrome
                count++;
            }
        }
        return count;
    }
}