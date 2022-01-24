/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang;

/**
 *
 * @author user
 */
public class BINTANG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y;
        for(x=1;x<=3;x++) {
            for(y=1;y<=x;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
