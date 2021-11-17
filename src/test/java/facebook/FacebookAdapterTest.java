package facebook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacebookAdapterTest {

    FacebookUser facebookuser;
    FacebookAdapter adaptuser;


    @BeforeEach
    void setUp() {
        facebookuser = new FacebookUser("ivddorrka@gmail.com", "Ukraine", 0);
        adaptuser = new FacebookAdapter(facebookuser);
    }

    @Test
    void getCountry() {
        assertEquals(facebookuser.getUserCountry(), adaptuser.getCountry());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(facebookuser.getUserActiveTime(), adaptuser.getLastActiveTime());
    }

    @Test
    void getEmail() {
        assertEquals(facebookuser.getEmail(), adaptuser.getEmail());
    }
}