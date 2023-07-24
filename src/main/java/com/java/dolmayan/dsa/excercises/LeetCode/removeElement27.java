package com.java.dolmayan.dsa.excercises.LeetCode;

import java.util.Arrays;

public class removeElement27 {


    public static void main(String[] args) {

       // int nums[]= {3,2,2,3};
        int nums[]= {0,1,2,2,3,0,4,2};

        int val = 2;
        System.out.println(removeElement(nums,val));


    }

    public static int removeElement(int[] nums, int val) {

        int j = 0;
        int i =0;

            while (i<nums.length) {
                if(nums[i++] != val){
                }
            }
            return j;
    }

}
