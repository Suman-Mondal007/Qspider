package LinkedList;

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public boolean append(int data) {
        Node n = new Node(data);

        if (isEmpty()) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }

        size++;
        return true;
    }

    public void printElement() {
        if (isEmpty()) {
            System.out.println("Nothing");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displaySize() {
        System.out.println("Size = " + size);
    }
}

public class Example {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);

        list.printElement();
        list.displaySize();
    }
}