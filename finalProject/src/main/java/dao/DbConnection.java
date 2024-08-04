package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection myconnection() throws SQLException {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
            System.out.println("Connected to database: " + con);

            // Test query to verify connection
            con.createStatement().executeQuery("SELECT 1 FROM dual");
            System.out.println("Test query executed successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load the JDBC driver.");
            e.printStackTrace();
            throw new SQLException("Failed to load the JDBC driver.", e);
        } catch (SQLException e) {
            System.out.println("Failed to establish a database connection.");
            e.printStackTrace();
            throw e; // Rethrow SQLException to handle in calling code
        }
        return con;
    }
}
