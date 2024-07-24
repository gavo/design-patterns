package soe.mdeis.m5.design_patterns.aggregate;

import soe.mdeis.m5.design_patterns.api.FacebookApiClient;
import soe.mdeis.m5.design_patterns.iterator.FacebookUserIterator;

public class FacebookAggregate implements Aggregate<FacebookUserIterator> {

    private final FacebookApiClient facebookApiClient;

    public FacebookAggregate() {
        facebookApiClient = new FacebookApiClient();
    }

    @Override
    public FacebookUserIterator createIterator() {
        return new FacebookUserIterator(facebookApiClient.getFacebookUsers());
    }
}
