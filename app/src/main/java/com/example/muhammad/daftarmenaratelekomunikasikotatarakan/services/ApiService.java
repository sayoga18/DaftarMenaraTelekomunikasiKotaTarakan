package com.example.muhammad.daftarmenaratelekomunikasikotatarakan.services;

import com.example.muhammad.daftarmenaratelekomunikasikotatarakan.models.ListLocationModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getALLLocation(); //muncul di MainActivity
}
