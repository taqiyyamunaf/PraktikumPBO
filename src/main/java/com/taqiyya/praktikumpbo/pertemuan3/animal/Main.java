
package com.taqiyya.praktikumpbo.pertemuan3.animal;

public class Main {
    public static void main(String[] args) {
         // -- Pembuatan Class --
        Animal cat = new Animal("Miyu", 3, "Black");
        Animal dog = new Animal("Shepard", 2, "Brown");
        Animal rabbit = new Animal("Snowball", 1, "White");

        // Menjalankan method 'showProfile()' masing-masing object
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
        // gett and sett
        System.out.println(" Dog's name (before) : " + dog.getName());
        dog.setName("Hechi");
        System.out.println(" Dog's name (after) : " + dog.getName());
    }    
    
}
