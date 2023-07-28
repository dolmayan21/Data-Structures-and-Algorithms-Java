package com.java.dolmayan.dsa.recursion;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'F','I','S','I','C','A'};
        reverseString(s);

    }

    public static void reverseString(char[] s) {
        helper(0, s.length - 1, s);
    }

    private static void helper(int start, int end, char [] s) {
        if (start >= end) {
            return;
        }
        // swap between the first and the last elements.
        char tmp = s[start];
        s[start] = s[end];
        s[end] = tmp;

        helper(start + 1, end - 1, s);
    }
}
