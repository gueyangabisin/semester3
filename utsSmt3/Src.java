/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsriizal;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Src {

    float A;
    float B;
    
    String out;
    
    
    float rpm;
    float Volum;
    float psped;
    float tVol;
    
    void konvert (String a,String b){
        
        try {
            A = Float.parseFloat(a);
            B = Float.parseFloat(b);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    void invert (float a) {
        try {
            out = String.valueOf(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
