/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author casti
 */
public class HiloJSChica extends Thread{
    
    private final JPanel jsChic;
    private JFrame inicio;
    private JFrame oficina;
    private JPanel ofi;
    private int contador = 0;
    private boolean isAlive = true;
    
//    public HiloJumpscareB(JPanel camaragif) {
//        this.jsBon = camaragif;
//    }
    
    public HiloJSChica(JPanel jsChic, JFrame inicio, JFrame oficina, JPanel ofi) {
        this.jsChic = jsChic;
        this.inicio = inicio;
        this.oficina =  oficina;
        this.ofi = ofi;
    }
    
    @Override
    public void run() {
        ofi.setVisible(false);
        jsChic.setVisible(true);
        while (isAlive) {
            contador++;
            if (contador == 400) {
                
                isAlive = false;
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloJSChica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        jsChic.setVisible(false);
        ofi.setVisible(true);
        oficina.setVisible(false);
        inicio.setVisible(true);
        
    }
    
}
