/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainbplps;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PersegiPanjang extends BangunDatar {
    Scanner PP = new Scanner(System.in);
    float panjang;
    float lebar;
    void Panjang(){
        
        System.out.print("Masukkan Panjang : ");
        panjang = PP.nextFloat();
    }
    void Lebar(){
        
        System.out.print("Masukkan Lebar : ");
        lebar = PP.nextFloat();
    }
    
}
