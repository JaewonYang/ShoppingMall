package kr.ac.jejunu;

/**
 * Created by Jaewon on 2015-03-20.
 */
import org.junit.*;

public class UserDaaTest {
    @test
    public void get(){
        UserDao userDao = new UserDao();
        String id = "hulk";
        String name = " 허윤호";
        String password = "1111";

        User user = userDao.get(id);
        assertEquals(id, user.getid());
    }



}
