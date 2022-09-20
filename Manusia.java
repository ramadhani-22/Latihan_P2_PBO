/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanP2;

/**
 *
 * @author Ramadhani
 */
public class Manusia {
    String rambut, mata, mulut, telinga;
    Integer tangan, kaki;

    //SETTER
    public void setRambut(String rambut) {
        this.rambut = rambut;
    }

    public void setMata(String mata) {
        this.mata = mata;
    }

    public void setMulut(String mulut) {
        this.mulut = mulut;
    }

    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }

    public void setTangan(Integer tangan) {
        this.tangan = tangan;
    }

    public void setKaki(Integer kaki) {
        this.kaki = kaki;
    }
    
    //GETTER
    public String getRambut() {
        return rambut;
    }

    public String getMata() {
        return mata;
    }

    public String getMulut() {
        return mulut;
    }

    public String getTelinga() {
        return telinga;
    }

    public Integer getTangan() {
        return tangan;
    }

    public Integer getKaki() {
        return kaki;
    }    
    
    
    //METHODE
    String bermain(String brm){
        return brm;
    }
    
    String makan(String mkn){
        return mkn;
    }
    
    String tidur(String tdr){
        return tdr;
    }
    
    String bekerja(String bkj){
        return bkj;
    }
    
    String memasak(String msk){
        return msk;
    }
    String mencuci(String cuci){
        return cuci;
    }
}
