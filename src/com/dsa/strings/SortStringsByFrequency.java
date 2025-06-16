package com.dsa.strings;

import java.util.*;

public class SortStringsByFrequency {
    public static void main(String[] args) {
    String str = "I Am Vandhana Bharghavi";
    String[] ch = str.split(" ");
    Map<String,Integer> map = new TreeMap<>();
    for(String i:ch){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((a,b)->a.getValue().compareTo(b.getValue()));

    for(Map.Entry<String,Integer> e :list)
        System.out.println(e.getKey()+" : "+e.getValue());
    }
}
