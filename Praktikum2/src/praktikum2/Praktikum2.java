/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Praktikum2 {
public float celcius;
public float hasilR,hasilF,hasilK;
public float K;
public float F;
public float R;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner hitung = new Scanner(System.in);
        Praktikum2 op1 = new Praktikum2();
        System.out.print("Masukkan Celcious :");
        op1.celcius=hitung.nextInt();
        op1.hasil();
        op1.tHasilF();
        op1.tHasilK();
        op1.tHasilR();
        
        
        
    }
    public void hasil() {
        this.R = (float) (this.celcius * 0.8);
        this.F = (float) (this.celcius * 1.8 + 32);
        this.K = (float) (this.celcius + 273.15);
    }
    public void tHasilR () {
        System.out.println("Hasil konversi Reamur :"+this.R);
    }
    public void tHasilF (){
        System.out.println("Hasil konversi Farenheit :"+this.F);
    }
    public void tHasilK () {
        System.out.println("Hasil konversi Kelvin :"+this.K);
    }
}
