package com.dsa.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordStreams {
    public static void main(String[] args) {
        String str = "I Am Vandhana Bharghavi";
        String res = Arrays.stream(str.split(" "))
                .map(x->new StringBuilder(x).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(res);
    }
}
