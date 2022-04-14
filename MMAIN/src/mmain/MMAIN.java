/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmain;
import java.util.Scanner;

/**
 *
 * @author NoName
 */
public class MMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ingput = new Scanner(System.in);
        String B;
        Nilai X = new Nilai();
        System.out.print("Masukkan Nilai Matematika : ");
        X.nilai(Ingput.nextInt());
        System.out.print("Masukkan Nilai Fisika : ");
        X.nilai(Ingput.nextInt(), Ingput.nextLine());
        System.out.print("Masukkan Nilai : ");
        X.nilai(Ingput.nextDouble());
        
    }
    
}
