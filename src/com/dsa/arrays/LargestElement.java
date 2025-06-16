package com.dsa.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,5,6,0,19,10};
        int max = 0;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        System.out.println(max);
    }
    }
