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
public class HiloGane extends Thread{
    
    private final JPanel win;
    private JFrame inicio;
    private JFrame oficina;
    private JPanel ofi;
    private int contador = 0;
    private boolean isAlive = true;
    
    public HiloGane(JPanel win, JFrame inicio, JFrame oficina, JPanel ofi) {
        this.win = win;
        this.inicio = inicio;
        this.oficina =  oficina;
        this.ofi = ofi;
    }
    
    @Override
    public void run() {
        ofi.setVisible(false);
        win.setVisible(true);
        while (isAlive) {
            contador++;
            if (contador == 4500) {
                
                isAlive = false;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloGane.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        win.setVisible(false);
        oficina.setVisible(false);
        inicio.setVisible(true);
        ofi.setVisible(true);
        
    }
    
}
