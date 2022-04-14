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
public class Segitiga extends BangunDatar {
   Scanner S = new Scanner(System.in);
   float tinggi;
   float alas;
   void Alas() {
      
      System.out.print("Masukkan Alas : ");
      alas = S.nextFloat();
   }
   void Tinggi() {
       
       System.out.print("Masukkan Tinggi : ");
       tinggi = S.nextFloat();
   }
}
