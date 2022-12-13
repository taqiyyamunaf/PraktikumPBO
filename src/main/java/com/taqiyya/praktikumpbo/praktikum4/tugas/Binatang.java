
package com.taqiyya.praktikumpbo.praktikum4.tugas;

public class Binatang {
    // variable 
    String nama;
    String jenis;
    int jmlKaki;
    
    // method
    public void pemakan() {
        System.out.println("Binatang : " + nama + " Pemakan Tumbuhan disebut" + jenis);
    }
    public void showInfo() {
        System.out.println("Nama : " + nama );
        System.out.println("Jenis : " +jenis);
        System.out.println("Jumlah Kaki : " +jmlKaki);
        extraInfo();
        
    }
    // extraInfo, berfungsi untuk menambahkan variable baru pada class, tapi di class lain tidak ada
    public void extraInfo() {
        
    }
    
}
