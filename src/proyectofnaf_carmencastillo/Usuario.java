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

    public Usuario() {
    }

    public Usuario(String Usuario, int Partida) {
        this.Usuario = Usuario;
        this.Partida = Partida;
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
    
}
    