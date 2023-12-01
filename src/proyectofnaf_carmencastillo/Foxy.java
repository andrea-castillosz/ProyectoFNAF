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
public class Foxy {
    
    public static int ai;
    public static int pos;
    public static int posib;
    public Random ran = new Random();
    public static boolean sipuede;
    public static boolean puertaAbierta;
    public static boolean jumpscare = false;
    public static JLabel setearImagen;

    public Foxy() {
    }

    public Foxy(int ai, int pos, boolean sipuede) {
        this.ai = ai;
        this.pos = pos;
        this.sipuede = sipuede;
    }

    public int getAi() {
        return ai;
    }

    public void setAi(int ai) {
        this.ai = ai;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Random getRan() {
        return ran;
    }

    public void setRan(Random ran) {
        this.ran = ran;
    }

    public boolean isSipuede() {
        return sipuede;
    }

    public void setSipuede(boolean sipuede) {
        this.sipuede = sipuede;
    }

    public static int getPosib() {
        return posib;
    }


    
    
}
