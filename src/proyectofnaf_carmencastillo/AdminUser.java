/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofnaf_carmencastillo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author casti
 */
public class AdminUser {

    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private File archivo = null;

    public AdminUser(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
    
    public void setUsuario(Usuario c) {
        listaUsuarios.add(c);
    }

    public void cargarArchivo() {
        try {
            listaUsuarios = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto //BUFFER
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) { //MIENTRAS NO HAYA NULO
                        listaUsuarios.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo); //que el canal apunte al archivo
            bw = new ObjectOutputStream(fw); //que el biffer apunte al canal
            for (Usuario t : listaUsuarios) {
                bw.writeObject(t);
            }
            bw.flush(); //flush de la memoria RAM a ROM
        } catch (Exception ex) {
        } finally { //opcinal, finally es un bloque que siempre se va ejecutar este o no, solo es por elegancia 
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
