/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Aditya Pribadi,Reinaldy E. Fargo, Veber Sormin
 */
public class Product {

    private int Amount;
    private String brand;
    private String merek;    
    private int Harga;    
    private String batre;
    private String kamera;        
    private String ram;
    private String os;
    private String camf;        
    private String internalm;
    private String externalm;    
    private byte[] Image;
    
    public Product(){}

    public Product(int Amount, String brand, String merek, int Harga, String batre, String kamera, String ram, String os, String camf, String internalm, String externalm, byte[] Image) {
        this.Amount = Amount;
        this.brand = brand;
        this.merek = merek;
        this.Harga = Harga;
        this.batre = batre;
        this.kamera = kamera;
        this.ram = ram;
        this.os = os;
        this.camf = camf;
        this.internalm = internalm;
        this.externalm = externalm;
        this.Image = Image;
    }

    public Product(int Amount, String brand, String merek, int Harga) {
        this.Amount = Amount;
        this.brand = brand;
        this.merek = merek;
        this.Harga = Harga;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getBatre() {
        return batre;
    }

    public void setBatre(String batre) {
        this.batre = batre;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] Image) {
        this.Image = Image;
    }
    
        public String getCamf() {
        return camf;
    }

    public void setCamf(String camf) {
        this.camf = camf;
    }

    public String getInternalm() {
        return internalm;
    }

    public void setInternalm(String internalm) {
        this.internalm = internalm;
    }

    public String getExternalm() {
        return externalm;
    }

    public void setExternalm(String externalm) {
        this.externalm = externalm;
    }

}
