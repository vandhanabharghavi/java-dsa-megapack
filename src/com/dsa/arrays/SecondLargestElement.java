package com.dsa.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,5,6,0,19,10};
        int max = 0;
        int secondMax = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax && arr[i]!=max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
    }
