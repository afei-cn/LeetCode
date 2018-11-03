import java.util.Iterator;

/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月3日
 */

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator<T> implements Iterator<T> {

    private Iterator<T> mIterator;
    private T next;

    public PeekingIterator(Iterator<T> iterator) {
        // initialize any member here.
        this.mIterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public T peek() {
        if (next == null && mIterator.hasNext()) {
            next = mIterator.next();
        }
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public T next() {
        if (next == null) {
            return mIterator.next();
        } else {
            T temp = next;
            next = null;
            return temp;
        }
    }

    @Override
    public boolean hasNext() {
        return next != null || mIterator.hasNext();
    }
}