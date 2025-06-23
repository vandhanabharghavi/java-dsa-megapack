package com.dsa.slidingWindow;

public class LongestSubArrayPositive {
    public static void main(String[] args) {
        int[] arr ={1,2,1,1,1,3,5};
        int k =5;
        int right=0,left=0,maxLen=0,sum=0;
        while(right<arr.length){
            sum+=arr[right];
            if(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k)
                maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        System.out.println(maxLen);
    }
}
