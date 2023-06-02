package com.java.dolmayan.dsa.excercises.Queue;


import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int value) {
        // Transfer elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        // Push the new value onto stack1
        stack1.push(value);
        // Transfer elements back from stack2 to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    public Integer dequeue() {
        // Check if the queue is empty
        if (isEmpty()) {
            // Return null if the queue is empty
            return null;
        } else {
            // Remove and return the front of the queue
            return stack1.pop();
        }
    }
    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
