package kr.ac.jejuuniv.userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Jaewon on 2015-04-10.
 */
public class GetUserStatementStrategy implements StatementStrategy {

}

    @Override
    public PreparedStatement makeStatement(Object obj, Connection connection) throws SQLException {
        String sql = "SELECT id, name, password FROM userinfo WHERE id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, (String) obj);

        return preparedStatement;

    }
}
