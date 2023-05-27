package com.java.dolmayan.dsa.excercises.stack;

import javax.swing.*;

public class Stack {

    private Node top;
    private int height;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }



    class Node{

        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public void printlist(){
        Node temp = top;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;

        }

    }


}
