import java.sql.*;

public class kod {

    private static Connection getH2Connection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = getH2Connection();
        System.out.println(conn.isClosed());

    }
}

