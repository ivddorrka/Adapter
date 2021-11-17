package sender;
import user.User;

public class MessageSender {
    public String send(String text, User user, String country) {
        if (user.getCountry().equals(country)) {
            return "Message sent: " + text;
        }
        return "Error happened!!";
    }
}