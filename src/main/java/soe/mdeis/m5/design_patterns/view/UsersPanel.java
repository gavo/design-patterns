package soe.mdeis.m5.design_patterns.view;

import soe.mdeis.m5.design_patterns.api.FacebookApiClient;
import soe.mdeis.m5.design_patterns.api.GoogleApiClient;
import soe.mdeis.m5.design_patterns.model.FacebookUser;
import soe.mdeis.m5.design_patterns.model.GoogleUser;

import java.util.List;

public class UsersPanel {

    private final GoogleApiClient googleApiClient;
    private final FacebookApiClient facebookApiClient;

    public UsersPanel() {
        this.facebookApiClient = new FacebookApiClient();
        this.googleApiClient = new GoogleApiClient();
    }

    public void show() {
        GoogleUser[] googleUsers = this.googleApiClient.getGoogleUsers();

        for (int i = 0; i < googleUsers.length; i++) {
            System.out.println(googleUsers[i]);
        }

        List<FacebookUser> facebookUsers = this.facebookApiClient.getFacebookUsers();
        for (var facebookUser : facebookUsers) {
            System.out.println(facebookUser);
        }
    }
}
