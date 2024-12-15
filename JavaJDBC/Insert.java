/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasopp.DataBase;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Insert {
 
    Connector konek = new Connector();
    
   
    public void insert(int nim, String nama, String alamat, String gender) {
        konek.connection();
        try {
            Statement statement;
            statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql = "insert into mahasiswa19 values('" + nim + "','" + nama + "','" + alamat + "','" + gender + "');";

            statement.executeUpdate(sql);
            System.out.println("Insert System is "+konek.status);
            statement.close();
            
            JOptionPane.showMessageDialog(null, "udah masuk");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "MAAF gabisa masukin :  "+ex);
        }
    }

}
