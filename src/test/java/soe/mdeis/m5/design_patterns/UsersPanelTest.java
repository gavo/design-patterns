package soe.mdeis.m5.design_patterns;

import org.junit.jupiter.api.Test;

import soe.mdeis.m5.design_patterns.aggregate.FacebookAggregate;
import soe.mdeis.m5.design_patterns.aggregate.GoogleAggregate;
import soe.mdeis.m5.design_patterns.view.UsersPanel;
import soe.mdeis.m5.design_patterns.view.UsersPanelV2;

public class UsersPanelTest {
    @Test
    void show_users_v1() {
        var panel = new UsersPanel();
        panel.show();
    }

    @Test
    void show_users_v2() {
        var panel = new UsersPanelV2(new FacebookAggregate());
        panel.addAggregate(new GoogleAggregate());

        panel.show();
    }

}
