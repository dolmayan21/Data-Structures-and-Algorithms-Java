package com.java.dolmayan.dsa.excercises.List;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;


    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
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

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

     public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void  prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;

    }

    public Node get(int index){
        Node temp = head;
        if(index < 0 || index >= length ){ return null;}

        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){

        if(index < 0 || index > length ){ return false;}

        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;

        return true;
    }


    public Node remove(int index){

        if(index < 0 || index >= length ){ return null;}

        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();

            Node prev = get(index-1);
            Node temp = prev.next;

            prev.next = temp.next;
            temp.next = null;
            length--;
            return temp;

    }

    public void reverse(){

        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i=0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }
    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            System.out.println("This is slow---->" + slow.value);
            fast = fast.next.next;
            System.out.println("This is fast---->" + fast.value);
        }

        return slow;
    }


    public void reverseBetween(int m, int n) {
        if (head == null) return;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        for (int i = 0; i < m; i++) {
            prev = prev.next;
            System.out.println("prev.value:   " + prev.value);
        }

        Node current = prev.next;
        for (int i = 0; i < n - m; i++) {
            Node temp = current.next;
            current.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        head = dummy.next;
    }

    public void partitionList(int x) {
        if (head == null) return;

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;

        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }

        prev2.next = null;
        prev1.next = dummy2.next;

        head = dummy1.next;
    }
    public void removeDuplicates() {
        Node temp = new Node(0);

        Node current = head;
        temp.next = current;

        if(length == 0) return;

        while(temp.next != null){

            if(current.next != null){
                current = current.next;

                if(current.value == current.next.value ){
                    temp = temp.next;
                    current = current.next;


                }else{

                }



            }else{
                temp = temp.next;

            }





        }


    }







}
