package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public  static Connection createConnection() {
        try {
            String DATABASE_URL = "jdbc:mysql://localhost:3306/StudentExample_s21";
            String user ="root";
            String pWord = "password";
            Connection conn = DriverManager.getConnection(DATABASE_URL, user, pWord);
            return conn;
        } catch (Exception except) {
            except.printStackTrace();
            return null;
        }
    }
}
