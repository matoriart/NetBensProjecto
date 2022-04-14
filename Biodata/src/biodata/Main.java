/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

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
        Scanner input = new Scanner(System.in);
        Profile X = new Profile();
        System.out.println("---------------------");
        System.out.print("Masukkan Nama : ");
        X.Biodata(input.nextLine());
        System.out.print("Masukkan Kelas : ");
        X.Biodata(input.nextInt());
        System.out.println("---------------------");
        
    }
   
}
