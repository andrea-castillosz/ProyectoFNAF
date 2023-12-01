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
public class Freddy {
    
    private int ai;
    private int ubic;
    private int posib;
    private Random ran = new Random();

    public Freddy() {
    }

    public Freddy(int ai, int pos, boolean sipuede) {
        this.ai = ai;
    }

    public int getAi() {
        return ai;
    }

    public void setAi(int ai) {
        this.ai = ai;
    }


    public Random getRan() {
        return ran;
    }

    
}
