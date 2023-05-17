package edu.kis.vh.nursery.list;
//TODO Class not used anywhere, generate warnings
public class IntLinkedList {

    private static final int ERR_CODE = -1;
    private Node last;
    // TODO: Not used variable, should think about removing it
    private int i;
    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    private boolean isEmpty() {
        return last == null;
    }
    // TODO: Not used variable, should think about removing it
    private boolean isFull() {
        return false;
    }
    // TODO: Not used method, should think about removing it
    private int top() {
        if (isEmpty())
            return ERR_CODE;
        return last.value;
    }
    // TODO: Not used method, should think about removing it
    private int pop() {
        if (isEmpty())
            return ERR_CODE;
        int ret = last.value;
        last = last.getPrev();
        return ret;
    }
}
class Node {

    protected final int value;
    private Node next, prev;
    // TODO: use more adequate name insted of i, maybe iterator
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

