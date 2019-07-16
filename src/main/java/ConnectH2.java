import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.IOException;
import java.util.Scanner;

public class ConnectH2 {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test",
                "sa", "");
        Statement st = null;
        st = conn.createStatement();

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("@STAFF>");
            String comand = in.nextLine();
            ResultSet result;
            result = st.executeQuery(comand);
            while (result.next()) {
                System.out.println(result);
            }


        }
    }

}
