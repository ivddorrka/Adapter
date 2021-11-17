package twitter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private int lastActiveTime;

    public TwitterUser() {
    }
}