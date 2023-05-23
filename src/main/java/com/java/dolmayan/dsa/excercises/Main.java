package com.java.dolmayan.excercises;


public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();
        myDLL.append(3);
        myDLL.append(4);

        System.out.println("\nNode removed:  " + myDLL.removeLast().value);
        myDLL.prepend(1);

        System.out.println("\nNew Doubly Linked List:");
        myDLL.printList();


    }

}