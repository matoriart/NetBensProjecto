/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt;

/**
 *
 * @author user
 */
public class LT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nilaisukupertama=3;
        int selisih=5;
        int sukuawal=7;
        int sukuakhir=16;
        int dl=nilaisukupertama;
        int total = 0;
        
        for(int a=1;a<sukuakhir;a++) {
            total += dl;
            if(a>=sukuawal) {
                System.out.println("Nilai suku ke-"+a+" = "+dl);
            }
            
            dl += selisih;
        }
        System.out.println("Total nilai adalah : "+total);
        
    }
   
}

    
    
