
package com.taqiyya.praktikumpbo.praktikum4.kendaraan;

public class Kendaraan {
    
    // variable 
    String nama;
    int jmlRoda;
    
    // method
    public void nyalakanMesin() {
        System.out.println("Mesin : " + nama + "Telah dinyalakan");
    }
    public void showInfo() {
        System.out.println("Nama : " + nama );
        System.out.println("Jumlah Roda : " +jmlRoda);
        extraInfo();
        
    }
    public void extraInfo() {
        
    }
}
