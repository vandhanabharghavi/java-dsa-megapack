package com.dsa.basic;

public class StringPalindromeSB {
    public static void main(String[] args) {
        String str = "Malayalam";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equalsIgnoreCase(String.valueOf(sb)))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    }
