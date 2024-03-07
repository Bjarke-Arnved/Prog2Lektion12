package opgave02.models;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private int from;
    private int to;
    private int current;
    public RangeIterator(int from, int to) {
        this.from = from;
        this.to = to;
        this.current = from;
    }
    @Override
    public boolean hasNext() {
        boolean hasNext;
        if(current <= to) {
            hasNext = true;
        }
        else {
            hasNext = false;
        }
        return hasNext;
    }

    @Override
    public Integer next() {
        return current++;
    }
}
