package test;

/**
 * Created by Jaewon on 2015-03-27.
 */
public class User {
    private String id;
    private String name;
    private String password;

    public User(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
