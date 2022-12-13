
package com.taqiyya.praktikumpbo.pertemuan6.tugas;

public class Exception3 {
    public static void main(String[] args) {
        try{
        Object[] array = new String[3];
        array[0] = 8;
        }catch(ArrayStoreException e){
        System.out.println(" Running....");
        }
    }
}