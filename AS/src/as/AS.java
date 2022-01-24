/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program Perkalian Matrix 2×2  dengan Matrix 2×3");
        Scanner input = new Scanner(System.in);///inputan dari keyboard
        int x[][] = new int[2][2];//x merupakan baris
        int y[][] = new int[2][3];//y merupakan kolom
        int z[][] = new int[2][3];//z merupakan hasil
        System.out.println("\nMasukkan nilai matrix 1 ordo 2×2: ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                x[i][j] = input.nextInt();//program disini merupakan inputan dari baris
            }
        }
        System.out.println("\nMasukkan nilai matrix 2 ordo 2×3: ");
        for (int k = 0; k <= 1; k++) {
            for (int l = 0; l <= 2; l++) {
                System.out.print("[" + k + "][" + l + "]: ");
                y[k][l] = input.nextInt();//program disini merupakan inputan dari kolom
            }
        }
//dibawah ini merupakan perakalian matriks dalam program
        z[0][0] = x[0][0] * y[0][0] + x[0][1] * y[1][0];
        z[0][1] = x[0][0] * y[0][1] + x[0][1] * y[1][1];
        z[0][2] = x[0][0] * y[0][2] + x[0][1] * y[1][2];
        z[1][0] = x[1][0] * y[0][0] + x[1][1] * y[1][0];
        z[1][1] = x[1][0] * y[0][1] + x[1][1] * y[1][1];
        z[1][2] = x[1][0] * y[0][2] + x[1][1] * y[1][2];
        System.out.println("\nMatrix 1 * Matrix 2= ");
        for (int m = 0; m <= 1; m++) {
            for (int n = 0; n <= 2; n++) {
                System.out.print(z[m][n] + "\t");
            }
            System.out.println("");
        }
        
    }

}

