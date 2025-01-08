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
public class Delete {
    Connector konek = new Connector();
    String prog;
    
    void delete(String nim){
        konek.connection();
        try {
            java.sql.Statement update = konek.con.createStatement();
            //menghapus data berdasarkan nim mahasiswa
            String sql = "delete from mahasiswa19 where nim = '" + nim +"'";
            update.executeUpdate(sql);
            System.out.println("Deleting query...");
           prog = "query deleted";
            //update.close;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
