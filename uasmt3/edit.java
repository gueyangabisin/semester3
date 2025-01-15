/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasmt3;

/**
 *
 * @author deekte
 */
public class edit extends sql {
    
     public void edi(String kode, String merk, String bore, String stroke){
      
       sambung();
       
           String sql = "UPDATE `motors` SET `kode`='"+kode+"',`merk`='"+merk+"',`bore`='"+bore+"',`stroke`='"+stroke+"' WHERE kode = '"+kode+"'";
           query("Edit",sql);
          System.out.println(sql);
     }
    
}
