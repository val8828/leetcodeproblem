package org.example.problem9;

class Solution {
    public boolean isPalindrome(int x) {
        char[] chars = ("" + x).toCharArray();
        for(int i = 0; i < (chars.length / 2); i++ ){
            if(chars[i] != chars[chars.length - i - 1]) return false;
        }
        return true;
    }
}
