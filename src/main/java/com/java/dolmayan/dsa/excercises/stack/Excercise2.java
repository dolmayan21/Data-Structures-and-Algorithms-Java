package com.java.dolmayan.dsa.excercises.stack;

public class Excercise2 {

    public static boolean isBalancedParentheses(String string){

        StackE1 stack = new StackE1();
        StackE1 stack2 = new StackE1();



        for(char c: string.toCharArray()){

            if(Character.compare(c, ')') == 0){
                stack.push(c);
            }else{
                stack2.push(c);
            }
        }

        if(stack2.size() == stack.size()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "()()()";
        String s2 = "()(()";
        String s3 = "(()())";
        System.out.println(isBalancedParentheses(s1)); // true
        System.out.println(isBalancedParentheses(s2)); // false
        System.out.println(isBalancedParentheses(s3)); // true

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
        */
    }

}
