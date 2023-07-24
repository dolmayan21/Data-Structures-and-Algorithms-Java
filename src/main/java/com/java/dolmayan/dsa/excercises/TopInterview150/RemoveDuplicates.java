package com.java.dolmayan.dsa.excercises.TopInterview150;

public class RemoveDuplicates {

    /*
    * Given an integer array nums sorted in non-decreasing order,
    *  remove the duplicates in-place such that each unique element
    *  appears only once. The relative order of the elements should
    *  be kept the same. Then return the number of unique elements in
    * nums.Consider the number of unique elements of nums to be k,
    *  to get accepted, you need to do the following things:
    * Change the array nums such that the first k elements of nums
    *  contain the unique elements in the order they were present in
    *  nums initially. The remaining elements of nums are not important
    * as well as the size of nums.Return k.
    */

    public static void main(String[] args) {

        //int []nums = {0,1,2,2,3,0,4,2};

        int []nums = {3,2,2,3};



        int val =3;


        removeDuplicates(nums, val);

    }

    public static int removeDuplicates(int[] nums , int val){

        int k =0;
        int i = 0;

        while(i<nums.length){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}
