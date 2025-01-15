/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uasmt3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author deekte
 */
public class sql {

      Connection con ;
      String status = ""; //untuk menampilkan status koneksi
         String run;
         
         
         
    public void sambung(){
         
         
        try {
           
            String connectUrl = "jdbc:mysql://localhost:3306/uas";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(connectUrl, user, password);
            status = "nyambung";
            System.out.println("checking connection.... nyambung.");
            
        } catch (Exception e) {
            status = "ga nyambung";
            System.out.println("checking connection.... ga nyambung :   "+ e);
        }
    }
    
    public void query(String rn, String syn){
         try {
           Statement st;
           
           st = con.prepareStatement(syn);
           st.execute(syn);
           
           System.out.println("query berhasil");
           run = rn + " data SUKSES";
       } catch (Exception e) {
           run = rn + " data GAGAL";
           System.out.println("query gagal" + e);
       }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
