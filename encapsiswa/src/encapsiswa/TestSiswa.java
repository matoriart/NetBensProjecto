/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsiswa;

/**
 *
 * @author user
 */
public class TestSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EncapSiswa siswa = new EncapSiswa();
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    
        System.out.println("nama: "+siswa.getName()
        + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()
        + " tahun");

    }
    
}
