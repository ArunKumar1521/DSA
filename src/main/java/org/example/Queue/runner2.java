package org.example.Queue;

public class runner2 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.deQueue();
        queue.show();
        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
    }
}
