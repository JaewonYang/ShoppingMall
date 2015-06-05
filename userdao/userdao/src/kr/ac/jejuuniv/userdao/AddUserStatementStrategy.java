package kr.ac.jejuuniv.userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Jaewon on 2015-04-10.
 */
public class AddUserStatementStrategy implements StatementStrategy {
    @Override
    public PreparedStatement makeStatement(Object obj, Connection connection) throws SQLException {
        String sql = "INSERT INTO userinfo(id, name, password) VALUES(?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        User user = (User) obj;

        preparedStatement.setString(1, user.getId());
        preparedStatement.setString(2, user.getName());
        preparedStatement.setString(3, user.getPassword());

        return preparedStatement;

    }
}
