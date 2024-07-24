package soe.mdeis.m5.design_patterns.aggregate;

import soe.mdeis.m5.design_patterns.api.CREApiClient;
import soe.mdeis.m5.design_patterns.iterator.CreeUserIterator;

public class CREAggregate implements Aggregate<CreeUserIterator> {

    private final CREApiClient creApiClient;

    public CREAggregate() {
        this.creApiClient = new CREApiClient();
    }

    @Override
    public CreeUserIterator createIterator() {
        return new CreeUserIterator(this.creApiClient.getCREUsersMap());
    }
}
