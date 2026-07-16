package LinkedList;

class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    node head;
    node tail;
    int size;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public boolean append(int data) {
        node n = new node(data);

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

        node temp = head;
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