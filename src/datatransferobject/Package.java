package datatransferobject;

import java.io.Serializable;

/**
 *
 * @author Julen
 * Class that contains the User that sign up or sign in and the MessageEnum.
 */
public class Package implements Serializable {
    
    private User user;
    private MessageEnum message;

    public Package() {
    }

    public Package(User user, MessageEnum message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MessageEnum getMessage() {
        return message;
    }

    public void setMessage(MessageEnum message) {
        this.message = message;
    }
    
    public void getDatos(User user, MessageEnum message) {
        this.user = user;
        this.message = message;
    }
    
    
}
