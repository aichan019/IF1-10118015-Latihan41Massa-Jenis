/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan41massajenis;

/**
 *
 * @author ACER
 */
public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int volume(int parsisi){
        return (sisi * sisi * sisi);
    }
    
    public int hitungMassaJenis(int parmassa, int volume){
        return parmassa / volume;
    }
}
