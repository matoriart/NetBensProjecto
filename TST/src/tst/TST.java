/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst;

/**
 *
 * @author user
 */
public class TST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        for(a=1;a<=5;a++) {
            for(b=1;b<=a;b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(a=4;a>=1;a--) {
            for(b=5;b>a;b--) {
                System.out.print(" ");
            }
            for(c=1;c<=b;c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    
}
