package com.my.retrolin.RetrofitClient

import com.my.retrolin.models.Dealer
import com.my.retrolin.models.JhanMathiko
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface DealerClient {


   // @GET("api/v1/dealer")
    @GET("api/v1/dealer")
    fun getDealerList():Call<JhanMathiko>




}



//
//    @GET("api/v1/dealer")
//    fun getDealerList():Call<ResponseBody>
//}