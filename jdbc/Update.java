/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS TUF ROG
 */
public class Update {
    String prog;
    Connector konek = new Connector();
    void update(String nim,String nama, String alamat, String gender)
        {
            
             
             try
        {
// Mengupdate nama mahasiswa berdasarkan NIM
            konek.connection();
           java.sql.Statement update = konek.con.createStatement();
            String sql = " update mahasiswa19 set nama ='"+ nama +"',`alamat`='"+ alamat+"',`gender`='"+gender+"'  where nim = '"+nim+"'";
            update.executeUpdate(sql);
            update.close();
            
            System.out.println("updating query...");
            prog = "query updated";
        }
        catch(Exception er)
        {
            JOptionPane.showMessageDialog(null,er);
        }
        }
}
