package com.java.dolmayan.dsa.excercises.Queue;

public class MainQueue {

    public static void main(String [] args){

        Queue myQueue = new Queue(4);
        System.out.println("This is de Queue");
        myQueue.printQueue();

        myQueue.enQueue(5);
        myQueue.enQueue(6);
        myQueue.enQueue(7);

        System.out.println("This is de new Queue");
        myQueue.printQueue();

        myQueue.deQueue();

        System.out.println("This is de new Queue");
        myQueue.printQueue();


    }

}
