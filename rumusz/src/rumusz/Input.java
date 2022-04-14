/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumusz;

/**
 *
 * @author user
 */
public class Input {

    private int segitiga;
    public int alas = 13;
    public int tinggi = 5;
    protected String FX = "The Guest";

    void X() {
        segitiga = alas * tinggi;
        System.out.println("Alas : " + alas + " Tinggi : " + tinggi);
        System.out.println("Luas Segitiga : " + segitiga);
        System.out.println("Rumus : a*t");
    }
}
