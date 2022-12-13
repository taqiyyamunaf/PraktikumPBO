
package com.taqiyya.praktikumpbo.QUIZ1_S1SI05B_3104;

public class Main_3104 {
        public static void main(String[] args) {
        // class object = new class()
        Penduduk_3104 pd = new Penduduk_3104();
        Nelayan_3104 nl = new Nelayan_3104();
        Dokter_3104 dk = new Dokter_3104();
        
        // memasukkan nilai atribut
        nl.nik_3104 = "1001";
        nl.nama_3104 = "Indi";
        nl.umur_3104 = 45;
        nl.alamat_3104 = "Purwokerto";
        
        dk.nik_3104 = "1003";
        dk.nama_3104 = "Indah";
        dk.umur_3104 = 40;
        dk.alamat_3104 = "Purwokerto";
        
        // uji coba pemanggilan method
        nl.showInfo();
        nl.tampilDataNelayan();
        
        dk.showInfo();
        dk.tampilDataDokter();
        } 
    }
