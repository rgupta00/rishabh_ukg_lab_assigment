package com.day1.q3;

import java.util.Arrays;

/*
Write a method called copyOf(), which accept an int array and returns a copy of the given array.
The method's signature is as follows:
public static int[] copyOf(int[] array)
 */
public class Question3 {
    public static void main(String[] args) {
        int arr[]={7,8,9};
       int arr2[]= copyOf(arr);

    }

    private static int[] copyOf(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
}
