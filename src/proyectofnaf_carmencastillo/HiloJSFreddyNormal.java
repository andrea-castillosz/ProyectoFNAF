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
public class HiloJSFreddyNormal extends Thread{
    
    private final JPanel jsFredNorm;
    private JFrame inicio;
    private JFrame oficina;
    private JPanel ofi;
    private int contador = 0;
    private boolean isAlive = true;
    
//    public HiloJumpscareB(JPanel camaragif) {
//        this.jsBon = camaragif;
//    }
    
    public HiloJSFreddyNormal(JPanel jsFredNorm, JFrame inicio, JFrame oficina, JPanel ofi) {
        this.jsFredNorm = jsFredNorm;
        this.inicio = inicio;
        this.oficina =  oficina;
        this.ofi = ofi;
    }
    
    @Override
    public void run() {
        ofi.setVisible(false);
        jsFredNorm.setVisible(true);
        while (isAlive) {
            contador++;
            if (contador == 500) {
                
                isAlive = false;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloJSFreddyNormal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jsFredNorm.setVisible(false);
        oficina.setVisible(false);
        inicio.setVisible(true);
        ofi.setVisible(true);
        
    }
    
}
