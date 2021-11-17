package facebook;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String email;
    private String userCountry;
    private int userActiveTime;

    public FacebookUser() {
    }
}