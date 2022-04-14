/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enk;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class History extends Classs{
    Scanner input = new Scanner(System.in);
    protected int panjang, lebar, luas;
    
    void persegi () {
        panjang = 12;
        lebar = 10;
        System.out.println(luas = panjang*lebar);
        System.out.print("Hint : ");
        System.out.println("P x L");
    }
    
}
