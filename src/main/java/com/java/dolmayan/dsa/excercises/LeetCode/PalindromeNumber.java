package com.java.dolmayan.dsa.excercises.LeetCode;

import com.java.dolmayan.dsa.excercises.List.DoublyLinkedList;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashMap;

public class PalindromeNumber {
    public static void main(String [] args){


    }

    public boolean isPalindrome(int x) {
        ArrayList<Character> arr = new ArrayList<>();

        String temp = String.valueOf(x);
        int n = temp.length();

            for (int i = 0; i<n%2; i++) {
                if (temp.charAt(i) == temp.charAt(n - i - 1)) return true;
            }

                return false;

    }
}
