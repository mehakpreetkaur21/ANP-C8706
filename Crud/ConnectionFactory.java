/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author mehak
 */
public class ConnectionFactory {
    
private static ConnectionFactory cf=null;
private ConnectionFactory(){
}
public static ConnectionFactory getConnectionFactory(){
    if (cf==null){
        cf=new ConnectionFactory();
    }
    return cf;
}

    public static Connection getConnection(){
    Connection con=null;
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","root");
    } catch (SQLException ex) {
        Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
    }
    return con;
}

}

