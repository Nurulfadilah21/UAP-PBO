/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap_pbo;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Barang extends Produk {
    private String barcode;
    private String expired;
    private ArrayList<Kategori> kategori = new ArrayList<>();

    public Barang(String barcode, String expired, String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.barcode = barcode;
        this.expired = expired;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }
    
    public boolean isExpired(){
        
        return true;
    }
    
    
   public void addKategori(Kategori k){
        kategori.add(k);
    }
   
   public void setKategori(ArrayList<Kategori> kategori) {
        this.kategori = kategori;
    }
    
   public ArrayList<Kategori> getKategori() {
        return kategori;
    }
            
}
