package com.dsa.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortStringFrequencyDesc {
    public static void main(String[] args) {
        String s = "VandhanaBharghavi";
        Map<Character,Integer> map = new HashMap<>();
        //char[] ch = s.toCharArray();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->
                b.getValue()-a.getValue());
        System.out.println(list);

        //(x,y)->y-x
        //

    }
    }
