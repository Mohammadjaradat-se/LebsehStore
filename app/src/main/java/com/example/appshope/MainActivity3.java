package com.example.appshope;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        Button tshirts =findViewById(R.id.tshirts_btn);
        tshirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_tshirts = new Intent(MainActivity3.this,Tshirts_activity.class);
                startActivity(intent_tshirts);
            }
        });
        Button jeans =findViewById(R.id.jeans_btn);
        jeans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_jeans = new Intent(MainActivity3.this,Jeans_activity.class);
                startActivity(intent_jeans);
            }
        });
        Button jackets =findViewById(R.id.jackets_btn);
        jackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_jackets = new Intent(MainActivity3.this,Jackets_activity.class);
                startActivity(intent_jackets);
            }
        });
        Button shoes =findViewById(R.id.Shoes_btn);
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_shoes = new Intent(MainActivity3.this,Shoes_activity.class);
                startActivity(intent_shoes);
            }
        });
        Button back1 =findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}