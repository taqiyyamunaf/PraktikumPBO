
package com.taqiyya.praktikumpbo.QUIZ1_S1SI05B_3104;

public class Dokter_3104 extends Penduduk_3104 {
    
    public class Dokter {
        private int jmlBeratIkan;
        private int jmlSolar;

        public Dokter(int jmlBeratIkan, int jmlSolar) {
            this.jmlBeratIkan = jmlBeratIkan;
            this.jmlSolar = jmlSolar;
        }

        public int getJmlBeratIkan() {
            return jmlBeratIkan;
        }

        public void setJmlBeratIkan(int jmlBeratIkan) {
            this.jmlBeratIkan = jmlBeratIkan;
        }

        public int getJmlSolar() {
            return jmlSolar;
        }

        public void setJmlSolar(int jmlSolar) {
            this.jmlSolar = jmlSolar;
        }
        
        
    }
    public void totalPendapatanDokter (Double pendapatan){
        System.out.println("Total pendapatan dokter : " + pendapatan);
    }
    public void tampilDataDokter (){
        
    }
}
