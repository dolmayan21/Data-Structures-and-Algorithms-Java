package com.java.dolmayan.dsa.excercises.LeetCode;

import java.util.ArrayList;

public class longestCommonPrefix14 {

    public static void main(String [] args){

    String [] strs = {"Cat", "Cartrtrtr"};

        System.out.println(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        String concat = "";
        char[] current = null;
        char[] tempArr = null;

        char[] temp = {};
        for(String str : strs) {
            for (int i=0; i< str.length(); i++) {
                if(tempArr == null){
                    System.out.println("curren null");
                    System.out.println();
                    tempArr = str.toCharArray();
                    break;
                }else{
                    if(tempArr[i] == str.toCharArray()[i]){
                        concat += concat + tempArr[i];
                    }else if(concat.length() == 0) {
                        return "FAILS";
                    } else if (concat.length()>=1) {
                        tempArr = concat.toCharArray();
                    }
                    for(char c: tempArr){
                        concat += c;
                    }

                    return concat;
                }




            }


        }
        return concat;
    }
}
