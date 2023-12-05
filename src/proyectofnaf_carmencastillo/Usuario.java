/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

/**
 *
 * @author casti
 */
public class Usuario {
    
    private String Usuario;
    private int Partida;
    private boolean Noche1;
    private boolean Noche2;
    private boolean Noche3;
    private boolean Noche4;
    private boolean Costume;

    public Usuario() {
    }

    public Usuario(String Usuario, int Partida) {
        this.Usuario = Usuario;
        this.Partida = Partida;
    }

    public Usuario(String Usuario, int Partida, boolean Noche1, boolean Noche2, boolean Noche3, boolean Noche4, boolean Costume) {
        this.Usuario = Usuario;
        this.Partida = Partida;
        this.Noche1 = Noche1;
        this.Noche2 = Noche2;
        this.Noche3 = Noche3;
        this.Noche4 = Noche4;
        this.Costume = Costume;
    }
    
    

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getPartida() {
        return Partida;
    }

    public void setPartida(int Partida) {
        this.Partida = Partida;
    }
    
    
    
    //hacer el usuario Admin en duro??? supongo

    public boolean isNoche1() {
        return Noche1;
    }

    public void setNoche1(boolean Noche1) {
        this.Noche1 = Noche1;
    }

    public boolean isNoche2() {
        return Noche2;
    }

    public void setNoche2(boolean Noche2) {
        this.Noche2 = Noche2;
    }

    public boolean isNoche3() {
        return Noche3;
    }

    public void setNoche3(boolean Noche3) {
        this.Noche3 = Noche3;
    }

    public boolean isNoche4() {
        return Noche4;
    }

    public void setNoche4(boolean Noche4) {
        this.Noche4 = Noche4;
    }

    public boolean isCostume() {
        return Costume;
    }

    public void setCostume(boolean Costume) {
        this.Costume = Costume;
    }
    
}
    