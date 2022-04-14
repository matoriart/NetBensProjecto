/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Member {
    String nama, alamat, telepon;
    int saldo;
    void setNamaMember (String nama){
        ArrayList member = new ArrayList();
        member.add("Garit");
        member.add("Felis");
        member.add("Leri");
        member.remove(2);
        System.out.println(member);
        this.nama = nama;
    }
    void setAlamat(String Alamat){
        ArrayList X = new ArrayList();
        this.alamat = Alamat;
        X.add("JL.Kemayoran");
        X.add("JL.MERDEKA");
        X.add("JL.PERMATA JINGGA");
        System.out.println(Alamat);
    }
    void setTelepon(String Telepon){
        ArrayList telepon = new ArrayList();
        this.telepon = Telepon;
        telepon.add("088298213323");
        telepon.add("08988829192");
        telepon.add("081212239321");
        System.out.println(telepon);
        
    }
    void setSaldo(int Saldo){
        ArrayList saldo = new ArrayList();
        this.saldo = Saldo;
        saldo.add(12.000);
        saldo.add(32.000);
        saldo.add(25.000);
        System.out.println(saldo);
    }
    String getNamaMember () {
       return nama;
    }
    String getAlamat(){
        return alamat;
    }
    String getTelepon(){
        return telepon;
    }
    int getSaldo(){
        return saldo;
    }
}
