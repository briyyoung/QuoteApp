package com.example.brianyoung.quoteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.google.gson.Gson;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    Button btnJoke;
    TextView tvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvJoke = (TextView)findViewById(R.id.tvQuotes);
        btnJoke = (Button)findViewById(R.id.btnQuotes);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.chucknorris.io")
                .addConverterFactory(GsonConverterFactory.create()).build();

        JokeService service = retrofit.create(JokeService.class);
        Call<Joke> jokeCall = service.getValues();




        btnJoke.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                jokeCall.enqueue(new Callback<Joke>() {
                    @Override
                    public void onResponse(Call<Joke> call, Response<Joke> response) {
                        Log.d(TAG, "onResponse: SUCCESS");
                        String jokes = response.body().getValue();
                        tvJoke.setText(jokes);
                    }

                    @Override
                    public void onFailure(Call<Joke> call, Throwable t) {
                        Log.d(TAG, "onResponse: FAILURE");
                    }
                });
            }

        });
    }



}
