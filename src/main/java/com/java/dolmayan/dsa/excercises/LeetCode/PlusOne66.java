package com.java.dolmayan.dsa.excercises.LeetCode;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PlusOne66 {

    public static void main(String[] args) {

        int arr[] = {8,9,9,9,9,9,9};

        plusOne(arr);

    }
    public static  int[] plusOne(int[] digits) {  /// 1999999             0000000

        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println("FOR CYCLE");

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;


    }
}
