/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Praktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menghitung Luas Bola");
       Scanner user = new Scanner(System.in);
        System.out.print("Masukkan Luas Bola :");
        double luas = user.nextDouble();
        System.out.println("Hasil :"+luas*luas*22/7*4);
    }
    
}
