package com.my.retrolin.RetrofitClient

import com.my.retrolin.models.BookObject
import com.my.retrolin.models.JhanMathiko
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface DealerClient {






   // @GET("api/v1/dealer")


//    @GET("api/v1/dealer")    //see if uncommenting this works
//    fun getDealerList():Call<JhanMathiko>


    @POST("api/v1/booking")
    fun postData(
            @Body  bookObject:BookObject
    ) :  Call<ResponseBody>







}


//
//    @GET("api/v1/dealer")
//    fun getDealerList():Call<ResponseBody>
//}



