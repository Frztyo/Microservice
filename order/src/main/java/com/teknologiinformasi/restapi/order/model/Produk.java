package com.teknologiinformasi.restapi.order.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;



public class Produk {


  
   private Long id;


   private String nama;
   private Double harga;
   private String deskripsi;


   // Constructor tanpa parameter
   public Produk() {}


   // Constructor dengan parameter
   public Produk(String nama, Double harga, String deskripsi) {
       this.nama = nama;
       this.harga = harga;
       this.deskripsi = deskripsi;
   }


   // Getters dan Setters
   public Long getId() {
       return id;
   }


   public void setId(Long id) {
       this.id = id;
   }


   public String getNama() {
       return nama;
   }


   public void setNama(String nama) {
       this.nama = nama;
   }


   public Double getHarga() {
       return harga;
   }


   public void setHarga(Double harga) {
       this.harga = harga;
   }


   public String getDeskripsi() {
       return deskripsi;
   }


   public void setDeskripsi(String deskripsi) {
       this.deskripsi = deskripsi;
   }
}
