
package com.taqiyya.praktikumpbo.praktikum4.kendaraan;

public class Mobil extends Kendaraan {
    public void belok(String arah) {
        System.out.println(" Mobil : " + nama + " belok ke " + arah + "!");
    }
    public void belok(){
        System.out.println("Error : Mohon masukkan arah");
        
    }
    
}
