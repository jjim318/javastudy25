package mvc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Connection conn = null;

        String url = "jdbc:mysql://192.168.111.102:3306/booktest";
        String user = "book";
        String password = "book1234";

        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("1단계 ok");
        conn = DriverManager.getConnection(url, user, password);
        System.out.println("2단계 ok");

        return conn;

    }
}
