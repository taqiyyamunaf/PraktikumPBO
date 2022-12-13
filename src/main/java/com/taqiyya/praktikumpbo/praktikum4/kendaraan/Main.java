
package com.taqiyya.praktikumpbo.praktikum4.kendaraan;

public class Main {
    public static void main(String[] args) {
        // class object = new class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Motor mt = new Motor();
        
        // memasukkan nilai atribut
        mb.nama = "KIA";
        mb.jmlRoda = 4;
        
        kn.nama = "Kuda Poni";
        kn.jmlRoda = 3;
        
        mt.nama = "SUPRA";
        mt.jmlRoda = 5;
        
        // uji coba pemanggilan method
        mb.showInfo();
        mb.belok("kiri");
        mb.belok();
        
        mt.showInfo();
        mt.bhnBakar("pertamax");
        
        
    }
}
