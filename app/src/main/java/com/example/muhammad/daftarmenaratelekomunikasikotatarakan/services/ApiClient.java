package com.example.muhammad.daftarmenaratelekomunikasikotatarakan.services;

import com.example.muhammad.daftarmenaratelekomunikasikotatarakan.LoggingInterceptor;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    //url web serive di localhost
    public static final String URL = "http://192.168.43.248/MenaraTarakan/";
    public static Retrofit RETROFIT =  null;

    public static Retrofit getClient(){
        if (RETROFIT==null){
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new LoggingInterceptor())
                    .build();
            RETROFIT = new Retrofit.Builder()
                    .baseUrl(URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return RETROFIT;
    }
}
