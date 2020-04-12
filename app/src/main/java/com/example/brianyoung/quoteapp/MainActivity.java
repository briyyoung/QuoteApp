package com.example.brianyoung.quoteapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String API_URL = "https://api.chucknorris.io/jokes/random?category=dev";

    Button btnJoke;
    TextView tvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvJoke = (TextView)findViewById(R.id.tvQuotes);
        btnJoke = (Button)findViewById(R.id.btnQuotes);



        btnJoke.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Gson gson = new Gson();
                ChuckNorrisResponse response = gson.fromJson(ChuckNorrisResponse.json, ChuckNorrisResponse.class);
                String value = response.getValue();
                tvJoke.setText(value);

            }
        });



    }


}
