package com.java.dolmayan.dsa.excercises.stack;

public class Excercise3 {

    public static void sortStack(StackE1 stack){



    }

    public static void main(String[] args) {
        StackE1<Integer> stack = new StackE1<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }

}

