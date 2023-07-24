package com.java.dolmayan.dsa.excercises.LeetCode;

public class FindIndex28 {

    public static void main(String[] args) {

        String haystack = "babba", needle = "bbb";

        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle, 0);
    }
    /*
    public static int strStr(String haystack, String needle) {

        int counter = 0;
        int j =0;
        int i=0;

        if(needle.length()> haystack.length()) return  -1;

            while(i<haystack.length()){
                    while(j<needle.length() && (i+j)<haystack.length()){
                            if (haystack.toCharArray()[i + j] == needle.toCharArray()[j]) {
                            counter++;

                            } else {
                                counter = 0;
                            }
                            if (counter == needle.length()) {
                                return i;
                            }
                            j++;
                    }
                    j=0;
                    counter = 0;
                    i++;

            }

        return -1;
    }
    */

}
