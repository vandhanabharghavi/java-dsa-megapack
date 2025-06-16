package com.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,10,5};
        int target = 15;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int comp = target - arr[i];
            if(map.containsKey(comp))
                System.out.println(comp+" "+arr[i]);
            else
                map.put(arr[i],i);
        }
    }
    }
