/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lx;

/**
 *
 * @author user
 */
public class LX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=6;
        int b=8;
        int c=a;
        int d=0;
        System.out.println("");
        for(int e=0;e<=5;e++) {
            for(int f=0;f<=e;f++) {
                System.out.print(c+"\t");
                c=c+b;
                d=d+c;
            }
            System.out.println();
        }
        d=d-c;
        System.out.println("NL : "+d);
    }
    
}
