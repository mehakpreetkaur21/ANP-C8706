/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
public class Demo {
    public static void main(String args[])  {
        try{
        // Step 1: Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver"); // Use com.mysql.cj.jdbc.Driver for newer MySQL versions
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
        // Step 2: Establish a connection
            ArrayList<Student> ar = new ArrayList<>();
            // Step 3: Create a statement
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip", "root", "root")) {
                // Step 3: Create a statement
                Statement st = con.createStatement();
                // Step 4: Execute a query
                //ResultSet rs = st.executeQuery("SELECT * FROM student");
                ResultSet rs = st.executeQuery(Queries.giveStAndAdd());
                // Step 5: Process the results
                while (rs.next()) {
                    ar.add(new Student(rs.getInt(1) ,rs.getString(2) ,rs.getInt(3)));
                }   System.out.println(ar);
                // System.out.println("Student ID: " + rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4));
                // Step 6: Close the connection
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
// Print the exception stack trace to troubleshoot any issues
        }
    }
}