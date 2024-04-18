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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import component.Bottom;

public class Utilisateur {
    
    private static String email;
    private static  String password;
    public static  String userName;
    public static  String nom;
    private static  String prenom;
    public static  String workPosition;
    private static  int userId;
    public Utilisateur(int userId,String userName){
        this.userId=userId;
        this.userName=userName;
        
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public void setUserID(int userID) {
        this.userId = userID;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public int getUserID() {
        return userId;
    }
   public Utilisateur(){}
    
    
    public Utilisateur(String userName){
        this.userName=userName;
        
        
        getUserData(userName);
        String[] nameParts = userName.split(" ");
        this.nom = nameParts[0];
        this.prenom = nameParts[1];
        
        
    }
            

    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
    public void getUserData(String userName){
        Connection con = null;
        try {
            con = ConnectionDB.getConnection();
            
            // Define query
            String query = "SELECT PASSWORD, EMAIL, USER_ID, workPosition FROM utilisateur WHERE USERNAME = ?";
            
            // Create prepared statement
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                // Set username parameter
                preparedStatement.setString(1, userName);
                
                // Execute query
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Check if user with given username exists
                    if (resultSet.next()) {
                        // Retrieve password and email
                        this.email = resultSet.getString("email");
                        this.password = resultSet.getString("password");
                        this.userId = resultSet.getInt("user_id");
                        this.workPosition= resultSet.getString("workPosition");
                        // Output retrieved data
                        System.out.println("Password: " + this.password);
                        System.out.println("Email: " + this.email);
                    } else {
                        // No user found with given username
                        System.out.println("User 'isra' not found.");
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Close connection
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

   

    
    
}
