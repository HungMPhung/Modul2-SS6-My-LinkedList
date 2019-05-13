package com.codegym;
public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("~~~~ TESTING ~~~~`");
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(13);
        linkedList.addFirst(12);

        linkedList.add(4,8);
        linkedList.add(5,9);
        linkedList.printList();
    }
}
