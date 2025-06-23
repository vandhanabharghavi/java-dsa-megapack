package com.dsa.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayNegative {
    public static void main(String[] args) {
            int[] arr = {1,-2,-1,-3,2,1,5};
            int k = 2;
            Map<Integer,Integer> map = new HashMap<>();
            for(int i =0;i<arr.length;i++){
                int comp = k - arr[i];
                if(map.containsKey(comp)){
                    System.out.println(comp+" "+arr[i]);
                }
                else
                    map.put(arr[i],i);
            }
        }
    }
