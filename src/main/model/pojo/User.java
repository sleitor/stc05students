package main.model.pojo;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public class User {
    private int id;
    private String login;
    private String password;
    private boolean isBlocked;

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public User(int id, String login, String password, boolean isBlocked) {

        this.id = id;
        this.login = login;
        this.password = password;
        this.isBlocked = isBlocked;
    }
}
