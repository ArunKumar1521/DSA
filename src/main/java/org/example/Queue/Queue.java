package org.example.Queue;

public class Queue {
    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
       if(isFull()){
           System.out.println("The queue is full");
       } else {
           queue[rear] = data;
           rear = (rear + 1) % 5;
           size = size + 1;
       }
    }
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int data = queue[front];
            front = (front + 1) % 5;
            size = size - 1;
            return data;
        }

    }
    public void show(){
        for(int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }
    public boolean isFull(){
        return getSize() == 5;
    }
}
