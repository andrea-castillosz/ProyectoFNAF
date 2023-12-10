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
public class HiloDeadScene extends Thread{
    
    private final JPanel deadscene;
    private JFrame inicio;
    private JFrame oficina;
    private JPanel ofi;
    private int contador = 0;
    private boolean isAlive = true;
    
    
    public HiloDeadScene(JPanel deadscene, JFrame inicio, JFrame oficina, JPanel ofi) {
        this.deadscene = deadscene;
        this.inicio = inicio;
        this.oficina =  oficina;
        this.ofi = ofi;
    }
    
    @Override
    public void run() {
        deadscene.setVisible(true);
        while (isAlive) {
            contador++;
            if (contador == 900) {
                
                isAlive = false;
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloJSChica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        deadscene.setVisible(false);
        ofi.setVisible(true);
        oficina.setVisible(false);
        inicio.setVisible(true);
        
    }
    
}
