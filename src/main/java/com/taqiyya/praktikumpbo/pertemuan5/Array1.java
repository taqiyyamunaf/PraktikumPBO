
package com.taqiyya.praktikumpbo.pertemuan5;

public class Array1 {
    public static void main(String[] args) {
        // pembuatan array
        String[] names = new String[5];
        
        // cek panjang array
        System.out.println("Panjang array : " +names.length);
        
        // memasukkan nilai ke array
        names[0] = "Marklee";
        names[1] = "Heachan lee";
        names[2] = "Johnny suh";
        names[3] = "Jaemin na";
        names[4] = "Jeno lee";
        
        // menampilkan semua nilai array
        for(int i =0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
    }
    
}
