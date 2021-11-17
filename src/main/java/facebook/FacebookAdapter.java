package facebook;

import user.User;

public class FacebookAdapter implements User {

    private final FacebookUser facebookuser;

    public FacebookAdapter(FacebookUser user) {
        facebookuser = user;
    }

    @Override
    public String getCountry() {
        return facebookuser.getUserCountry();
    }

    @Override
    public int getLastActiveTime() {
        return facebookuser.getUserActiveTime();
    }

    @Override
    public String getEmail() {
        return facebookuser.getEmail();
    }
}