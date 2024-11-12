package com.mycompany.tugasopp;

public class Kelulusan {
    
    //method untuk mengidentifikasi kelulusan
    String hasil(int nilai) {
        String ket;
        if (nilai < 70) {
            ket = "lulus";
        } else {
            ket = "tidak lulus";
        }
        return ket;
    }
    
}
