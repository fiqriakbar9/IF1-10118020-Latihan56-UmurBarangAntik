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
public class Radio extends BarangAntik{

    private String name;
    
    public Radio(int umur) {
        super(umur);
        this.umur = umur;
    }
    
    public String getName(){
        return name;        
    }
    
    public void setName(String name){
        this.name= name;
    }
    
}
