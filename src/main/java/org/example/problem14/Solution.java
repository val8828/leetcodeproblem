package org.example.problem14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] targetString = new char[0];
        int minPrefixLength ;

        if (strs.length > 0) targetString = strs[0].toCharArray();
        minPrefixLength = targetString.length;

        if(strs.length > 1){
            for(int i = 1; i < strs.length; i++ ){
                char[] currentString = strs[i].toCharArray();
                if(currentString.length < minPrefixLength) minPrefixLength = currentString.length;
                for(int j = 0; j < minPrefixLength; j++){
                    if(currentString[j] != targetString[j]){
                        minPrefixLength = j;
                        break;
                    }
                }
            }
        }
        return new String(Arrays.copyOf(targetString,minPrefixLength));
    }
}
