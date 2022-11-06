package org.example.problem13;

public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int prev = 0;
        for (char c : s.toCharArray()) {
            int current = charToInt(c);
            if (prev < current && prev != 0) {
                current = current - prev;
                sum += current;
                prev = 0;
            } else {
                sum += prev;
                prev = current;
            }
        }
        if (prev != 0) sum += prev;
        return sum;
    }

    private int charToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
