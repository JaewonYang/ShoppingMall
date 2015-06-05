package kr.ac.jejuuniv.userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Jaewon on 2015-04-10.
 */
public interface StatementStrategy {

        public PreparedStatement makeStatement(Object obj, Connection connection) throws SQLException;

    StatementStrategy deleteStatement();
}
