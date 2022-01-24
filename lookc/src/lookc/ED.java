/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lookc;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ED {
    
    static int OS(int nilai) {
        int bayar = 5000;
        nilai = nilai - 10;

        
        if (nilai > 10) {
            bayar = bayar + 6000;
            nilai = nilai - 10;
        } else {
            bayar = bayar + 3000 * nilai;
            nilai = 0;
        }

        
        if (nilai > 10) {
            bayar = bayar + 7000;
            nilai = nilai - 10;
        } else {
            bayar = bayar + 4000 * nilai;
            nilai = 0;
        }

        
        if (nilai > 10) {
            bayar = bayar + 8000 * nilai;
        }

        return bayar;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id[]={1,2,3,4,5};
        String nama[]={"Dina","Kiki","Robby","Fatwa","Ulya"};
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan ID");
        String InID=in.nextLine();
        int LL=Integer.valueOf(InID);
        
        System.out.println("Masukkan Tagihan Pemakaian Air M3");
        String NZ=in.nextLine();
        int NX=Integer.valueOf(NZ);
        
        if(NX < 10) {
           NX = 7000; 
        }else {
                NX = OS(NX);
         }
        
        NX = NX + 20000;
        System.out.println("###################");
        System.out.println("ID : "+InID);
        System.out.println("--------------------");
        System.out.println("Nama : "+nama[LL - 1]);
        System.out.println("--------------------");
        System.out.println("Tagihan : Rp."+NX);
        System.out.println("###################");
    }
    
}
