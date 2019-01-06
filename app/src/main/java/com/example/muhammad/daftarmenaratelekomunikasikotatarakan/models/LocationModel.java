package com.example.muhammad.daftarmenaratelekomunikasikotatarakan.models;

import com.google.gson.annotations.SerializedName;

public class LocationModel {
    @SerializedName("nama_pengguna")
    private String provider;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("pemilik_menara")
    private String pemilik;
    @SerializedName("alamat_menara")
    private String alamat;
    @SerializedName("tinggi_menara")
    private String tinggi;
    @SerializedName("jenis_menara")
    private String jenis;

    public LocationModel(String provider, String latitude, String longitude,String pemilik, String alamat, String tinggi, String jenis){
        this.provider = provider;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pemilik = pemilik;
        this.alamat = alamat;
        this.tinggi = tinggi;
        this.jenis = jenis;
    }

    public LocationModel(){
    }

    public String getProvider() { return provider; }

    public void setProvider(String provider) { this.provider = provider; }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPemilik() { return pemilik;    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTinggi() {
        return tinggi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTinggi(String tinggi) {
        this.tinggi = tinggi;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
