/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

import java.util.Random;

/**
 *
 * @author casti
 */
public class GFreddy {
    
    public static int pos;
    public static int posib;
    public Random ran = new Random();
    public static boolean sipuede;
    public static boolean puertaAbierta;
    public static boolean jumpscare = false;
    
    public GFreddy() {
    }

    public GFreddy(int pos, boolean sipuede) {
        this.pos = pos;
        this.sipuede = sipuede;
        //this.setearImagen = setearImagen;
    }

    public static int getPos() {
        return pos;
    }

    public static void setPos(int pos) {
        GFreddy.pos = pos;
    }

    public static int getPosib() {
        return posib;
    }

    public static void setPosib(int posib) {
        GFreddy.posib = posib;
    }

    public Random getRan() {
        return ran;
    }

    public void setRan(Random ran) {
        this.ran = ran;
    }

    public static boolean isSipuede() {
        return sipuede;
    }

    public static void setSipuede(boolean sipuede) {
        GFreddy.sipuede = sipuede;
    }

    public static boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public static void setPuertaAbierta(boolean puertaAbierta) {
        GFreddy.puertaAbierta = puertaAbierta;
    }

    public static boolean isJumpscare() {
        return jumpscare;
    }

    public static void setJumpscare(boolean jumpscare) {
        GFreddy.jumpscare = jumpscare;
    }
    
    
    
}
