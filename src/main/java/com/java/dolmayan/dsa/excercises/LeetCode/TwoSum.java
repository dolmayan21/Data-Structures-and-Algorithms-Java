package com.java.dolmayan.dsa.excercises.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

public class TwoSum {


    public static void main(String [] args){

        int[] nums = {3,2,4};
        int target = 6;

        for (int element: twoSum(nums, target)) {
            System.out.println(element);
        }
        twoSum(nums, target);
    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            if(map.containsKey(temp)){
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }



}
