package com.dsa.arrays;

public class RightRotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4};
        int k =3;
        int n = arr.length;
        k=k%n;
        int[] temp = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            temp[(i+k)%n]=arr[i];
        }
        for(int j : temp)
            System.out.println(j);
    }
}
