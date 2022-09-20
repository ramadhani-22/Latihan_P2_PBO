/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanP2;

/**
 *
 * @author Ramadhani
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("-------CLASS HEWAN-------");
        Hewan h = new Hewan();
        h.setTelinga("Lebar");
        System.out.println("Telinga Gajah itu " + h.getTelinga());
        System.out.println("dan Dia sedang memakan " + h.makan("Rumput"));
        System.out.println("setelah itu dia bermain " + h.bermain("bola"));
        
        
        System.out.println("-------CLASS MANUSIA-------");
        Manusia m = new Manusia();
        m.setRambut("Lurus");
        System.out.println("Rambut Pria itu " + m.getRambut());
        System.out.println("Sehabis bangun tidur dia memasak " + m.memasak("Nasi Goreng"));
        System.out.println("Lalu dia makan " + m.makan("Nasi Goreng"));
        System.out.println("Setelah makan dia lekas pergi untuk " + m.bekerja("Mengajar"));
        
        
        System.out.println("-------CLASS PESAWAT TELEPON-------");
        PesawatTelepon pt = new PesawatTelepon();
        pt.setBentuk("Persegi");
        pt.setKabel("Panjang");
        System.out.println("Bentuk Telepon Rumah saya " + pt.getBentuk());
        System.out.println("dan memiliki kabel yang cukup " + pt.getKabel());
        boolean MenerimaTelpon = true;
        boolean MenolakTelpon = false;
        System.out.println("Lalu ada teman saya menelpon dan saya " + pt.terima_panggilan(true));
    }
}
