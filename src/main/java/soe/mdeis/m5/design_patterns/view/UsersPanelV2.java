package soe.mdeis.m5.design_patterns.view;

import soe.mdeis.m5.design_patterns.aggregate.Aggregate;
import soe.mdeis.m5.design_patterns.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class UsersPanelV2 {
    private final List<Aggregate<?>> aggregates;

    public UsersPanelV2(Aggregate<?>... list) {
        aggregates = new ArrayList<>();
        for (Aggregate<?> a : list) {
            aggregates.add(a);
        }
    }

    public void addAggregate(Aggregate<?> aggregate) {
        this.aggregates.add(aggregate);
    }

    public void show() {
        aggregates.forEach(a -> this.showItems(a.createIterator()));
    }

    private void showItems(Iterator<?> iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
