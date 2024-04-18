/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import static Code.ConnectionDB.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author IT
 */
public class Reasearch {
    public static void main(String[]args) throws SQLException{
        Statement statement = null;
        ResultSet resultSet = null;
        
        Connection con=ConnectionDB.getConnection();
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
                        String column1Value = resultSet.getString("NOM");
                        String column2Value = resultSet.getString("PRENOM");
                        // Display or process the retrieved values as needed
                        System.out.println("nom: " + column1Value + ", prenom: " + column2Value);
                    } 
                }
            } else {
                System.out.println("Failed to make connection!");
            }
    }
}
