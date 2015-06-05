package kr.ac.jejunu;

import org.junit.Test;

/**
 * Created by Jaewon on 2015-03-20.
 */
//import static org.junit.*;
public class UserDaoTest {
    @Test
    public void get(){
        UserDao userDao = new UserDao();
        String id = "hulk";
        String name = "허윤호";
        String password= "1111";

        User user = userDao.get(id);

        assertEquals(id, user.getid());
        assertEquals(name, user.getName());
        assertEquals(password, user.getPassword());
    }
    @Test
    public void add(){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(passoword);

        UserDao userDao = new UserDaoTest();
        userDao.add(user);
        User addedUser = userDao.get(id);

        assertEquals(id, user.getid());
        assertEquals(name, user.getName());
        assertEquals(password, user.getPassword());

    }
}
