/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umurbarangantik;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan nama barang antik
 * beserta umur dair barang antik tersebut
 * 
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(234);
        
        radio.setName("Radio AM");
        System.out.println("Nama barang Antik : "+radio.getName());
        radio.tampilUmur();
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }
    
}
