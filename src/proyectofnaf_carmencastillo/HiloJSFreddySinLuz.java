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
public class HiloJSFreddySinLuz extends Thread{
    
    private final JPanel jsFredSinLuz;
    private JFrame inicio;
    private JFrame oficina;
    private JPanel ofi;
    private int contador = 0;
    private boolean isAlive = true;
    
    
    public HiloJSFreddySinLuz(JPanel jsBon, JFrame inicio, JFrame oficina, JPanel ofi) {
        this.jsFredSinLuz = jsBon;
        this.inicio = inicio;
        this.oficina =  oficina;
        this.ofi = ofi;
    }
    
    @Override
    public void run() {
        ofi.setVisible(false);
        jsFredSinLuz.setVisible(true);
        while (isAlive) {
            contador++;
            if (contador == 500) {
                
                isAlive = false;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloJSFreddySinLuz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jsFredSinLuz.setVisible(false);
        oficina.setVisible(false);
        inicio.setVisible(true);
        ofi.setVisible(true);
        
    }
    
}
