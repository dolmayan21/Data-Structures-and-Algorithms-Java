package com.java.dolmayan.dsa.recursion;

public class FibonacciRecursion {

    public static void main(String[] args) {
        System.out.println( fibonacci(14));
    }
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            System.out.println(fibonacci(n-1) + fibonacci(n-2));
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}