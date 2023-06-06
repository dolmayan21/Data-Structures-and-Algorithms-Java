package com.java.dolmayan.dsa.excercises.LeetCode;

public class longestCommonPrefix14 {

    public static void main(String [] args){

    String [] strs = {"Cat", "Cartrtrtr"};

        System.out.println(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        String concat = "";

        char[] temp = {};
        for(String str : strs) {
            for (char s : str.toCharArray()) {

                if (!concat.equals("")) {
                    temp = concat.toCharArray();
                    concat = "";
                        for( char conc : temp){

                            if(s == conc){
                                concat += conc;
                            }else{
                                break;
                            }

                        }



                }else{
                    concat = str;
                    break;
                }

            }


        }
        return concat;
    }
}
