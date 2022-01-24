/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll;

/**
 *
 * @author user
 */
public class LL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaisukupertama=19;
        int selisih=5;
        int sukuawal=1;
        int sukuakhir=11;
        int deret=nilaisukupertama;
        int total = 0;
        
        for(int i=1;i<sukuakhir;i++) {
            total += deret;
            if(i>=sukuawal) {
                System.out.println("Nilai suku ke-"+i+" = "+deret);
            }
            
            deret += selisih;
        }
        System.out.println("Total nilai adalah : "+total);
        
    }
    
}
