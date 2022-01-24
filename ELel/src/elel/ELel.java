/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elel;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ELel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        int pil;
        System.out.println("################");
        System.out.println("1. Masukkan Biodata");
        System.out.println("2. Selesai");
        System.out.println("Masukkan pilihan: ");
        pil=in.nextInt();
       
        switch(pil)
        {
            case 1:
                System.out.println("################");
                System.out.println("BIODATA");
               
                Scanner pilihan=new Scanner(System.in);
                String nama;
                System.out.println("Masukkan nama: ");
                nama=pilihan.nextLine();
                System.out.println("Masukkan NIM: ");
                long nim=pilihan.nextLong();
               
                Scanner pilihan2=new Scanner(System.in);
                System.out.println("Masukkan Prodi: ");
                String prodi=pilihan2.nextLine();
                System.out.println(" ");
                System.out.println("#############");
                System.out.println("BIODATA");
                System.out.println("#############");
               
                System.out.println("Nama:" +nama);
                System.out.println("NIM: " +nim);
                System.out.println("Prodi: "+prodi);
                break;
               
            case 2:
                System.out.println("Selesai");
                break;
            default: System.out.println("Pilihan Tidak diketahui");     
        }
    }
    
}
