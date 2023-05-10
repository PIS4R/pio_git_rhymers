package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int TOTAL = -1;
    private static final int EMPTY = -1;
    private static final int FULL = MAX_SIZE - 1;
    private static final int ERR_CODE = -1;
    private final int[] numbers = new int[MAX_SIZE];
    private int total = TOTAL;
    private int getTotal() {
        return total;
    }
    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    protected boolean callCheck() {
        return total == EMPTY;
    }
    protected boolean isFull() {
        return total == FULL;
    }
    protected int peekaboo() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total];
    }
    protected int countOut() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total--];
    }
}
