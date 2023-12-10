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
    
    private final JPanel jsFLuz;
    private JFrame inicio;
    private JFrame oficina;
    private JPanel ofi;
    private JPanel estaticc;
    private JPanel deadc;
    private int contador = 0;
    private boolean isAlive = true;
    
    
    public HiloJSFreddySinLuz(JPanel jsFLuz, JFrame inicio, JFrame oficina, JPanel ofi, JPanel estaticc, JPanel deadc) {
        this.jsFLuz = jsFLuz;
        this.inicio = inicio;
        this.oficina =  oficina;
        this.ofi = ofi;
        this.estaticc = estaticc;
        this.deadc = deadc;
    }
    
    @Override
    public void run() {
        ofi.setVisible(false);
        jsFLuz.setVisible(true);
        while (isAlive) {
            contador++;
            if (contador == 500) {
                
                isAlive = false;
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloJSFreddySinLuz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        jsFLuz.setVisible(false);
        ofi.setVisible(false);
        HiloEstatica estatica = new HiloEstatica(estaticc, inicio, oficina, ofi, deadc);
        estatica.start();
        //oficina.setVisible(false);
        //inicio.setVisible(true);
        
    }
    
}
