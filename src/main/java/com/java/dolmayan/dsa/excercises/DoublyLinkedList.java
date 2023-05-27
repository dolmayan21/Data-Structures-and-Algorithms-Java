package com.java.dolmayan.dsa.excercises;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        Node temp = tail;

        if(length== 0) return null;
        if(length== 1){
            head = null;
            tail = null;

        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node temp = new Node(value);

        if(length == 0){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        length++;
    }

    public Node removeFirst(){

        if(length == 0) return null;
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){

        if(index < 0 || index>= length){return null;}

        Node temp = head;

        if(index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i=length-1; i>index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public void swapFirstLast(){
        int temp;
        temp = head.value;
        head.value = tail.value;
        tail.value = temp;

    }

    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    public boolean isPalindrome() {
        if (length <= 1) return true;

        int index = 0;
        Node first = head;
        Node second = tail;

        while (index < length/2) {

            if(first.value != second.value){
                return false;
            }
            first = first.next;
            second = second.prev;
            index ++;
        }
        return true;
    }

    public void swapPairs(){

        if(length<=1)return;
        int val = head.value;
        Node current = head;

        while(current.next.next !=null){

            current.value = current.next.value;
            current.next.value = val;

            current = current.next.next;
            val = current.value;

        }
        current.value = current.next.value;
        current.next.value = val;
    }


}
