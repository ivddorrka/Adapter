package twitter;
import user.User;

public class TwitterAdapter implements User {

    private final TwitterUser user;

    public TwitterAdapter(TwitterUser twitterUser) {
        this.user = twitterUser;
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public int getLastActiveTime() {
        return user.getLastActiveTime();
    }
}