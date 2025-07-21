package bank.management.system;
import java.sql.*;
import javax.swing.*;
public class Con {

    public Connection connection;
   public  Statement statement;
    public Con() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/banksystem", "root", "12345"
            );
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection failed.");
            throw new RuntimeException("Database connection error", e); // Stop execution
        }
    }


public static void main(String[]args){

    new Con();
}



}
