package com.java.dolmayan.dsa.excercises.Queue;

public class Queue {

    private Node first;
    private Node last;
    private int lenght;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        lenght = 1;
    }


    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
}
