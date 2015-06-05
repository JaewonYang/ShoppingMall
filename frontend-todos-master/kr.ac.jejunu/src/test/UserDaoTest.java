package test;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Jaewon on 2015-03-27.
 */
public class UserDaoTest {
    @Test
    public void get(){
        UserDao userDao = new UserDao();
        String id = "1";
        User user = userDao.get(id);
//        Assert user = userDao.get(id);
        assertEquals("1", user.getId());
        assertEquals("1234", user.getPassword());
    }
}
