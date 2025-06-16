package com.dsa.recursion;

public class RecursionPrint1ToN {
    public static void main(String[] args) {
     int n = 5;
     method(n);
    }
    public static void method(int n){
        if(n==0) return;
        method(n-1);
        System.out.println(n);
    }
    }
