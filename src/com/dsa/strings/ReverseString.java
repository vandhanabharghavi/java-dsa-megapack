package com.dsa.strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "malayalam";
        StringBuilder sb = new StringBuilder(s).reverse();
        if(sb.toString().equalsIgnoreCase(s))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not Palindrome");
    }
    }
