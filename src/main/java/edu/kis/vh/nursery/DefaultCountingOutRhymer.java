package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int TOTAL = -1;
    private static final int EMPTY = -1;
    private static final int FULL = MAX_SIZE - 1;
    private static final int ERR_CODE = -1;
    private final int[] numbers = new int[MAX_SIZE];
    private int total = TOTAL;
    //TODO: Not used mehod, generate warnings
    private int getTotal() {
        return total;
    }

    /**
     * @param in object to put inside array of numbers in index of total
     * @return void
     */
    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return 1 if total is empty, 0 in another case
     */
    protected boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * @return 1 if total is full, 0 in another case
     */
    protected boolean isFull() {
        return total == FULL;
    }

    /**
     * @return element of array numbers on index total
     */
    protected int peekaboo() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total];
    }

    /**
     * @return element of array numbers on index total with decrement
     */
    protected int countOut() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total--];
    }
}
