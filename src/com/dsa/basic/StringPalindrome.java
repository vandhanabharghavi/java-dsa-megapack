package com.dsa.basic;

import java.util.Locale;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Malayalam";
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str))
            System.out.println("Palindrome");
        else
            System.out.println("not Palindrome");
        }
    }
