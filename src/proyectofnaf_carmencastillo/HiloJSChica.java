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
    private JPanel estaticc;
    private JPanel deadc;
    private int contador = 0;
    private boolean isAlive = true;
    
    
    public HiloJSChica(JPanel jsChic, JFrame inicio, JFrame oficina, JPanel ofi, JPanel estaticc, JPanel deadc) {
        this.jsChic = jsChic;
        this.inicio = inicio;
        this.oficina =  oficina;
        this.ofi = ofi;
        this.estaticc = estaticc;
        this.deadc = deadc;
    }
    
    @Override
    public void run() {
        ofi.setVisible(false);
        jsChic.setVisible(true);
        while (isAlive) {
            contador++;
            if (contador == 500) {
                
                isAlive = false;
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloJSChica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        jsChic.setVisible(false);
        ofi.setVisible(false);
        HiloEstatica estatica = new HiloEstatica(estaticc, inicio, oficina, ofi, deadc);
        estatica.start();
        //oficina.setVisible(false);
        //inicio.setVisible(true);
        
    }
    
}
