package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterSplash extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_splash);
        Button start_button = findViewById(R.id.button_start);
        start_button.setOnClickListener(this);

    }


    public void onClick(View view) {
        Intent intent = new Intent(this, Gender.class);
        Intent intent_get = getIntent();
        String check = intent_get.getStringExtra("check_button");
        intent.putExtra("check_button", check);
        startActivity(intent);
    }
}
