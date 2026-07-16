package LinkedList;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList1 {
    Node1 head;
    Node1 tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public boolean append(int data) {
        Node1 n = new Node1(data);

        if (isEmpty()) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }

        size++;
        return true;
    }

    // Delete first node
    public boolean delete() {
        if (isEmpty()) {
            System.out.println("Nothing to delete");
            return false;
        } else if (head == tail) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
        return true;
    }

    public void printElement() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node1 temp = head;

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

public class DeleteElement {
    public static void main(String[] args) {

        SinglyLinkedList1 list = new SinglyLinkedList1();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Before Delete:");
        list.printElement();
        list.displaySize();

        list.delete();

        System.out.println("\nAfter Delete:");
        list.printElement();
        list.displaySize();
    }
}