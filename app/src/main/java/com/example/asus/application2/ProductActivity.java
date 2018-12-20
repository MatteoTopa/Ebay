package com.example.asus.application2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        TextView ciao= findViewById(R.id.ciao);

        String prodotto1 = getIntent().getExtras().getString("prodotto");
        ciao.setText(prodotto1);
    }
}
