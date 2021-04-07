package com.company;

public class PalindromePermutation2 extends Main{
    public static boolean canPalin2(String s){
        int count=0;
        for (char c=0; c<128; c++){
            int ct = 0;
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i)==c){
                    ct++;
                }
            }
            count+= ct%2;
        }
        return count<=1;
    }
}
