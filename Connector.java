/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasopp.DataBase;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

//C:\Users\Administrator\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar
public class Connector {

    String status = "";
    Connection con ;
    
    public void connection() {

        try {
            String connectUrl = "jdbc:mysql://localhost/latihan";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");

            this.con = (Connection) DriverManager.getConnection(connectUrl, user, password);

            status = "yeeeeeayyy udah nyambung";
 // mengambil query dari database {
//            Statement state = con.createStatement();
//            String sql = "select*from mahasiswa19";
//            ResultSet rs = state.executeQuery(sql);
//            
//            while(rs.next()){
//                System.out.println("nim: " + rs.getNString("nim"));
//                System.out.println("nim: " + rs.getNString("nama"));
//                System.out.println("nim: " + rs.getNString("alamat"));
//                System.out.println("nim: " + rs.getNString("gender")+ "\n");
//                
//                
//            }
  //}
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            status = "MAAF aku gabisa :  " + e;
        }
    }

    //fungsi main disini hanya untuk running independent class
    public static void main(String[] args) {
        Connector cnt = new Connector();
        cnt.connection();
       JOptionPane.showMessageDialog(null, cnt.status);

    }
}
