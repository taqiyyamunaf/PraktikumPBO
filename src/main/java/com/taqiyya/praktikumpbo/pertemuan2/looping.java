
package com.taqiyya.praktikumpbo.pertemuan2;
public class looping {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Looping...(" + 1 + "/5)");   
        }
        System.out.println("For Loop selesai \n");
        
        int j = 0;
        while(j<5){
        System.out.println("Looping...(" + j + "/5");
        j++;
    }
        System.out.println("While Loop Selesai : \n");
        
        int k =0;
        do{
            System.out.println("Looping...(" + k + "/5)");
            k++;
        }while(k<5);
        System.out.println("Do While Loop Selesai : \n");
}
}
