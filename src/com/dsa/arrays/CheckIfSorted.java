package com.dsa.arrays;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1,5,5,6,0,19,10,19};
        boolean isSorted = true;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        System.out.println("sorted");
        else
            System.out.println("not sorted");
    }
    }
