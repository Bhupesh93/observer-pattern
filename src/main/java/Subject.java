/**
 * Created by sboob on 5/21/2016.
 */
public interface Subject {

    public boolean register(Observer observer);
    public boolean deRegister(Observer observer);
    public void notifying();
}
