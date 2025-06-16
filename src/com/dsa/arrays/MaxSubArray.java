package com.dsa.arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max =0;
        for(int i = 0;i<arr.length;i++){
            int sum =0;
            for(int j =i;j<arr.length;j++){
                sum+=arr[j];
                max = Math.max(sum,max);
            }
        }
        System.out.println(max);
    }
    }
