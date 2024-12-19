/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsriizal;

/**
 *
 * @author Asus
 */
class Rpm extends Src {
    
    public String rpm (int pSpeed, String stroke) {
        konvert("0", stroke);
        rpm = (pSpeed*30)/B;
        invert( rpm);
        return out;
    }
    
}
