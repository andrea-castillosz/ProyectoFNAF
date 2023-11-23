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
public class Bonnie {

    public static int ai;
    public static int pos;
    public static int posib;
    public Random ran = new Random();
    public static boolean sipuede;
    public static boolean puertaAbierta;
    public static boolean jumpscare = false;
    //public static JLabel setearImagen;

    public Bonnie() {
    }

    public Bonnie(int ai, int pos, boolean sipuede) {
        this.ai = ai;
        this.pos = pos;
        this.sipuede = sipuede;
        //this.setearImagen = setearImagen;
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

    public static void setPosib(int posib) {
        Bonnie.posib = posib;
    }

    public static boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public static void setPuertaAbierta(boolean puertaAbierta) {
        Bonnie.puertaAbierta = puertaAbierta;
    }

    public static boolean isJumpscare() {
        return jumpscare;
    }

    public static void setJumpscare(boolean jumpscare) {
        Bonnie.jumpscare = jumpscare;
    }

//    public static JLabel getSetearImagen() {
//        return setearImagen;
//    }
//
//    public static void setSetearImagen(JLabel setearImagen) {
//        Bonnie.setearImagen = setearImagen;
//    }

    public void movimiento() {
        posib = ran.nextInt(20) + 1;
        
        if (pos == 8 && puertaAbierta == true) {
            jumpscare = true;
            pos++;
        } else if (pos == 8 && puertaAbierta == false) {
            jumpscare = false;
            pos = 1;
        } else {
            if (posib <= ai) {
                jumpscare = false;
                pos = ran.nextInt(8) + 0;
                while (pos == 8) {
                    pos = ran.nextInt(8) + 0;
                }
                
            }

        }

    }

//    public void movimientoN2() {
//        posib = ran.nextInt(20) + 1;
//        if (pos == 8 && puertaAbierta == true) {
//            jumpscare = true;
//        } else if (pos == 8 && puertaAbierta == false) {
//            jumpscare = false;
//            pos = 0;            
//        } else {
//            jumpscare = false;
//            pos = 8;
//            while (pos == 8) {
//                pos = ran.nextInt(8) + 0;
//            }
//        }
//
//    }
    public void movimientoN3() {
        posib = ran.nextInt(20) + 1;
        if (pos == 8 && puertaAbierta == true) {
            jumpscare = true;
        } else if (pos == 8 && puertaAbierta == false) {
            jumpscare = false;
            pos = 0;
            while (pos == 8) {
                pos = ran.nextInt(8) + 0;
            }
        } else {
            jumpscare = false;
            pos = ran.nextInt(8) + 0;
        }

    }

    public void movimientoN4() {
        posib = ran.nextInt(20) + 1;
        if (pos == 8 && puertaAbierta == true) {
            jumpscare = true;
        } else if (pos == 8 && puertaAbierta == false) {
            jumpscare = false;
            pos = 0;
            while (pos == 8) {
                pos = ran.nextInt(8) + 0;
            }
        } else {
            jumpscare = false;
            pos = ran.nextInt(8) + 0;
        }

    }

}
