/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainbola;

/**
 *
 * @author user
 */
public class MainBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola X = new Bola();
        X.setJarijari(49);
        System.out.println("Jari-Jari : "+X.getJariJari());
        System.out.println("Diameter :");
        X.showDiameter();
        System.out.println("Luas :");
        X.showLuasPermukaan();
        System.out.println("Volume :");
        X.showVolume();
    }
    
}
