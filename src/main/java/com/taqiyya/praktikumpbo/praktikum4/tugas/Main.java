
package com.taqiyya.praktikumpbo.praktikum4.tugas;

public class Main {
    public static void main(String[] args) {
        // class object = new class()
        Cheetah ct = new Cheetah();
        Binatang bn = new Binatang();
        Dolphin dl = new Dolphin();
        
        // memasukkan nilai atribut
        bn.nama = "Jerapah";
        bn.jenis = "Herbivora";
        bn.jmlKaki = 4;
        
        ct.nama = "Cheetah";
        ct.jenis = "Carnivora";
        ct.jmlKaki = 4;
        
        dl.nama = "Dolphin";
        dl.jenis = "Carnivora";
        dl.jmlKaki = 2;
           
        
        // uji coba pemanggilan method
        bn.showInfo();
        System.out.println("----------");
        
        ct.showInfo();
        ct.kembangbiak("Melahirkan");
        ct.habitat("Gurun");
        System.out.println("----------");
        
        dl.showInfo();
        dl.kembangbiak("Melahirkan, Menyusui");
        dl.habitat("Dilaut");
        dl.jmlKaki();
        
    }
    
}
