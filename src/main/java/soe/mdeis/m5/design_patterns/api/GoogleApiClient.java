package soe.mdeis.m5.design_patterns.api;

import soe.mdeis.m5.design_patterns.model.GoogleUser;

public class GoogleApiClient {

    public GoogleUser[] getGoogleUsers() {
        GoogleUser[] users = new GoogleUser[2];
        users[0] = new GoogleUser("John", "john@one.com");
        users[1] = new GoogleUser("Doe", "jane@two.com");

        return users;
    }
}
