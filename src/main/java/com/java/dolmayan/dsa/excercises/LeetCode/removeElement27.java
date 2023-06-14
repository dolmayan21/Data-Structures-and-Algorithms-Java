package com.java.dolmayan.dsa.excercises.LeetCode;

import java.sql.SQLOutput;

public class removeElement27 {

    public static void main(String[] args) {

      //  int[] nums = {0,1,2,2,3,0,4,2};

      int[] nums = {3,2,2,3};

        int val = 3;

        removeElement(nums, val);
    }
    public static int removeElement(int[] nums, int val) {
        int j = 0;


        for(int i=0; i< nums.length; i++){

            System.out.println("entra a for");
           while(nums[i] != val){



               nums[j] =nums[i];
               System.out.println(nums[j]);
               j++;
               i++;

               System.out.println("*************   "+ i);
               if(i == (nums.length-1)){
                   break;
               }


           }

        }


        for(int k : nums){
            System.out.println(k);
        }
        System.out.println("**************         " + j);




        return 1;
    }



}
