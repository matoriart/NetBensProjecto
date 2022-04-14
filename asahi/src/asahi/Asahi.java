/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asahi;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Asahi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int harga = 0, bayar = 0, biaya_administrasi = 10000;
        String[] tarif = {"1. 10m3 pertama", "2. 10m3 kedua", "3. 10m3 ketiga", "4. 10m3 keempat atau lebih"};
        int air;
        System.out.print("Pilihan pembayaran air: ");

        
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih angka sesuai opsi diatas berdasarkan air yang telah Anda gunakan: ");
        air = input.nextInt();
        
        if(air >= 1 &&  air<= 10){
            harga = 2000;
            bayar = harga + biaya_administrasi;
            System.out.println("Harga: Rp"+harga);
            System.out.println("Biaya administrasi: Rp"+biaya_administrasi);
            System.out.println("Total harga: Rp"+bayar);
        } else if(air >= 11 && air <=20){
            harga = 3000;
            bayar = harga + biaya_administrasi;
            System.out.println("Harga: Rp"+harga);
            System.out.println("Biaya administrasi: Rp"+biaya_administrasi);
            System.out.println("Total harga: Rp"+bayar);
        } else if(air >= 21 && air <=30){
            harga = 4000;
            bayar = harga + biaya_administrasi;
            System.out.println("Harga: Rp"+harga);
            System.out.println("Biaya administrasi: Rp"+biaya_administrasi);
            System.out.println("Total harga: Rp"+bayar);
        } else if(air >=31 && air <=40){
            harga = 5000;
            bayar = harga + biaya_administrasi;
            System.out.println("Harga: Rp"+harga);
            System.out.println("Biaya administrasi: Rp"+biaya_administrasi);
            System.out.println("Total harga: Rp"+bayar);
        } else{
            System.out.println("Cek Ulang");
        }
        
    }
    
}
