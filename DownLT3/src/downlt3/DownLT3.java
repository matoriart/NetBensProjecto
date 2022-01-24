/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downlt3;

/**
 *
 * @author user
 */
public class DownLT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y,z;
        x = 5;
        y = 10;
        z = 5;
        System.out.println("Nilai Panjang Balok :"+x);
        System.out.println("Nilai Lebar Balok : "+y);
        System.out.println("Nilai Tinggi Balok : "+z);
        System.out.println("=======================");
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("=======================");
        System.out.println("Luas Permukaan Balok = "+((2*x*y)+(2*x*z)+(2*y*z)));
    }
    
}
