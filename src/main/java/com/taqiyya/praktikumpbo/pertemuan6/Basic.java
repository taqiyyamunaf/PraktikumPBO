
package com.taqiyya.praktikumpbo.pertemuan6;

public class Basic {
    public static void main(String[] args) {
        // membuat array isi 3
        int [] myNumbers = {1,2,3,};
        
        // uji coba print nilai array index ke-10
        try{
        System.out.println(myNumbers[10]);
    }
        //Indek suatu larik (array) tidak di dalam panjang larik (array.length).
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(" try again!");
       }
    }
}