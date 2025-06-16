package com.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        int[] arr = {1,5,5,6,0,19,10,19};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
            map.put(i, map.getOrDefault(i,0)+1);
        System.out.println(map);
    }
    }
