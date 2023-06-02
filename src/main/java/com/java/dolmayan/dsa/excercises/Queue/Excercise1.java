package com.java.dolmayan.dsa.excercises.Queue;

public class Excercise1 {


        public static void main(String[] args) {
            // Create a new queue
            MyQueue q = new MyQueue();

            // Enqueue some values
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);

            // Output the front of the queue
            System.out.println("Front of the queue: " + q.peek());

            // Check if the queue is empty
            System.out.println("Is the queue empty? " + q.isEmpty());


        }


}
