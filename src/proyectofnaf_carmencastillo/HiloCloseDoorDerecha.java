/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author casti
 */
public class HiloCloseDoorDerecha extends Thread {
    
    JLabel door;
    JLabel door1;
    boolean isAlive = true;
    int cont = 0;

    public HiloCloseDoorDerecha(JLabel door) {
        this.door = door;
        //this.door1 = door1;
    }
    
    

    @Override
    public void run() {
        door.setVisible(true);
        ImageIcon doornew = new ImageIcon(getClass().getResource("/Imagenes/puertacerrder (1).gif"));
        ImageIcon doorcerrada = new ImageIcon(getClass().getResource("/Imagenes/puertadercerrada.gif"));
        door.setIcon(doornew);
        
        while (isAlive) {
            cont++;
            if (cont == 300) {
                isAlive = false;
                door.setIcon(doorcerrada);
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloCloseDoor.class.getName()).log(Level.SEVERE, null, ex);
            }
            //door.setVisible(false);
            //door1.setVisible(true);
        }

    }
    
}
