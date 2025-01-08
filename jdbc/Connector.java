/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

//C:\Users\Administrator\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar
public class Connector {

    String status = ""; //untuk menampilkan status koneksi
    
    Connection con ;
    
    public void connection() {

        try {
            String connectUrl = "jdbc:mysql://localhost:3306/latihan";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(connectUrl, user, password);

            status = "yeeeeeayyy udah nyambung";

            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            status = "MAAF aku gabisa :  " + e;
            System.out.println(e);
        }
    }

    //fungsi main disini hanya untuk running independent class
    public static void main(String[] args) {
        Connector cnt = new Connector();
        cnt.connection();
       JOptionPane.showMessageDialog(null, cnt.status);

    }

    java.beans.Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Statement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
