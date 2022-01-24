/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe;

/**
 *
 * @author user
 */
public class PE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][] = {{2,3}, {3,1}};
        int b[][] = {{5}, {1}};
        int t[][]={{0},{0}};
        System.out.println("");
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 1; y++) {
                for (int z = 0; z < 2; z++) {
                    t[x][y]=t[x][y]+a[x][z] * b[z][y];
                }
            }
        }
        for(int x=0;x<2;x++){
            for(int y=0;y<1;y++){
                System.out.print(t[x][y]+"\t");
            }
            System.out.println();
        }
    }

}
