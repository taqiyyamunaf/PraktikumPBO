
package com.taqiyya.praktikumpbo.pertemuan6.tugas;

public class Exception {
    public static void main(String[] args) {
        String str = " Menghitung panjang ";
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.println();
        System.out.println("Panjang String : " + str.length());
        try{
        // mengakses elemen lebih besar dari panjang string
        System.out.println(str.charAt(40));
        }catch(StringIndexOutOfBoundsException e){
        System.out.println(" Terjadi Exception");
        }
    }
}
