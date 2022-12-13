
package com.taqiyya.praktikumpbo.prt3.Novel;


public class Novel {
    // tidak perlu menggunakan main, karena bukan program utama
    // atribut
     private String judul;
     private String penulis;
     private String harga;
    
   // Constructur
    public Novel(){};
    
    // alt + fn + insert + construktur + select all// alt + fn + insert + construktur + select all
    public Novel(String judul, String penulis, String harga){
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public void showProfile() {
        System.out.println(" Judul : " + judul);
        System.out.println(" Penulis : " + penulis);
        System.out.println(" Harga : " + harga);
    }
    // alt + fn + insert + getter and setter + select all
    // fungsi getter & setter 

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

}
