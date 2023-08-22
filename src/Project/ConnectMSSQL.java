package Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMSSQL {

    public static Connection getCon() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=gym8;selectMethod=cursor;" + "encrypt=true;trustServerCertificate=true;", "sa", "123456");

            return con;
        } catch (Exception e) {
            return null;
        }
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
