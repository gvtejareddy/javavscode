package Overseas;

import java.util.LinkedList;

public class LinkedListOwn {


    Node head;
    static class Node {
        int value;
    
        // connect each node to next node
        Node next;
    
        Node(int d) {
          value = d;
          next = null;
        }
    }
    public static void main(String[] args) {
        LinkedListOwn linkedListOwn = new LinkedListOwn();
        linkedListOwn.head=new Node(0);
        Node nodeOne = new Node(2);
        Node nodeThree = new Node(3);
        linkedListOwn.head.next = nodeOne;
        nodeOne.next = nodeThree;
    }
}
