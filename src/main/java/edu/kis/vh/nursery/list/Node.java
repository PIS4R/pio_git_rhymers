package edu.kis.vh.nursery.list;

public class Node {

    protected final int value;

    private Node next, prev;

    protected Node(int i) {
        value = i;
    }
    protected Node getPrev() {
        return prev;
    }

    protected void setPrev(Node prev) {
        this.prev = prev;
    }

    protected Node getNext() {
        return next;
    }

    protected void setNext(Node next) {
        this.next = next;
    }
}
