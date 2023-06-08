package com.java.dolmayan.dsa.excercises.LeetCode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;

public class RomanToInt {

    public static void main(String[] args ){
        String s= "MDLVIII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {

        ArrayList<Integer> arr = new ArrayList<>();
        Integer sum = 0;
        Integer count = 0;

        for( char a : s.toUpperCase().toCharArray()){
            int temp = (a =='I')? 1 : (a =='V')? 5 :(a =='X')? 10 : (a =='L')? 50 :(a =='C')? 100 :
                    (a =='D')? 500 : 1000;
            arr.add(temp);  ///   xix
        }
        for(int i= 0; i<arr.size(); i++){

            if(i > 0){
                if(arr.get(i) == arr.get(i-1)){
                    if((arr.get(i) == 5 || arr.get(i) == 50 || arr.get(i) == 500) && (arr.get(i-1) == 5 || arr.get(i-1) == 50 || arr.get(i-1) == 500)){
                        return 0;
                    }else{
                        count += 1;
                        if(count == 3){
                            return 0;
                        }
                    }
                }else{
                    count = 0;
                }

                if(arr.get(i - 1) < arr.get(i)){
                    sum = sum - arr.get(i-1) + ( arr.get(i) - arr.get(i - 1)  );
                }else {
                    sum = arr.get(i) + sum;
                }
            }else {
                sum = arr.get(i);
            }
        }
        return sum;
    }
}
