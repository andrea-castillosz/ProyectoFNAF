/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author casti
 */
public class HiloHora extends Thread {

    private boolean isAlive = true;
    private int num = 0;
    private JLabel hora;
    private JLabel horacam;

    public HiloHora() {

    }

    public HiloHora(JLabel hora, JLabel horacam) {
        this.hora = hora;
        this.horacam = horacam;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }

    public JLabel getHoracam() {
        return horacam;
    }

    public void setHoracam(JLabel horacam) {
        this.horacam = horacam;
    }
    
    

    @Override
    public void run() {
        while (isAlive) {
            /*
            num++
            if == 1
            else if == 2
            else if == 3
            else if == 4
            else if == 5
            else
             */
            
            if (num == 0) {
                hora.setText("12 AM");
                horacam.setText("12 AM");
            }
            if (num == 1) {
                hora.setText("1 AM");
                horacam.setText("1 AM");
            }
            if (num == 2) {
                hora.setText("2 AM");
                horacam.setText("2 AM");
            }
            if (num == 3) {
                hora.setText("3 AM");
                horacam.setText("3 AM");
            }
            if (num == 4) {
                hora.setText("4 AM");
                horacam.setText("4 AM");
            }
            if(num == 5)
            {
                hora.setText("5 AM");
                horacam.setText("5 AM");
            }
            else if (num == 6) {
                hora.setText("6 AM");
                horacam.setText("6 AM");
                isAlive = false;
            }
            
            num++;
            try {
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloHora.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
