/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interf;

/**
 *
 * @author deekte
 */
public interface device {
     int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}