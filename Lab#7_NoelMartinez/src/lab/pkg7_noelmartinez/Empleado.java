/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_noelmartinez;

import java.util.ArrayList;

/**
 *
 * @author noelg
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String edad;
    private ArrayList <Carro> CarrosEmpleado = new ArrayList();

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public ArrayList<Carro> getCarrosEmpleado() {
        return CarrosEmpleado;
    }

    public void setCarrosEmpleado(ArrayList<Carro> CarrosEmpleado) {
        this.CarrosEmpleado = CarrosEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado " + "Nombre= " + nombre + ", Apellido= " + apellido + ", Edad= " + edad + ", CarrosEmpleado= " + CarrosEmpleado;
    }
    
    
}
