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
    private int id_transaksi;
    private int jumlahProduk;
    private int stok;
    private String nama_produk;
    private ArrayList<Produk> pr = new ArrayList<>();
    
    public Penjualan(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public Penjualan(int jumlahproduk, int stok) {
        this.jumlahproduk = jumlahproduk;
        this.stok = stok;
    }
   
    public Penjualan(int id_transaksi, int jumlahProduk, int stok) {
        this.id_transaksi = id_transaksi;
        this.jumlahProduk = jumlahProduk;
        this.stok = stok;
    }
    public Penjualan(int id_transaksi, int jumlahProduk, int stok, String produk) {
        this.id_transaksi = id_transaksi;
        this.jumlahProduk = jumlahProduk;
        this.stok = stok;
        this.nama_produk=produk;
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
    
    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }
    public void getProduk(){
        
    }
    @Override
    public void hitungJumlahProduk(){
        
    }
    @Override
    public void hitungHargaProduk(){
        
    }
    
}
