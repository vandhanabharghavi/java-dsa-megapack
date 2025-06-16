package com.dsa.arrays;

public class FindPeekBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,10,5};
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
                System.out.println(mid);
                break;
            }
            else if(arr[mid-1]>arr[mid])
                high = mid -1;
            else
                low = mid+1;
        }
    }
    }
