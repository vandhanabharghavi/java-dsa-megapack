package com.dsa.arrays;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        //Given an unsorted array of integers nums,
        // return the length of the longest consecutive elements
        // sequence.
        //
        //Input: nums = [100,4,200,1,3,2]
        //OUTPUT : 1,2,3,4
        //
        //LEARN
        //second largest element
        int[] arr = {1,2,4,6,7,8,9};
        int max =0,secondMax =0,thirdMax=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){// 1 2 3
                thirdMax=secondMax;
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max) {
                thirdMax = secondMax;
                secondMax = arr[i];
            }
            else if(arr[i]>thirdMax &&arr[i]!=max){
                thirdMax=arr[i];
            }
        }
        System.out.println(thirdMax);
        System.out.println(secondMax);
    }
    }
