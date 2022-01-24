/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap;

/**
 *
 * @author user
 */
public class AP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][]={{4,4},{5,3}};
        int b[][]={{5,5},{5,5}};
        int c[][]={{3,3}};
        System.out.println("");
        for(int s=0;s<2;s++){
            for(int w=0;w<2;w++) {
                System.out.println(a[w][s]+b[s][s]+"\t");
            }
            System.out.println();
        }
    }
    
}
