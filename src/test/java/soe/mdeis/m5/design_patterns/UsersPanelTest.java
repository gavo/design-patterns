package soe.mdeis.m5.design_patterns;

import org.junit.jupiter.api.Test;
import soe.mdeis.m5.design_patterns.view.UsersPanel;

public class UsersPanelTest {
    @Test
    void show_users_v1(){
        var panel = new UsersPanel();
        panel.show();
    }

}
