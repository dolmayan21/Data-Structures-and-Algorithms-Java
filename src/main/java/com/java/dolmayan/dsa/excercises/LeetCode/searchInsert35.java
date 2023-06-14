package com.java.dolmayan.dsa.excercises.LeetCode;

public class searchInsert35 {

    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 5;

        searchInsert(nums, target);
    }

    public static int searchInsert(int[] nums, int target) {
        int i=0;
        while(i<nums.length){
            if(target == nums[i]) {
                return i;
            }else if(nums[i] > target){
                return i;
            }
            i++;
        }
        return nums.length;
    }
}
