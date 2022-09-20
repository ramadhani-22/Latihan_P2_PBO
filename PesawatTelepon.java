/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanP2;

/**
 *
 * @author Ramadhani
 */
public class PesawatTelepon {
    String bentuk, kabel, gagang_telpon;

    //SETTER
    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public void setKabel(String kabel) {
        this.kabel = kabel;
    }

    public void setGagang_telpon(String gagang_telpon) {
        this.gagang_telpon = gagang_telpon;
    }
    
    
    //GETTER
    public String getBentuk() {
        return bentuk;
    }

    public String getKabel() {
        return kabel;
    }

    public String getGagang_telpon() {
        return gagang_telpon;
    }
    
    
    //METHODE
    Boolean terima_panggilan(Boolean tp){
        return tp;
    }
    Boolean melakukan_panggilan(boolean mp){
        return mp;
    }
}
