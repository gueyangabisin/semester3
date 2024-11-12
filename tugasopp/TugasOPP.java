package com.mycompany.tugasopp;

public class TugasOPP {

    String ket; // menyimpan hasil kelulusan
    int nil;    // menyimpan nilai mahasiswa

   

    //fungsi untuk menampilkan semua hasil pengolahan program
    void out(String nama, int nil) {

        System.out.println("Nama   :" + nama);
        System.out.println("Nilai  :" + nil);
        System.out.println("Keterangan :" + ket);
    }

    //fungsi utama
    public static void main(String[] args) {

        TugasOPP z = new TugasOPP(); //ininsialisasi method didalam class TugasOPP kedalam objek z
        Kelulusan l = new Kelulusan(); //inisialisasi class Kelulusan kedalam objek l
        
        int nilai = 80;
        String nama = "joni";
        
        l.hasil(nilai); //menjalankan method hasil
        z.out(nama, nilai); //menjalankan fungsi out

    }

}
