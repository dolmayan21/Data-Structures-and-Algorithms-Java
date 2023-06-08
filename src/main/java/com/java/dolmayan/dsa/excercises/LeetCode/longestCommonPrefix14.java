package com.java.dolmayan.dsa.excercises.LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class longestCommonPrefix14 {

    public static void main(String [] args){

        String [] strs = {"abab","aba","abc"};
        System.out.println(" That's what returns-------> " + longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));

        int i = 0;
        while(strs[0].length() != 0){

            for(i= 0; i<strs[0].length(); i++) {
                for(int j = 1; j< strs.length; j++) {

                    if (strs[0].charAt(i) != strs[j].charAt(i)) {
                        return strs[0].substring(0,i);
                    }
                }
            }
            return strs[0].substring(0,i);
        }
        return "";
    }



//    public static String longestCommonPrefix(String[] strs) {
//        Arrays.sort(strs, Comparator.comparingInt(String::length));
//
//        String concat = "";
//        char[] tempArr = null;
//        int count = 0;
//        int strCount = 0;
//        int comparator = 0;
//
//        tempArr = strs[0].toCharArray();
//        if(tempArr.length == 0) return "";
//
//        for(String str : strs) {
//            comparator = 0;
//             count += 1;
//
//                        for (int i = 0; i < tempArr.length; i++) {
//
//                            if(str.length() == 0) return "";
//
//                            if(i< str.toCharArray().length ) {
//
//
//                                if (tempArr[i] == str.toCharArray()[i]) {
//                                    comparator += 1;
//
//                                    if(count == 1) {
//                                        strCount += 1;
//                                    }
//
//                                } else if (strCount == 0) {
//                                    return "";
//                                }else if(tempArr[i] != str.toCharArray()[i] ){
//                                    if(comparator< strCount) {
//                                         strCount = comparator;
//                                     }
//                                }
//                            }else if(comparator< strCount) {
//                                strCount = comparator;
//                            }
//                        }
//        }
//        if(strs.length == 1){
//            return strs[0];
//        }
//        if(strCount != 0) {
//            concat = strs[0];
//            concat = concat.substring(0, strCount);
//        }else{
//            return "";
//        }
//        return concat;
//    }


}

