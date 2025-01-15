/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasmt3;

/**
 *
 * @author deekte
 */
public class hapus extends sql {
    
    public void del(String kode){
      
       sambung();
       
           String sql = "DELETE FROM `motors` WHERE kode = '"+kode+"'";
           query("Hapus",sql);
          System.out.println(sql);
     }
    
}
