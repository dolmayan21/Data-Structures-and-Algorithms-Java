package com.java.dolmayan.dsa.excercises.LeetCode;

import java.util.*;

public class removeDuplicates26 {

    public static void main(String[] args) {

        int[] nums = {1,1,2};

        System.out.println(removeDuplicates(nums));

    }


    public static int removeDuplicates(int[] nums) {

        ArrayList<Integer> experctedNums = new ArrayList<>();

        int init =1;
        int temp = nums[0];


        for(int i = 1; i<nums.length; i++ ) {

            if(temp != nums[i]){
                System.out.println(nums[i]);
                experctedNums.add(temp);
                temp = nums[i];


            }


        }



        return experctedNums.size();
    }


}
