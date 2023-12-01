/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

import javax.accessibility.AccessibleContext;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JRootPane;

/**
 *
 * @author casti
 */
public class Noche1 extends Thread {

    private boolean gamestart = true;
    private String camlocation;

    //public static Main main = new Main();
//    private Bonnie bon = new Bonnie(3, 0, false);
//    private Chica chic = new Chica(0, 0, false);
    private Freddy fred = new Freddy(0, 0, false);
    private Foxy fox = new Foxy(0, 0, false);
    private GFreddy gf = new GFreddy(0, false);
    private JLabel camaras;
    private Main main;

   

    public Noche1(JLabel camaras, String camlocation, Main main) {
        this.camaras = camaras;
        this.camlocation = camlocation;
        this.main = main;
    }

//    @Override
//    public void run() {
//
//        if (gamestart == true) {
//            bon.movimiento();
//            chic.movimiento();
//
//            if (camlocation.equals("stage")) { // 1A
//                if (bon.getPos() == 0 && chic.getPos() == 0 && fred.getPos() == 0) { //estan los tres
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 0 && chic.getPos() == 0 && fred.getPos() == 0) { //estan sin bonnie
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/SHSsinBonnie.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 0 && chic.getPos() == 0 && fred.getPos() == 0) { //estan sin chica
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/SHSsinChica.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() == 0 && chic.getPos() != 0 && fred.getPos() != 0) { //SIN FREDDY
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/SHSSinFreddy.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 0 && chic.getPos() != 0 && fred.getPos() == 0) { //solo freddy
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/SHSSOLOFreddy.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 0 && chic.getPos() != 0 && fred.getPos() != 0) { //NADIE
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/SHSNadie.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//
//            } else if (camlocation.equals("dinning")) { //1, 2 BONNIE Y CHICA //FREDDY SOLO 1 // bon 1 2 / chic 1 2 / fred 1 //1B
//
//                if (bon.getPos() != 1 && chic.getPos() != 1 && chic.getPos() != 2 && bon.getPos() != 2 && fred.getPos() != 1) { //vacio
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerVacio.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 1 && chic.getPos() != 1 && chic.getPos() != 2 && bon.getPos() != 2 && fred.getPos() == 1) { //freddy atras
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerFreddy.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() == 1 && chic.getPos() != 1 && chic.getPos() != 2 && bon.getPos() != 2 && fred.getPos() != 1) { //bonnie 1
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerBonnie1.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 1 && chic.getPos() != 1 && chic.getPos() != 2 && bon.getPos() == 2 && fred.getPos() != 1) { //bonnie 2
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerBonnie2.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 1 && chic.getPos() == 1 && chic.getPos() != 2 && bon.getPos() != 2 && fred.getPos() != 1) { //chica 1
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerChica1.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 1 && chic.getPos() != 1 && chic.getPos() == 2 && bon.getPos() != 2 && fred.getPos() != 1) { //chica 2
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerChica2.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if ((bon.getPos() == 1 && chic.getPos() == 1) || (chic.getPos() == 2 && bon.getPos() == 2) && fred.getPos() != 1) { //si estan bonnie y chica
//                    bon.setPos(3);
//                }
//                if ((bon.getPos() == 1 && chic.getPos() == 2) || (chic.getPos() == 1 && bon.getPos() == 2) && fred.getPos() != 1) { //si estan bonnie y 
//                    bon.setPos(3);
//                }
//                if ((bon.getPos() == 1 && fred.getPos() == 1) || (fred.getPos() == 1 && bon.getPos() == 2) && chic.getPos() != 1 && chic.getPos() != 2) { //si estan bonnie y freddy
//                    bon.setPos(3);
//                }
//                if ((chic.getPos() == 1 && fred.getPos() == 1) || (fred.getPos() == 1 && chic.getPos() == 2) && bon.getPos() != 1 && bon.getPos() != 2) { //si estan freddy y chica
//                    chic.setPos(3);
//                }
//                if ((chic.getPos() == 1 && bon.getPos() == 1 && fred.getPos() == 1) || (bon.getPos() == 2 && chic.getPos() == 2 && fred.getPos() == 1) || (bon.getPos() == 1 && chic.getPos() == 2 && fred.getPos() == 1) || (bon.getPos() == 2 && chic.getPos() == 1 && fred.getPos() == 1)) { //si estan los tres
//                    bon.setPos(3);
//                    chic.setPos(3);
//                }
//
//            } else if (camlocation.equals("pirateCove")) { //FOXY 0 1 2 y si se fue // 1C
//
//                if (fox.getPos() == 0) { //no se ha abierto
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/PirateC_0.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (fox.getPos() == 1) { //se abrio 
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/PirateC_1.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (fox.getPos() == 2) { //salio
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/PirateC_2.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (fox.getPos() != 0 && fox.getPos() != 1 && fox.getPos() != 2) { //se fue
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/PirateC_Vacio.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//
//            } else if (camlocation.equals("wHall")) { // gif fox 3 / bon 5 //2A
//
//                if (bon.getPos() != 5 && fox.getPos() != 3) { //VACIO
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/wHallVacio.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() == 5 && fox.getPos() != 3) { //BONNIE /tiene 7 posiciones creo
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/wHallBonnie.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 5 && fox.getPos() == 3) { //gif foxy
////                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/.jpg"));
////                    main.setSetearCamara(showstage_todos);
//                }
//                if (bon.getPos() == 5 && fox.getPos() == 3) { //si los dos estan
//                    bon.setPos(4);
//                }
//
//            } else if (camlocation.equals("wHallCorner")) { //bon 7 // gf no se //2B
//
//                if (bon.getPos() != 7 && gf.getPos() != 1) { //VACIO
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/wHallCVacio.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 7 && gf.getPos() == 1) { //gf
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/wHallCgf.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() == 7 && gf.getPos() != 1) { //bonnie
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/wHallCBon.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() == 7 && gf.getPos() == 1) { //si los dos estan
//                    bon.setPos(5);
//                }
//
//            } else if (camlocation.equals("supplyCloset")) { // bon 6         //3
//
//                if (bon.getPos() != 6) { //VACIO
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/ClosetVacio.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() == 6) { //bonnie
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/ClosetBon.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//
//            } else if (camlocation.equals("eHall")) { //chic 6 7 / fred 3 //4A
//
//                if (chic.getPos() != 6 && chic.getPos() != 7 && fred.getPos() != 3) { //VACIO
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/eHallVacio.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (chic.getPos() != 6 && chic.getPos() != 7 && fred.getPos() == 3) { //FREDDY
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/eHallFreddy.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (chic.getPos() == 6 && chic.getPos() != 7 && fred.getPos() != 3) { //CHICA
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/eHallChica6.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (chic.getPos() != 6 && chic.getPos() == 7 && fred.getPos() != 3) { //CHICA CERCA
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/eHallChica7.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//
//                if ((chic.getPos() != 6 && chic.getPos() == 7 && fred.getPos() == 3) || (chic.getPos() == 6 && chic.getPos() != 7 && fred.getPos() == 3)) { //si los dos estan
//                    chic.setPos(5);
//                }
//
//                if (chic.getPos() == 6 && chic.getPos() == 7 && fred.getPos() == 3) { //si los dos estan
//                    chic.setPos(5);
//                }
//
//            } else if (camlocation.equals("eHallCorner")) { //chic 8 / fred 4 //4B
//
//                if (chic.getPos() != 8 && fred.getPos() != 4) { //vacio
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/eHallCornerVacio.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (chic.getPos() != 8 && fred.getPos() == 4) { //freddy
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/eHallCornerFred.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (chic.getPos() == 8 && fred.getPos() != 4) { //chica
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/eHallCornerChica.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (chic.getPos() == 8 && fred.getPos() == 4) { //si estan los dos
//                    chic.setPos(7);
//                }
//
//            } else if (camlocation.equals("backstage")) { //bon 3 4            //5
//
//                if (bon.getPos() != 3 && bon.getPos() != 4) { //vacio
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/backstVacio.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() == 3 && bon.getPos() != 4) { //bonnie
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/backstBonnie1.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (bon.getPos() != 3 && bon.getPos() == 4) { //bonnie
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/backstBonnie2.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//
//            } else if (camlocation.equals("kitchen")) { //chic 5            //6
//                //camara desabilitada
//                ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/static.gif"));
//                camaras.setIcon(showstage_todos);
//
//            } else if (camlocation.equals("restrooms")) { //chic 3 4 / fred 2     //7
//
//                if (chic.getPos() != 3 && chic.getPos() != 4 && fred.getPos() != 2) { //VACIO
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/restroomVacio.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (chic.getPos() != 3 && chic.getPos() != 4 && fred.getPos() == 2) { //FREDDY
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/restroomFreddy.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (chic.getPos() == 3 && chic.getPos() != 4 && fred.getPos() != 2) { //CHICA
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/restroomChica1.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//                if (chic.getPos() != 3 && chic.getPos() == 4 && fred.getPos() != 2) { //CHICA CERCA
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/restroomChica2.jpg"));
//                    camaras.setIcon(showstage_todos);
//                }
//
//                if ((chic.getPos() != 3 && chic.getPos() == 4 && fred.getPos() == 2) || (chic.getPos() == 3 && chic.getPos() != 4 && fred.getPos() == 2)) { //si los dos estan
//                    chic.setPos(5);
//                }
//
//                if (chic.getPos() == 3 && chic.getPos() == 4 && fred.getPos() == 2) { //si los dos estan
//                    chic.setPos(5);
//                }
//
//            }
//
//        }
//
//    }

}
