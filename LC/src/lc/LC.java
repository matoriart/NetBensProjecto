/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lc;

/**
 *
 * @author user
 */
public class LC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a=6;
      int b=10;
      int c=a;
      int d=a;
        for(int e=0;e<2;e++) {
            for(int f=0;f<4;f++) {
                System.out.print(c+"\t");
                c=c+b;
                d=d+c;
            }
            System.out.println();
        }
        d=d-c;
        System.out.println("Jumlah "+d);
    }
    
}
