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
public class HiloEstatica extends Thread {

    private final JPanel estatic;
    private JFrame inicio;
    private JFrame oficina;
    private JPanel ofi;
    private JPanel deadsc;
    private int contador = 0;
    private boolean isAlive = true;

    public HiloEstatica(JPanel estatic, JFrame inicio, JFrame oficina, JPanel ofi, JPanel deadsc) {
        this.estatic = estatic;
        this.inicio = inicio;
        this.oficina = oficina;
        this.ofi = ofi;
        this.deadsc = deadsc;
    }

    @Override
    public void run() {
        estatic.setVisible(true);
        while (isAlive) {
            contador++;
            if (contador == 600) {

                isAlive = false;
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloEstatica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        estatic.setVisible(false);
        HiloDeadScene hDead = new HiloDeadScene(deadsc, inicio, oficina, ofi);
        hDead.start();
    }

}
