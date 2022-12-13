
package com.taqiyya.praktikumpbo.pertemuan6.tugas;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Masukkan angka : ");
        String strInput = input.nextLine();
        int intInput = 10;
        try{
        intInput = Integer.parseInt(strInput);
        System.out.println(strInput);
        System.out.println(" Success");
        }catch(NumberFormatException e){
            System.out.println(" Failed, masukkan angka saja");
        }
    }
}
