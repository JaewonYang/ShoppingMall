package kr.ac.jejuuniv.userdao;
/**
 * Created by Jaewon on 2015-04-10.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DeleteUserStatementStrategy implements StatementStrategy {

    private String id;

    @Override
    public PreparedStatement makeStatement(Object obj, Connection connection) throws SQLException {
        String sql = "DELETE FROM userinfo WHERE id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, id);
        preparedStatement.executeUpdate();
        return null;
    }

    @Override
    public StatementStrategy deleteStatement() {
        return null;
    }
}
