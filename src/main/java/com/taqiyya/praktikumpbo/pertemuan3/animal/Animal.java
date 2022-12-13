
package com.taqiyya.praktikumpbo.pertemuan3.animal;

public class Animal {
    // tidak perlu menggunakan main, karena bukan program utama
    // atribut
     private String name;
     private int age;
     private String color;
    
   // Constructur
    public Animal(){};
    
    // alt + fn + insert + construktur + select all
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
     
    public void showProfile(){
        System.out.println(" Name : " + name);
        System.out.println(" Age : " + age);
        System.out.println(" Color : " + color);
    }
    // alt + fn + insert + getter and setter + select all
    // fungsi getter & setter 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
