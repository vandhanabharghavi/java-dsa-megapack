package com.dsa.arrays;

public class FindPeekElement {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,10,5};
    if(arr[0]>arr[1])
        System.out.println(0);
    if(arr[arr.length-1]>arr[arr.length-2])
        System.out.println(1);
    for(int i =1;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
            System.out.println(i);
    }
    }
    }
