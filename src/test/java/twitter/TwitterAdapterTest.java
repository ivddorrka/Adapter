package twitter;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwitterAdapterTest {
    TwitterUser twitteruser;
    TwitterAdapter adaptuser;


    @BeforeEach
    void setUp() {
        twitteruser = new TwitterUser("ivddorrka@gmail.com", "Ukraine", 0);
        adaptuser = new TwitterAdapter(twitteruser);
    }

    @Test
    void getCountry() {
        assertEquals(twitteruser.getCountry(), adaptuser.getCountry());
    }

    @Test
    void getEmail() {
        assertEquals(twitteruser.getUserMail(), adaptuser.getEmail());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(twitteruser.getLastActiveTime(), adaptuser.getLastActiveTime());
    }
}