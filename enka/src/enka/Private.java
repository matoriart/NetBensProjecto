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
public class Private {
    private String Kelas;
    private String Nama;
    private int absen;
    
    void setName(String Nama) {
        this.Nama = Nama;
    }
    void setClass(String Kelas) {
        this.Kelas = Kelas;
    }
    void setAbs(int absen) {
        this.absen = absen;
    }
    String getNama(){
        return this.Nama;
    }
    String getKelas(){
        return this.Kelas;
    }
    int getAbs(){
        return this.absen;
    }
    
}
