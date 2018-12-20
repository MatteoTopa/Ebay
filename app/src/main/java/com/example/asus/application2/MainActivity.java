package com.example.asus.application2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    LinearLayout principale;

    EditText prodottoET;
    TextView prodotto;

    Button prodottoBTN;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principale=findViewById(R.id.principale);

        prodotto=findViewById(R.id.bicicletta_tv);

        prodottoET=findViewById(R.id.prodotto_et);

        prodottoBTN=findViewById(R.id.prodotto_btn);


        prodottoBTN.setOnClickListener(this);

        Log.i(TAG,"activity created");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG,"activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG,"activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG,"activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG,"activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG,"activity destroyed");
    }

    @Override
    public void onClick(View v) {
        String productName = "";
        if(v.getId() == R.id.prodotto_btn){
           productName = prodotto.getText().toString();
        }
        Intent i=new Intent(this,ProductActivity.class);
        i.putExtra("prodotto",productName);
        startActivity(i);

    }



}
