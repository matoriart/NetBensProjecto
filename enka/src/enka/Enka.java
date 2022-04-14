/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enka;

/**
 *
 * @author user
 */
public class Enka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Private X = new Private();
        X.setName("Maru");
        System.out.println("Nama Saya "+X.getNama());
        System.out.println("=========================");
        X.setClass("X RPL II");
        System.out.println("Saya Kelas "+X.getKelas());
        System.out.println("=========================");
        X.setAbs(23);
        System.out.println("Saya Nomor Absen "+X.getAbs());
    }
    
}
