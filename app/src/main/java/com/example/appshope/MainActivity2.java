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

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.main).setAlpha(0f);
        findViewById(R.id.main).animate().alpha(1f).setDuration(400);


        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> finish());
    }

    public void Click_man(View view) {

        Intent intent2 = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent2);
    }
}