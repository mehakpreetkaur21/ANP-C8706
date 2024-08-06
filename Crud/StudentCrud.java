/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author mehak
 */
public class StudentCrud {
   public static void main(String args[]){
   }
    public void addStudent() throws SQLException{
        Connection c=ConnectionFactory.getConnectionFactory().getConnection();
        PreparedStatement ppst =c.prepareStatement("insert into student values (?,?,?)");
                ppst.setInt(1,s.getStudentId());
                ppst.setInt(2,s.getStudentName());
                ppst.setInt(3,s.getStudentId());
                int ans=ppst.executeUpdate();
                if(ans!=0){
                System.out.println("data got insertes successfully");
                        }

   }
   } 

