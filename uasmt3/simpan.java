/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasmt3;

import java.sql.Statement;

/**
 *
 * @author deekte
 */
public class simpan extends sql {
    
     public void simp(String kode, String merk, String bore, String stroke){
      
       sambung();
        run = "menyimpan data";
           String sql = "INSERT INTO `motors`(`kode`, `merk`, `bore`, `stroke`) VALUES ('"+kode+"','"+merk+"','"+bore+"','"+stroke+"')";
           query("Simpan",sql);
          System.out.println(sql);
     }
     public static void main(String[] args) {
        simpan s = new simpan();
        s.simp("aa", "bb", "12", "14");
    }
}
