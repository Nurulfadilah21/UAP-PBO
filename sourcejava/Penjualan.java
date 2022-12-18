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
public class Penjualan {
    private int jumlahproduk;
    private int stok;
    private ArrayList<Produk> pr = new ArrayList<Produk>();

    public Penjualan(int jumlahproduk, int stok) {
        this.jumlahproduk = jumlahproduk;
        this.stok = stok;
    }
    
    

    public int getJumlahproduk() {
        return jumlahproduk;
    }

    public void setJumlahproduk(int jumlahproduk) {
        this.jumlahproduk = jumlahproduk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
    
}
