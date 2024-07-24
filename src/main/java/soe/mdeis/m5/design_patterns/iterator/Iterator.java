package soe.mdeis.m5.design_patterns.iterator;

public interface Iterator<T> {

    T next();
    boolean isDone();
    T currentItem();
}
