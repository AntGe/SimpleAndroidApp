package co.centroida.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/*
* Created by Antonio on 6/15/2017
* Copyright (c) 2017 Centroida. All rights reserved.
*/
public interface RetrofitCall {
    @GET("Books")
    Call<List<Book>> getBooks();
}
