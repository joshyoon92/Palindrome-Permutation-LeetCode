package com.company;
import java.util.*;

public class PalindromePermutation extends Main{
    public static boolean canPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        int count =0;
        for (char key: map.keySet()){
            count += map.get(key)%2;
        }
        return count <=1;
    }
}
//Time complexity O(n)
//Space complexity O(1)
