package com.java.dolmayan.dsa.excercises.stack;

public class Excercise1 {

        public  static String reversedString(String string){

           StackE1<Character> stack = new StackE1<>();
           String reversedString  = "";

           for(char c: string.toCharArray()){
               stack.push(c);
           }
           while(!stack.isEmpty()){
               reversedString  += stack.pop();
           }
            return reversedString ;
        }



        public static void main(String[] args) {

            String myString = "hello";
            String reversedString = reversedString(myString);
            System.out.println("\nOriginal string:  " +myString);
            System.out.println("\nThat's the reversed string: "+ reversedString);


        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

        }

    }
