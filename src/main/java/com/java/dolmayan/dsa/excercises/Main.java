package com.java.dolmayan.dsa.excercises;


public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);

        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        myDLL.append(4);
        myDLL.append(3);
        myDLL.append(2);
        myDLL.append(1);







        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

        myDLL.reverse();

        System.out.println("\nNew Doubly Linked List:");
        myDLL.printList();

        System.out.println("\nIs this palindrome ? :" + myDLL.isPalindrome());


    }

}