package com.company;

public class Main {

    public static void main(String[] args) {
        String s= "tactcoa";
        boolean ans1 = PalindromePermutation.canPalindrome(s);
        System.out.println(ans1);
        boolean ans2 = PalindromePermutation2.canPalin2(s);
        System.out.println(ans2);
    }
}
