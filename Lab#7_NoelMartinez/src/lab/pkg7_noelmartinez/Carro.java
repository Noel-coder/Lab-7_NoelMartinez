/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_noelmartinez;

import java.io.Serializable;

/**
 *
 * @author noelg
 */
public class Carro implements Serializable {
    private String numPlaca;
    private String tamaño;
    private String numPuertas;
    private String Sucio;
    
    private static final long SerialVersionUID=777L;
    
    public Carro() {
    }
    
    public Carro(String numPlaca, String tamaño, String numPuertas, String Sucio) {
        this.numPlaca = numPlaca;
        this.tamaño = tamaño;
        this.numPuertas = numPuertas;
        this.Sucio = Sucio;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(String numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getSucio() {
        return Sucio;
    }

    public void setSucio(String Sucio) {
        this.Sucio = Sucio;
    }

    @Override
    public String toString() {
        return "Numero de placa: " + numPlaca + ", tama\u00f1o: " + tamaño + ", Numero de puertas: " + numPuertas + ", Suciedad: " + Sucio ;
    }
    
}
