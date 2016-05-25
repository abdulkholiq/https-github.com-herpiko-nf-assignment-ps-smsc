/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class DB {

    private Connection con;

    public DB() {
        initDB();
    }

    public void initDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/gammu";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "root");

        } catch (Exception ee) {
            System.out.println("Failed to connect to database");
            ee.printStackTrace();
        }
    }

    public Connection getConnection() {
        try {
            if (this.con != null || this.con.isClosed()) {
                this.initDB();
            }
        } catch (SQLException ee) {
            ee.printStackTrace();
        }
        return this.con;
    }

    public void closeConnection() {
        try {
            if (this.con != null) {
                this.con.close();
            }
        } catch (SQLException ee) {
            System.out.println("Failed to close MySQL Connection");
            ee.printStackTrace();
        }
    }

}
