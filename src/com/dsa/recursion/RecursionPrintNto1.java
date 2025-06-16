package com.dsa.recursion;

public class RecursionPrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        method(5);
    }
    public static void method(int n){
        if(n==0) return;
        System.out.println(n);
        method(n-1);
    }
    }
