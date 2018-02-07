package com.my.retrolin.Views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.TextView
import com.my.retrolin.R
import com.my.retrolin.RetrofitClient.DealerClient
import com.my.retrolin.adapters.PixabayAdapter
import com.my.retrolin.models.Dealer
import com.my.retrolin.models.JhanMathiko
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    lateinit var textView: TextView

//

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)    //which has setContent view question
        recyclerView = recyclerview
        recyclerView.layoutManager = LinearLayoutManager(MainActivity@ this)

     //   textView = textview


        //go retrofit
        // steps  build create call enque

//https://api.myjson.com/bins/u65g9


        var builder: Retrofit.Builder = Retrofit.Builder()
              //  .baseUrl("http://nepalgas.bidheellc.com/")
                .baseUrl("http://nepalgas.bidheellc.com/")
                .addConverterFactory(GsonConverterFactory.create())


        var retrofit: Retrofit = builder.build()

        var creater: DealerClient = retrofit.create(DealerClient::class.java)

        var caller: Call<JhanMathiko> = creater.getDealerList()

        caller.enqueue(object : Callback<JhanMathiko> {
            override fun onResponse(call: Call<JhanMathiko>?, response: Response<JhanMathiko>?) {


                Log.v("datatest", "its a success congrats")


                var jhanmathiko:JhanMathiko? = response?.body()


                recyclerView.adapter=  PixabayAdapter(jhanmathiko?.data?.data)







            }

            override fun onFailure(call: Call<JhanMathiko>?, t: Throwable?) {
                Log.v("datatest", "you failed this time " + t.toString())


            }


        })


    }


}






































































//package com.my.retrolin.Views
//
//import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
//import android.support.v7.widget.RecyclerView
//import android.util.Log
//import android.widget.TextView
//import com.my.retrolin.R
//import com.my.retrolin.RetrofitClient.DealerClient
//import kotlinx.android.synthetic.main.activity_main.*
//import okhttp3.ResponseBody
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//class MainActivity : AppCompatActivity() {
//    lateinit var recyclerView: RecyclerView
//
//    lateinit var textView: TextView
//
////
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)    //which has setContent view question
////        recyclerView = recyclerview
////        recyclerView.layoutManager = LinearLayoutManager(MainActivity@ this)
////        recyclerView.adapter=PixabayAdapter()
//
//        textView = textview
//
//
//        //go retrofit
//        // steps  build create call enque
//
//
//
//
//        var builder: Retrofit.Builder = Retrofit.Builder()
//                .baseUrl("http://nepalgas.bidheellc.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//
//
//        var retrofit: Retrofit = builder.build()
//
//        var creater: DealerClient = retrofit.create(DealerClient::class.java)
//
//        var caller: Call<ResponseBody> = creater.getDealerList()
//
//        caller.enqueue(object : Callback<ResponseBody> {
//            override fun onResponse(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
//
//
//                Log.v("datatest", "its a success congrats")
//
//                textView.setText(response!!.body()!!.string())
//
//            }
//
//            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {
//                Log.v("datatest", "you failed this time " + t.toString())
//
//
//            }
//
//
//        })
//
//
//    }
//
//
//}
//







