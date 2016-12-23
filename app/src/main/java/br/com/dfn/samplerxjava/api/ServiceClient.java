package br.com.dfn.samplerxjava.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ServiceClient {

    public static final String API_KEY = "d268ab1d89a54d01af94ec7fd5f5bbd6";
    private static final String URL = "https://newsapi.org/v1/";

    private static Retrofit builder =
            new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

    public static Retrofit getBuilderRetrofit(){
        return builder;
    }

}