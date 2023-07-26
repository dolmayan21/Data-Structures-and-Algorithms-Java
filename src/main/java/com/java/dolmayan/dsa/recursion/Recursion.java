package com.java.dolmayan.dsa.recursion;

public class Recursion {

    public static void main(String[] args) {
        char [] str = {'h','e','l','l', 'o'};
        printReverse(str);
    }
    private static void printReverse(char [] str) {

        helper(0, str);
    }

    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }

}
