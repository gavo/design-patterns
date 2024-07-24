package soe.mdeis.m5.design_patterns.aggregate;

import soe.mdeis.m5.design_patterns.api.GoogleApiClient;
import soe.mdeis.m5.design_patterns.iterator.GoogleUserIterator;

public class GoogleAggregate implements Aggregate<GoogleUserIterator> {

    @Override
    public GoogleUserIterator createIterator() {
        var client = new GoogleApiClient();
        return new GoogleUserIterator(client.getGoogleUsers());
    }
}
