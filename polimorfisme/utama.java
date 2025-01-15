/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author deekte
 */
public class utama {
      public static void main(String[] args) {
        bangunDatar BangunD = new bangunDatar();
        persegi persegi = new persegi();
        segitiga segitiga = new segitiga();
        lingkaran lingkaran = new lingkaran();
        
        //Panggil method luas dan keliling
        BangunD.luas();
        BangunD.keliling();
        
        System.out.println("Luas persegi : " + persegi.luas());
        System.out.println("Keliling persegi : " + persegi.keliling());
        System.out.println("Luas Segitiga : " + segitiga.luas());
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
    }
}
