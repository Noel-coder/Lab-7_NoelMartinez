/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_noelmartinez;

import javax.swing.JProgressBar;

/**
 *
 * @author noelg
 */
public class Hilo1 extends Thread {
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private double mult;

    public Hilo1(JProgressBar barra, double mult) {
        this.barra = barra;
        avanzar = true;
        vive=true;
        this.mult = mult;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getMult() {
        return mult;
    }

    public void setMult(double mult) {
        this.mult = mult;
    }

    @Override
    public String toString() {
        return "Hilo1{" + "barra=" + barra + ", avanzar=" + avanzar + ", vive=" + vive + ", mult=" + mult + '}';
    }
    
    public void run(){
        while (vive) {            
            if (avanzar) {
                barra.setValue(barra.getValue()+ (int)(100/mult));
                if (barra.getValue()== 100000000) {
                    vive=false;
                }
            }
            try {
                Thread.sleep(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
