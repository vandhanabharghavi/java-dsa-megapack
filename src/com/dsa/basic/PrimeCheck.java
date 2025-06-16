package com.dsa.basic;

public class PrimeCheck {
    public static void main(String[] args) {
        int x = 5;
        if(x<=1) {
            System.out.println("not prime");
            return;
        }
            for(int i =2;i<=Math.sqrt(x);i++){
            if(x%i==0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}
