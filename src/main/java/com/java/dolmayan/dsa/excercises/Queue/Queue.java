package com.java.dolmayan.dsa.excercises.Queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }


    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }


    public void printQueue(){

        if(length==0) return;
        Node newNode = first;
        while(newNode != null){
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }
    public void getFirst() {
        if (first == null) {
            System.out.println("First: null");
        } else {
            System.out.println("First: " + first.value);
        }
    }

    public void getLast() {
        if (last == null) {
            System.out.println("Last: null");
        } else {
            System.out.println("Last: " + last.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
    public void enQueue(int value){
        Node newNode = new Node(value);
        if(length==0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void deQueue(){
        Node temp = first;
        if(length == 1) {
            first = null;
            last = null;
        }else{
            temp = first.next;
            first = temp;
        }
        length--;
    }
}
