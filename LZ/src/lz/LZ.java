/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lz;

/**
 *
 * @author user
 */
public class LZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int c=a;
        int d=0;
        System.out.println("");
        for(int x=0;x<=4;x++) {
            for(int z=x;z<=4;z++){
                System.out.print(c+"\t");
                c=c+b;
                d=d+c;
            }
            System.out.println();
        }
        for(int m=1;m<=4;m++){
            for(int l=0;l<=m;l++){
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
