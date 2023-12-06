/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author casti
 */
public class HiloBateria extends Thread {

    private int banderaPuertaIz;
    private int banderaPuertaDer;
    private int banderaLuzDer;
    private int banderaLuzIz;
    private int banderaCamara;   
    
    
    private double DrenajeBat = 0;
    //private int EntDrenajeBat = (int) DrenajeBat;
    
    private int CuantosHay;
    private int contador = 0;
    private boolean isAlive = true;

    public HiloBateria(int banderaPuertaIz, int banderaPuertaDer, int banderaLuzDer, int banderaLuzIz, int banderaCamara, int EntRestanteBat, double RestanteBat) {
        this.banderaPuertaIz = banderaPuertaIz;
        this.banderaPuertaDer = banderaPuertaDer;
        this.banderaLuzDer = banderaLuzDer;
        this.banderaLuzIz = banderaLuzIz;
        this.banderaCamara = banderaCamara;
        //this.EntDrenajeBat = EntRestanteBat;
        this.DrenajeBat = RestanteBat;
    }

    public HiloBateria(int CuantosHay, double DrenajeBat) {
        this.CuantosHay = CuantosHay;
        this.DrenajeBat = DrenajeBat;
    }
    
    

    public int getBanderaPuertaIz() {
        return banderaPuertaIz;
    }

    public void setBanderaPuertaIz(int banderaPuertaIz) {
        this.banderaPuertaIz = banderaPuertaIz;
    }

    public int getBanderaPuertaDer() {
        return banderaPuertaDer;
    }

    public void setBanderaPuertaDer(int banderaPuertaDer) {
        this.banderaPuertaDer = banderaPuertaDer;
    }

    public int getBanderaLuzDer() {
        return banderaLuzDer;
    }

    public void setBanderaLuzDer(int banderaLuzDer) {
        this.banderaLuzDer = banderaLuzDer;
    }

    public int getBanderaLuzIz() {
        return banderaLuzIz;
    }

    public void setBanderaLuzIz(int banderaLuzIz) {
        this.banderaLuzIz = banderaLuzIz;
    }

    public int getBanderaCamara() {
        return banderaCamara;
    }

    public void setBanderaCamara(int banderaCamara) {
        this.banderaCamara = banderaCamara;
    }

//    public int getEntDrenajeBat() {
//        return EntDrenajeBat;
//    }
//
//    public void setEntDrenajeBat(int EntDrenajeBat) {
//        this.EntDrenajeBat = EntDrenajeBat;
//    }

    public double getDrenajeBat() {
        return DrenajeBat;
    }

    public void setDrenajeBat(double DrenajeBat) {
        this.DrenajeBat = DrenajeBat;
    }
    
    

    @Override
    public void run() {

        while (isAlive) {
            
            
            if (CuantosHay == 0) {
                
            } else if (CuantosHay == 1) {
                DrenajeBat = DrenajeBat-0.2;
                
            } else if (CuantosHay == 2) {
                DrenajeBat = DrenajeBat-0.4;
            } else if (CuantosHay == 3) {
                DrenajeBat = DrenajeBat-0.6;
            } else if (CuantosHay == 4) {
                DrenajeBat = DrenajeBat-0.8;
            } else if (CuantosHay == 5) {
                DrenajeBat = DrenajeBat-1;                
            }
            
            System.out.println(DrenajeBat);
            
//            if (banderaLuzDer == 1) {
//                DrenajeBat = DrenajeBat-0.2;
//            }
//            if (banderaLuzIz == 1) {
//                DrenajeBat = DrenajeBat-0.2;
//            }
//            if (banderaPuertaDer == 1) {
//                DrenajeBat = DrenajeBat-0.2;
//            }
//            if (banderaPuertaIz == 1) {
//                DrenajeBat = DrenajeBat-0.2;
//            }
//            if (banderaCamara == 0) {
//                DrenajeBat = DrenajeBat-0.2;
//            }
//            
            if (contador == 360) {
                isAlive = false;
            } else if (DrenajeBat == 0){
                isAlive = false;
            }
            
            contador++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloBateria.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
