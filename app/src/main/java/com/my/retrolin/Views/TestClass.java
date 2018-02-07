package com.my.retrolin.Views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestClass extends AppCompatActivity {


//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        Retrofit.Builder builder = new Retrofit.Builder()
//                .baseUrl("https://api.github.com/")
//                .addConverterFactory(GsonConverterFactory.create());
//
//        //first build retrofit     -> BUILD
//        final Retrofit retrofit = builder.build();
//
//
//        // the create retrofit object      -> CREATE
//        GithubClient client = retrofit.create(GithubClient.class);
//
//
//        // then make a call object to utilize it -> CALL
//        Call<List<GithubRepo>> call = client.repoList("regmishailendra");
//
//
//        //we have two options here
//
//        call.enqueue(new Callback<List<GithubRepo>>() {
//            @Override
//            public void onResponse(Call<List<GithubRepo>> call, Response<List<GithubRepo>> response) {
//
//                List<GithubRepo> repos = response.body();
//
//                List<String> reposString = new ArrayList<>();
//
//                for (GithubRepo repo : repos) {
//
//                    reposString.add(repo.getName());
//
//                }
//
//
//                listview.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, reposString));
//
//
//            }
//
//            @Override
//            public void onFailure(Call<List<GithubRepo>> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "Something went wrong. Sorry!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//
//    }
}
