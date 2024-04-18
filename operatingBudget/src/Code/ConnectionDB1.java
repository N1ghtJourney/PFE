/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author IT
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB1 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        
        
        try {
            // Register Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect to the database
            String url = "jdbc:oracle:thin:@localhost:1521:BUDGET"; // Replace with your database URL
            String username = "BUDGETMASTER";
            String password = "24money";
            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connected to the database!");
                // Perform your database operations here
                 statement = connection.createStatement();

                // Execute a query
                String query = "SELECT * FROM UTILISATEUR"; // Replace with your table name
                resultSet = statement.executeQuery(query);
                if (!resultSet.isBeforeFirst()) {
                    System.out.println("No records found in the table.");
                } else {
                // Process the result set
                    while (resultSet.next()) {
                        // Assuming your_table has columns named "column1", "column2", etc.
                        String column1Value = resultSet.getString("username");
                        String column2Value = resultSet.getString("password");
                        // Display or process the retrieved values as needed
                        System.out.println("nom: " + column1Value + ", prenom: " + column2Value);
                    } 
                }
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}