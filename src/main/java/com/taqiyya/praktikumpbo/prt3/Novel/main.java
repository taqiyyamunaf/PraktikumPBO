
package com.taqiyya.praktikumpbo.prt3.Novel;

public class main {
        public static void main(String[] args) {
         // -- Pembuatan Class --
        Novel satu = new Novel("KATA", "Rintik Sedu", "Rp. 99.000");
        Novel dua = new Novel(" Per;fect ", "Litaniraya", "Rp. 150.000");
        Novel tiga = new Novel("Butterflies", "Alesacakes", "Rp. 123.000");

        // Menjalankan method 'showProfile()' masing-masing object
        satu.showProfile();
        dua.showProfile();
        tiga.showProfile();
        
    }  
}
