package soe.mdeis.m5.design_patterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import soe.mdeis.m5.design_patterns.api.GoogleApiClient;
import soe.mdeis.m5.design_patterns.iterator.GoogleUserIterator;

public class GoogleUserIteratorTest {
    @Test
    void functional_test() {
        var googleClient = new GoogleApiClient(); // 2 users
        var iterator = new GoogleUserIterator(googleClient.getGoogleUsers());
        Assertions.assertFalse(iterator.isDone());

        Assertions.assertNotNull(iterator.next());
        Assertions.assertFalse(iterator.isDone());

        Assertions.assertNotNull(iterator.next());
        Assertions.assertTrue(iterator.isDone());

        Assertions.assertNotNull(iterator.currentItem());
    }
}
