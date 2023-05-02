
package thuvien.classes.ThuVien.helper;

import java.sql.*;

public class XJdbc {

    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433;databasename=ThuVien";
    static String user = "sa";
    static String password = "123";

    static {
        try {
            Class.forName(driver);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static PreparedStatement getStmt(String sql, Object... agrs) throws SQLException {
        Connection cn = DriverManager.getConnection(url, user, password);
        PreparedStatement stmt;

        if (sql.trim().startsWith("{")) {
            stmt = cn.prepareCall(sql);
        } else {
            stmt = cn.prepareStatement(sql);
        }

        for (int i = 0; i < agrs.length; i++) {
            stmt.setObject(i + 1, agrs[i]);
        }
        return stmt;
    }

    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = XJdbc.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet query(String sql, Object... agrs) throws SQLException {
        PreparedStatement stmt = XJdbc.getStmt(sql, agrs);
        return stmt.executeQuery();
    }

    public static Object value(String sql, Object... agrs) {
        try {
            ResultSet result = XJdbc.query(sql, agrs);
            if (result.next()) {
                return result.getObject(0);
            }
            result.getStatement().getConnection().close();
            return null;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
