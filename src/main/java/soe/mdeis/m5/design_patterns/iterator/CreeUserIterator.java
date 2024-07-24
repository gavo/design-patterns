package soe.mdeis.m5.design_patterns.iterator;

import soe.mdeis.m5.design_patterns.model.CREUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CreeUserIterator implements Iterator<CREUser> {

    private final List<CREUser> users;
    private int currentPosition = 0;

    public CreeUserIterator(Map<Integer, CREUser> users) {
        this.users = new ArrayList<>(users.values());
    }

    @Override
    public CREUser next() {
        return users.get(currentPosition++);
    }

    @Override
    public boolean isDone() {
        return currentPosition >= users.size();
    }

    @Override
    public CREUser currentItem() {
        if(currentPosition >= users.size()){
            throw new NoSuchElementException();
        }
        return users.get(currentPosition);
    }
}
