package soe.mdeis.m5.design_patterns.aggregate;

import soe.mdeis.m5.design_patterns.iterator.Iterator;

public interface Aggregate<T extends Iterator<?>> {

    T createIterator();
}
