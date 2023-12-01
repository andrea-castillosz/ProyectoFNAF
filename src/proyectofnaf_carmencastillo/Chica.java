/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author casti
 */
public class Chica {
    
    private int ai;
    //private int pos;
    private int ubic;
    private int posib;
    private Random ran = new Random();

    public Chica() {
    }

    public Chica(int ai) {
        this.ai = ai;
        ubic = 0;
    }

    public int getAi() {
        return ai;
    }

    public void setAi(int ai) {
        this.ai = ai;
    }


    public int getUbic() {
        return ubic;
    }

    public void setUbic(int ubic) {
        this.ubic = ubic;
    }

    
    
    public void movimiento() {
        posib = ran.nextInt(20) + 1;
        
        if (posib <= ai) {
            ubic++;
        }
    }

    
}
