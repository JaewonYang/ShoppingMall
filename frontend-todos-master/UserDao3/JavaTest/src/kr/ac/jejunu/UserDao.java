package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jaewon on 2015-03-20.
 */
public class UserDao {

    public User get(String id) throws ClassNotFoundException,SQLException{
        Connection connection = getConnection();
        String spl = "select id, name, password, from userinfo where id = ?";
        PreparedStatement preparedStatement= connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        User user = new User();
        user.setId( );



        Class.forName();

        Connection connection =
        
        
    }

    private Connection getConnection() throws ClassNotFoundException{

    }
}
