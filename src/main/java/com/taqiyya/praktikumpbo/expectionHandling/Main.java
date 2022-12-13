package com.taqiyya.praktikumpbo.expectionHandling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pembilang, penyebut, hasil;
        System.out.println(" Masukkan pembilang >> ");
        pembilang = input.nextInt();
        System.out.println(" Masukkan penyebut >> ");
        penyebut = input.nextInt();
        hasil = pembilang / penyebut;
        System.out.println(pembilang + " / " + penyebut + " = " + hasil);
    }
    
}
