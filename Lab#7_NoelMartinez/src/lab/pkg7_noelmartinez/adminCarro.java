/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_noelmartinez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author noelg
 */
public class adminCarro {
    private ArrayList<Carro> CarrosBin = new ArrayList();
    private File archivo = null;
    
    public adminCarro(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carro> getCarrosBin() {
        return CarrosBin;
    }

    public void setCarrosBin(ArrayList<Carro> CarrosBin) {
        this.CarrosBin = CarrosBin;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminCarro{" + "CarrosBin=" + CarrosBin + ", archivo=" + archivo + '}';
    }
    //extra mutador
    public void setCarro(Carro c) {
        this.CarrosBin.add(c);
    }

    public void cargarArchivo() {
        try {            
            CarrosBin = new ArrayList();
            Carro temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carro) objeto.readObject()) != null) {
                        CarrosBin.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carro t : CarrosBin) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
