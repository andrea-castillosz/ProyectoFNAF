/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

import javax.accessibility.AccessibleContext;
import javax.swing.ImageIcon;
import javax.swing.JRootPane;

/**
 *
 * @author casti
 */
public class Noche1 extends Main implements Runnable {

    public static boolean gamestart = true;
    public static String camlocation;

    public static Main main = new Main();
    public static Bonnie bon = new Bonnie(3, 0, false);
    public static Chica chic = new Chica(0, 0, false);
    public static Freddy fred = new Freddy(0, 0, false);
    public static Foxy fox = new Foxy(0, 0, false);
    public static GFreddy gf = new GFreddy(0, false);

    public Noche1() {
    }

    public static boolean isGamestart() {
        return gamestart;
    }

    public static void setGamestart(boolean gamestart) {
        Noche1.gamestart = gamestart;
    }

    public static String getCamlocation() {
        return camlocation;
    }

    public static void setCamlocation(String camlocation) {
        Noche1.camlocation = camlocation;
    }

    public static Main getMain() {
        return main;
    }

    public static void setMain(Main main) {
        Noche1.main = main;
    }

    public static Bonnie getBon() {
        return bon;
    }

    public static void setBon(Bonnie bon) {
        Noche1.bon = bon;
    }

    public static Chica getChic() {
        return chic;
    }

    public static void setChic(Chica chic) {
        Noche1.chic = chic;
    }

//    public JRootPane getRootPane() {
//        return rootPane;
//    }
//
//    public void setRootPane(JRootPane rootPane) {
//        this.rootPane = rootPane;
//    }
//
//    public boolean isRootPaneCheckingEnabled() {
//        return rootPaneCheckingEnabled;
//    }
//
//    public void setRootPaneCheckingEnabled(boolean rootPaneCheckingEnabled) {
//        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
//    }
//
//    public AccessibleContext getAccessibleContext() {
//        return accessibleContext;
//    }
//
//    public void setAccessibleContext(AccessibleContext accessibleContext) {
//        this.accessibleContext = accessibleContext;
//    }
//
//    public AccessibleContext getAccessibleContext() {
//        return accessibleContext;
//    }
//
//    public void setAccessibleContext(AccessibleContext accessibleContext) {
//        this.accessibleContext = accessibleContext;
//    }
    @Override
    public void run() {

        if (gamestart == true) {
            bon.movimiento();
            chic.movimiento();

            if (main.getNombreCam().equals("stage")) { // 1A
                if (bon.getPos() == 0 && chic.getPos() == 0 && fred.getPos() == 0) { //estan los tres
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() == 0 && fred.getPos() == 0) { //estan sin bonnie
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/SHSsinBonnie.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() == 0 && fred.getPos() == 0) { //estan sin chica
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/SHSsinChica.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() == 0 && chic.getPos() != 0 && fred.getPos() != 0) { //SIN FREDDY
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/SHSSinFreddy.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0 && fred.getPos() == 0) { //solo freddy
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/SHSSOLOFreddy.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0 && fred.getPos() != 0) { //NADIE
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/SHSNadie.jpg"));
                    main.setSetearCamara(showstage_todos);
                }

            } else if (main.getNombreCam().equals("dinning")) { //1, 2 BONNIE Y CHICA //FREDDY SOLO 1 // bon 1 2 / chic 1 2 / fred 1 //1B

                if (bon.getPos() != 1 && chic.getPos() != 1 && chic.getPos() != 2 && bon.getPos() != 2 && fred.getPos() != 1) { //vacio
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerVacio.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 1 && chic.getPos() != 1 && chic.getPos() != 2 && bon.getPos() != 2 && fred.getPos() == 1) { //freddy atras
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerFreddy.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() == 1 && chic.getPos() != 1 && chic.getPos() != 2 && bon.getPos() != 2 && fred.getPos() != 1) { //bonnie 1
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerBonnie1.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 1 && chic.getPos() != 1 && chic.getPos() != 2 && bon.getPos() == 2 && fred.getPos() != 1) { //bonnie 2
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerBonnie2.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 1 && chic.getPos() == 1 && chic.getPos() != 2 && bon.getPos() != 2 && fred.getPos() != 1) { //chica 1
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerChica1.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 1 && chic.getPos() != 1 && chic.getPos() == 2 && bon.getPos() != 2 && fred.getPos() != 1) { //chica 2
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/DinnerChica2.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if ((bon.getPos() == 1 && chic.getPos() == 1) || (chic.getPos() == 2 && bon.getPos() == 2) && fred.getPos() != 1) { //si estan bonnie y chica
                    bon.setPos(3);
                }
                if ((bon.getPos() == 1 && chic.getPos() == 2) || (chic.getPos() == 1 && bon.getPos() == 2) && fred.getPos() != 1) { //si estan bonnie y 
                    bon.setPos(3);
                }
                if ((bon.getPos() == 1 && fred.getPos() == 1) || (fred.getPos() == 1 && bon.getPos() == 2) && chic.getPos() != 1 && chic.getPos() != 2) { //si estan bonnie y freddy
                    bon.setPos(3);
                }
                if ((chic.getPos() == 1 && fred.getPos() == 1) || (fred.getPos() == 1 && chic.getPos() == 2) && bon.getPos() != 1 && bon.getPos() != 2) { //si estan freddy y chica
                    chic.setPos(3);
                }
                if ((chic.getPos() == 1 && bon.getPos() == 1 && fred.getPos() == 1) || (bon.getPos() == 2 && chic.getPos() == 2 && fred.getPos() == 1) || (bon.getPos() == 1 && chic.getPos() == 2 && fred.getPos() == 1) || (bon.getPos() == 2 && chic.getPos() == 1 && fred.getPos() == 1)) { //si estan los tres
                    bon.setPos(3);
                    chic.setPos(3);
                }

            } else if (main.getNombreCam().equals("pirateCove")) { //FOXY 0 1 2 y si se fue // 1C

                if (fox.getPos() == 0) { //no se ha abierto
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/PirateC_0.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (fox.getPos() == 1) { //se abrio 
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/PirateC_1.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (fox.getPos() == 2) { //salio
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/PirateC_2.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (fox.getPos() != 0 && fox.getPos() != 1 && fox.getPos() != 2) { //se fue
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/PirateC_Vacio.jpg"));
                    main.setSetearCamara(showstage_todos);
                }

            } else if (main.getNombreCam().equals("wHall")) { // gif fox 3 / bon 5 //2A

                if (bon.getPos() != 5 && fox.getPos() != 3) { //VACIO
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/wHallVacio.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() == 5 && fox.getPos() != 3) { //BONNIE /tiene 7 posiciones creo
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/wHallBonnie.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 5 && fox.getPos() == 3) { //gif foxy
//                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/.jpg"));
//                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() == 5 && fox.getPos() == 3) { //si los dos estan
                    bon.setPos(4);
                }

            } else if (main.getNombreCam().equals("wHallCorner")) { //bon 7 // gf no se //2B

                if (bon.getPos() == 0 && chic.getPos() == 0) { //VACIO
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() == 0) { //gf
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //bonnie
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //si los dos estan
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }

            } else if (main.getNombreCam().equals("supplyCloset")) { // bon 6         //3

                if (bon.getPos() == 0 && chic.getPos() == 0) { //VACIO
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() == 0) { //bonnie
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }

            } else if (main.getNombreCam().equals("eHall")) { //chic 6 7 / fred 3 //4A

                if (bon.getPos() == 0 && chic.getPos() == 0) { //VACIO
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() == 0) { //FREDDY
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //CHICA
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //CHICA CERCA
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //si los dos estan
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }

            } else if (main.getNombreCam().equals("eHallCorner")) { //chic 8 / fred 4 //4B

                if (bon.getPos() == 0 && chic.getPos() == 0) { //vacio
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() == 0) { //freddy
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //chica
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //si estan los dos
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }

            } else if (main.getNombreCam().equals("backstage")) { //bon 3 4            //5

                if (bon.getPos() == 0 && chic.getPos() == 0) { //vacio
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() == 0) { //bonnie
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //bonnie
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }

            } else if (main.getNombreCam().equals("kitchen")) { //chic 5            //6

                if (bon.getPos() == 0 && chic.getPos() == 0) { //camara desabilitada
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }

            } else if (main.getNombreCam().equals("restrooms")) { //chic 3 4 / fred 2     //7

                if (bon.getPos() == 0 && chic.getPos() == 0) { //vacio
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() == 0) { //freddy
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //chica
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //chica
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }
                if (bon.getPos() != 0 && chic.getPos() != 0) { //si estan los dos
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);
                }

            }

        }

    }

}
