package com.example.tugas06;

public class FuneralModel {
    String nama, deskripsi, bahan, harga;
    int gambar;
    private String jenisFuneral;
    private int logoFuneral;

    public FuneralModel(String jenisFuneral, int logoFuneral) {
        this.jenisFuneral = jenisFuneral;
        this.logoFuneral = logoFuneral;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.bahan = bahan;
        this.harga = harga;
        this.gambar = gambar;


    }

    public String getJenisFuneral() {
        return jenisFuneral;
    }

    public void setJenisFuneral(String jenisFuneral) {
        this.jenisFuneral = jenisFuneral;
    }

    public int getLogoFuneral() {
        return logoFuneral;
    }

    public void setLogoFuneral(int logoFuneral) {
        this.logoFuneral = logoFuneral;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getBahan() {
        return bahan;
    }

    public String getHarga() {
        return harga;
    }

    public int getGambar() {
        return gambar;
    }
}
