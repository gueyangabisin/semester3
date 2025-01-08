/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Insert {
    String prog;
    Connector konek = new Connector();
    
   
    public void insert(String nim, String nama, String alamat, int gender) {
        konek.connection();
        String gend;
        
        if (gender == 0) {
            gend = "L";
        } else {
            gend = "P";
        }
        
        try {
            Statement statement;
            statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql = "insert into mahasiswa19 values('" + nim + "','" + nama + "','" + alamat + "','" + gend + "');";

            statement.executeUpdate(sql);
            
            statement.close();
            System.out.println("inserting query...");
            prog = "query inserted";
            
        } catch (Exception ex) {
            
            prog = "inserting FAILED";
        }
    }

}
