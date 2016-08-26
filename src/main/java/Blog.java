import java.util.ArrayList;
import java.util.List;

/**
 * Created by sboob on 5/21/2016.
 */
public class Blog implements Subject {

    List<Observer> registeredUser;
    String message;

    public Blog() {
        this.registeredUser = new ArrayList<Observer>();
        message="";
    }


    public boolean register(Observer newUser) {
        if (newUser instanceof User) {
            User tempUser = (User) newUser;
            System.out.println("New User" + tempUser.getUserName() + " added ");
        }
        return registeredUser.add(newUser);
    }

    public boolean deRegister(Observer deleteUser) {
        if (deleteUser instanceof User) {
            User temp = (User) deleteUser;
            System.out.println(" User" + temp.getUserName() + " removed ");
        }
        return registeredUser.remove(deleteUser);
    }

    public void notifying() {
        for (int i=0;i<registeredUser.size();i++){
            registeredUser.get(i).update(message);
        }
    }

    public void addNewBlog(String newMessage){
        message=newMessage;
        notifying();
    }
}
