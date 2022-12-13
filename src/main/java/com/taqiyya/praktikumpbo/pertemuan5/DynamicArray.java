
package com.taqiyya.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        // deklarasi Scanner untuk user input nanati
        Scanner input = new Scanner(System.in);
        
        // membuat agar panjang array ditentukan input user
        System.out.println(" ** PROGRAM INPUT NILAI ** ");
        System.out.println("Masukkan jumlah matkul : ");
        int jml = input.nextInt();
        System.out.println();
        
        // membuat array baru dengan panjang sesuai input user
        int[] nilai = new int [jml];
        float jumlah = 0;
        
        // memasukkan nilai ke array
        for(int i=0; i<jml; i++){
            System.out.println(" Masukkan nilai ke- " + (i+1) + ": ");
            nilai [i] = input.nextInt();
        }
        System.out.println();
        // menampilkan semua nilai array
        for(int i=0; i<jml; i++){
            System.out.println(i + " : " + nilai[i]);
            
        }
    }
}
