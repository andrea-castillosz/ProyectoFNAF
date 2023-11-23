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
    public static Chica chic = new Chica(3, 0, false);
    //public static Freddy fred = new Freddy(3, 0, false);
    //public static Foxy fox = new Foxy(3, 0, false);

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
            
            if (camlocation.equals("stage")) {
                if (bon.getPos() == 0 && chic.getPos() == 0) {
                    ImageIcon showstage_todos = new ImageIcon(getClass().getResource("/Imagenes/showstage_todos.jpg"));
                    main.setSetearCamara(showstage_todos);                    
                } else if (bon.getPos() == 1 && chic.getPos() == 0) {
                    
                    
                    
                }
                
            }
            
        }
        
    }
    
}
