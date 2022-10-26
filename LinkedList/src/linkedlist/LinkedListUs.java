package linkedlist;

import java.util.LinkedList;

public class LinkedListUs {

    // Properties
    Node head;
    int count;

    // Constructors
    /*public LinkedList() {
        head = null;
        count = 0;
    }*/
    public LinkedListUs(Node newHead) {
        head = newHead;
        count = 1;
    }

    // Methods
    // get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(temp);
        count++;
    }

    // size
    public int size() {
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // remove
    public void remove() {
        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Alice");
        System.out.println(linkedList);
        linkedList.add("Alicery");
        System.out.println(linkedList);
    }
}
