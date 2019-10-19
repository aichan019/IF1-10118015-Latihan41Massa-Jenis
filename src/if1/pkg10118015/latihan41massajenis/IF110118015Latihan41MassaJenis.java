/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan41massajenis;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini dapat Menghitung Massa Jenis Kubus
 */
public class IF110118015Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : "+kubus.getSisi());
        System.out.println("massa : "+kubus.getMassa());
        System.out.println();
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : "+kubus.volume(kubus.getSisi()));
        System.out.println("Massa Jenis : "+kubus.hitungMassaJenis(kubus.getMassa(), kubus.volume(kubus.getSisi())));
    }
    
}
