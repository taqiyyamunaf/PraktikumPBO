
package com.taqiyya.praktikumpbo.praktikum4.tugas;

public class Dolphin extends Binatang{
    // kegunaan extends, yaitu untuk memanggil fungsi dari class lain.
    public void kembangbiak(String kembangbiak) {
        System.out.println(" Dolphin, Berkembang biak dengan cara " + kembangbiak + "!");
    }
     public void habitat (String habitat){
            System.out.println(" Cheetah, berhabitat di " + habitat + "!");
    }
    public void jmlKaki(){
        System.out.println("Error : Dolphin tidak memiliki kaki!");
        
    }
}
