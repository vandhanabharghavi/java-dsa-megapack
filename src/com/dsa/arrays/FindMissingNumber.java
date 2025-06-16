package com.dsa.arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        //first n natural number sum is n*(n+1)/2
        int[] arr = {1,2,4,5};
        int sum =0;
        int n = arr.length+1;
        int actualSum = (n*(n+1))/2;
        for (int j : arr) {
            sum += j;
        }
        int missingNumber = actualSum - sum;
        System.out.println(missingNumber);
    }
    }
