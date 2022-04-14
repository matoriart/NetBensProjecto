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
public class Bola {
    private double jari_jari;
    double getJariJari(){
        
        return jari_jari;
    }
    void setJarijari(double jari2){
     jari_jari=jari2;
    }
    void showDiameter(){
        System.out.println(jari_jari/2);
    }
    void showLuasPermukaan(){
        System.out.println(4*22/7*jari_jari*jari_jari);
    }
    void showVolume(){
        System.out.println(22/7*jari_jari*jari_jari/2);
    }
}
