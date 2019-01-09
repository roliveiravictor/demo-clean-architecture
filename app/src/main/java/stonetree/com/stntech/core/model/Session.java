package stonetree.com.stntech.core.model;

public class Session {

    private static Session session;

    private User user = new User();

    public static Session getInstance() {
        if (session == null)
            session = new Session();

        return session;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void purge() {
        this.user = null;
    }
}
