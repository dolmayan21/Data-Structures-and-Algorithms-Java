package com.java.dolmayan.dsa.excercises;


public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);

        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        myDLL.append(6);
        myDLL.append(7);
        myDLL.append(8);
        myDLL.append(9);
        myDLL.append(10);
        myDLL.append(11);
        myDLL.append(12);

        myDLL.append(13);
        myDLL.append(14);
        myDLL.append(15);
        myDLL.append(16);


        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

       // myDLL.reverse();

        //myDLL.swapPairs();
        System.out.println("\nNew Doubly Linked List:");
        myDLL.printList();

        //System.out.println("\nIs this palindrome ? :" + myDLL.isPalindrome());


    }

}