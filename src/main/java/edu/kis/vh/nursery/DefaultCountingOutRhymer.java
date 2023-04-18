package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int TOTAL = -1;
    public static final int MINUS_JEDEN = -1;
    public static final int JEDENASCIE = 11;
    private int[] numbers = new int[MAX_SIZE];

    public int total = TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_JEDEN;
    }

    public boolean isFull() {
        return total == JEDENASCIE;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
