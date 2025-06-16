package com.dsa.strings;

public class ReverseEveryWord {
    public static void main(String[] args) {
        String str = "I Am Vandhana Bharghavi";
        String[] ch = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String i : ch)
            sb.append(new StringBuilder(i).reverse().append(" "));
        System.out.println(sb.toString().trim());

    }
}
