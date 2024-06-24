package org.example.linkedlist;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LInkedList list = new LInkedList();
        list.insert(5);
        list.insert(3);
        list.insert(4);
        list.insert(9);
        list.insertAtStart(1);
        list.insertAt(0,11);
        list.deleteAt(2);

        list.show();

    }
}
