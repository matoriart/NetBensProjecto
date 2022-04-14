/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner OK = new Scanner(System.in);
        String ML;
        Member nj = new Member();
        System.out.println("1. Tampilkan Member");
        System.out.println("2. Tampilkan Alamat");
        System.out.println("Masukkan Nomor :");
        ML = OK.nextLine();
        if (ML.equalsIgnoreCase("1")){
            System.out.println("Member :");
            System.out.println(nj.getTelepon());
        }else if(ML.equalsIgnoreCase("2")){
            System.out.println("Alamat :");
            System.out.println(nj.getAlamat());
        }else {
            System.out.println("Yowai");
        }
    }
    
}
