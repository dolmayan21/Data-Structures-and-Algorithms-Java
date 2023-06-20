package com.java.dolmayan.dsa.excercises.LeetCode;

import java.sql.SQLOutput;

public class LengthofLastWord58 {

    public static void main(String[] args) {
        String s = "Hello World   ";

        lengthOfLastWord(s);

    }

    public static int lengthOfLastWord(String s) {

        boolean b = false;
        String st = "";

        StringBuilder stringBuilder = new StringBuilder(s);
        String str = stringBuilder.reverse().toString();


       for(int i =0; i<str.trim().length(); i++){

           b = Character.isWhitespace(str.trim().toCharArray()[i]);
           if(b == true){
               break;
           }

           st = st +str.trim().toCharArray()[i];
           System.out.println(st);
       }

        StringBuilder stBld =new StringBuilder(st);
        str = stBld.reverse().toString();

        return str.length();
    }

    class Solution {
        public int lengthOfLastWord(String s) {
            if (s == null || s.length() == 0) return 0;

            int result = 0, i = s.length() - 1;

            while (i >= 0 && s.charAt(i) == ' ') i--;   // Skip all whitespaces at the end of s.

            while (i >= 0 && s.charAt(i) != ' ') {      // Count the number of consecutive non-whitespace characters.
                result++;
                i--;
            }
            return result;
        }
    }
}
