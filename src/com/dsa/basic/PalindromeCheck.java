package com.dsa.basic;

public class PalindromeCheck {
    public static void main(String[] args) {
        int x = 121;
        int temp = x;
        int rev = 0;
        while(x>0){
            int digit = x %10;
            rev = rev * 10 +digit;
            x=x/10;
        }
        if(rev == temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");

        }
    }
}
