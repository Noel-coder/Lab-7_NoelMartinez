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
public class adminEmpleado {
    private ArrayList <Empleado> EmpleadosBin = new ArrayList();
    private File archivo = null;
    
    public adminEmpleado(String path) {
        archivo = new File(path);
    }
    
    public ArrayList<Empleado> getEmpleadosBin() {
        return EmpleadosBin;
    }

    public void setEmpleadosBin(ArrayList<Empleado> EmpleadosBin) {
        this.EmpleadosBin = EmpleadosBin;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    //extra mutador
    public void setEmpleado(Empleado e) {
        this.EmpleadosBin.add(e);
    }

    public void cargarArchivo() {
        try {            
            EmpleadosBin = new ArrayList();
            Empleado temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Empleado) objeto.readObject()) != null) {
                        EmpleadosBin.add(temp);
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
            for (Empleado t : EmpleadosBin) {
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
