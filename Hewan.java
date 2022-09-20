/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanP2;

/**
 *
 * @author Ramadhani
 */
public class Hewan {
    String mata, mulut, telinga, ekor;
    Integer kaki;

    //SETTER
    public void setMata(String mata) {
        this.mata = mata;
    }

    public void setMulut(String mulut) {
        this.mulut = mulut;
    }

    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }

    public void setEkor(String ekor) {
        this.ekor = ekor;
    }

    public void setKaki(Integer kaki) {
        this.kaki = kaki;
    }
    
    
    //GETTER
    public String getMata() {
        return mata;
    }

    public String getMulut() {
        return mulut;
    }

    public String getTelinga() {
        return telinga;
    }

    public String getEkor() {
        return ekor;
    }

    public Integer getKaki() {
        return kaki;
    }
    
    
    //METHODE
    String bermain(String b){
        return b;
    }
    String makan(String m){
        return m;
    }
    String tidur(String t){
        return t;
    }
}


