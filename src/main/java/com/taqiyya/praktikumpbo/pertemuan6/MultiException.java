
package com.taqiyya.praktikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        // membuat lebih dari satu exception
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Masukkan bilangan : ");
            int bilangan = input.nextInt();
            
            System.out.println("Masukkan pembagi : ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan / pembagi;
            
            // jika kita memasukkan nilai tidak sesuai, perintah dibawah tidak akan berjalan. akan langsung ke catch
            System.out.println("Hasil pembagian (dibulatkan) : " + hasil);
        }
        // kegunaan catch untuk menangkap kesalahan/ bug
        // Error aritmatika misalnya operasi pembagian suatu nilai numerik dengan 0
        catch(ArithmeticException e){
            System.out.println("Bilangan tidak bisa dibagi 0!");
        }
        // kesalahan saat memasukkan nilai yang tidak sesuai
        catch(InputMismatchException e){
            System.out.println("Harap masukkan angka saja!");
        }
        
    }
    
}
