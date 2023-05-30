package com.java.dolmayan.dsa.excercises.stack;

import javax.swing.*;

public class MainStack {

    public static void main(String[] args){

        Stack myStack = new Stack(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);

        System.out.println("The node deleted is:  " + myStack.pop().value);

        myStack.printStack();

    }


}
