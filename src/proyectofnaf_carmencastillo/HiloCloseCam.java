/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author casti
 */
public class HiloCloseCam extends Thread{
    
    private final JPanel camaragif;
    private JPanel ofi;
    private JPanel povcamaras;
    private int contador = 0;
    private boolean isAlive = true;

    public HiloCloseCam(JPanel camaragif) {
        this.camaragif = camaragif;
    }

    public HiloCloseCam(JPanel camaragif, JPanel ofi, JPanel povcamaras) {
        this.camaragif = camaragif;
        this.ofi = ofi;
        this.povcamaras = povcamaras;
    }
    
    @Override
    public void run(){
           camaragif.setVisible(true);
           while (isAlive){
               contador++;
               if (contador == 100) {
                   isAlive = false;
               }
               try {
                   Thread.sleep(2);
               } catch (InterruptedException ex) {
                   Logger.getLogger(HiloCamAnimation.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           camaragif.setVisible(false);
           ofi.setVisible(true);
           povcamaras.setVisible(false);
    }
    
}
