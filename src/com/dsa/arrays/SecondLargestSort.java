package com.dsa.arrays;

public class SecondLargestSort {
    public static void main(String[] args) {
        int[] arr = {1,5,5,6,0,19,10,19};
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int secondMax = arr[arr.length-1];
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]<secondMax) {
                System.out.println(arr[i]);
                return;
            }
        }
    }
    }
