/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nik;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Nik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d, m, y, secret;
        String nama, alamat, nik, jk, tempL, gol;
        System.out.println("Silahkan Masukkan");
        System.out.print("Nama :");
        nama = input.nextLine();
        System.out.print("NIK :");
        nik = input.nextLine();
        System.out.print("Alamat :");
        alamat = input.nextLine();
        System.out.print("Tempat Lahir :");
        tempL = input.nextLine();
        System.out.println("Tanggal Lahir");
        System.out.println("=====================");
        System.out.print("Hari ke :");
        d = input.nextInt();
        System.out.print("Bulan(Angka):");
        m = input.nextInt();
        System.out.print("Tahun :");
        y = input.nextInt();
        System.out.println("=====================");
        System.out.println("Silahkan Pilih Jenis Kelamin");
        System.out.println("Laki-Laki");
        System.out.println("Perempuan");
        System.out.println("=====================");
        System.out.print("Jawaban Anda :");
        jk = input.next();
        System.out.println(jk.equalsIgnoreCase(nama));
        System.out.println("=====================");
        System.out.println("Silahkan Pilih Golongan Darah");
        System.out.println("a.A");
        System.out.println("b.B");
        System.out.println("c.O");
        System.out.println("d.AB");
        System.out.println("=====================");
        System.out.print("Jawaban Anda:");
        gol = input.next();
        switch (jk) {
            case "Laki-Laki":
                System.out.println("Hai Pak " + nama + "!!");
                break;
            case "Perempuan":
                System.out.println("Hai Bu " + nama + "!!");
                break;
            default:
                System.out.println("Maaf Pilihan Tidak Tersedia");
                break;
        }
        System.out.println("================================");
        System.out.println("Berdasarkan Info KTP Anda");
        System.out.println("Nama :" + nama);
        System.out.println("NIK :" + nik);
        System.out.println("Alamat :" + alamat);
        System.out.println("Tempat Lahir :" + tempL);
        System.out.println("Tanggal Lahir :" + d + "-" + m + "-" + y);
        System.out.println("Jenis Kelamin :" + jk);
        System.out.println("Golongan Darah :" + gol);
        System.out.println("===============================");

    }

}
