/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author IT
 */
public class ConnectionDB {
    // Register Oracle JDBC driver
            

            // Connect to the database
            private static final String url = "jdbc:oracle:thin:@localhost:1521:BUDGET"; // Replace with your database URL
            private static final String username = "BUDGETMASTER";
            private static final String password = "24money";
            
            public static Connection connection ;
            
            public static Connection getConnection(){
                try{
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    connection = DriverManager.getConnection(url, username, password);
                }catch (ClassNotFoundException | SQLException e) {
                     e.printStackTrace();
                }
                return connection;
            }
}
