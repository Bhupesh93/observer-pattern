/**
 * Created by sboob on 5/21/2016.
 */
public class ObserverDesignPattern {

    public static void main(String arg[]){

        Blog blog =new Blog();
        Observer user1=new User("user1",blog);
        Observer user2=new User("user2",blog);
        Observer user3=new User("user3",blog);

        blog.addNewBlog("first message 1");
        blog.addNewBlog("first message 2");
        blog.addNewBlog("first message 3");
        blog.addNewBlog("first message 4");


    }
}
