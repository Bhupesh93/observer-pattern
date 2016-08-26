/**
 * Created by sboob on 5/21/2016.
 */
public class User implements Observer {
    static int userId;
    Subject blog;
    String userName;

    public User(String userName,Subject blog) {
        this.userName = userName;
        this.blog =blog;
        blog.register(this);
    }


    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        User.userId = userId;
    }

    public String getUserName() {
        return userName;

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void update(String message) {
        System.out.println("the user "+userName +" got "+message );
    }
}
