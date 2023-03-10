package db;
import db.BarangModel;
import db.dbHelper;
import java.sql.Connection;
import uap_pbo.Makanan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MakananModel {
     private final Connection CONN;
    
    public MakananModel(){
        this.CONN = dbHelper.getConnection();
    }
    public void addMakanan(Makanan  mkn){
        String insert = "INSERT INTO makanan VALUES ('"
                 + mkn.getNama_produk()+ "', '" + mkn.getHarga() + "', '" + mkn.getJumlah() + "', '" + mkn.getDiskon()+"', '"+mkn.getDaya_tahan()+"');";
        System.out.println(insert);
        try {
           if( CONN.createStatement().executeUpdate(insert)>0){
            System.out.println("Data Berhasil Ditambahkan");
           }else{
               System.out.println("Data yang ditambahkan sudah ada");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal Ditambahkan");
        }
    }
    
//     public void updateBarang(Barang brg){//untuk memperbarui data pada query
//        String update = "UPDATE barang SET barcode = '"+ brg.getBarcode() +"', expired = '"+ brg.getExpired() +"' WHERE barcode = '"+brg.getBarcode()+"';";
//        try {
//           if( CONN.createStatement().executeUpdate(update)>0){
//            System.out.println("Data Berhasil Diperbarui");
//           }else{
//               System.out.println("Data yang dimasukkan tidak berubah");
//           }     
//        } catch (SQLException ex) {
//            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Data Gagal Dimasukkan");
//        }
//     }
     
     public void deleteMakanan(Makanan mkn){
        String delete = "DELETE FROM makanan WHERE nama = '"+ mkn.getNama_produk()+"';";
        
         try {
           if( CONN.createStatement().executeUpdate(delete)>0){
            System.out.println("Data Berhasil Dihapus");
//                  System.out.println(insert);
           }else{
               System.out.println("Data Gagal dihapus");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal dihapus");
        }  
    }
     public ObservableList<Makanan> getMakanan(){
        String query="SELECT * FROM makanan";
        ObservableList<Makanan> mkn=FXCollections.observableArrayList();
        try {
            ResultSet rs= CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Makanan temp=new Makanan(rs.getString("nama_produk"),rs.getDouble("harga"));
                mkn.add(temp);
            }
            System.out.println("Berhasil Mengambil Data");
        }catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Mengambil Data");
        }
        return mkn;
    }
}
