package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Gender extends AppCompatActivity  {
    final String GENDER = "gender text";
    String save_gender;
    String check;
    SharedPreferences mSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);


        Intent intent = getIntent();
        check = intent.getStringExtra("check_button");

        if ("change".equals(check)) {
            save_gender = "";
        }

        else {

            mSettings = getPreferences(MODE_PRIVATE);
            save_gender = mSettings.getString(GENDER, "");
        }

        Person.setGender_value(save_gender);


        Toast.makeText(this,  check, Toast.LENGTH_SHORT).show();

        if (!save_gender.equals("")){
            Intent intent_next = new Intent(this, BodyInformation.class);
            startActivity(intent_next);
        }

    }


    public void male_click(View view) {
        check = "change";
        Person.setGender_value("Мужской");
        Intent intent_male = new Intent(this, BodyInformation.class);
        intent_male.putExtra("check_button", check);
        startActivity(intent_male);

        mSettings = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor edito_w = mSettings.edit();
        edito_w.putString(GENDER, Person.getGender_value());
        edito_w.apply();
    }

    public void female_click(View view) {
        check = "change";
        Person.setGender_value("Женский");
        Intent intent_female = new Intent(this, BodyInformation.class);
        intent_female.putExtra("check_button", check);
        startActivity(intent_female);

        mSettings = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor edito_w = mSettings.edit();
        edito_w.putString(GENDER, Person.getGender_value());
        edito_w.apply();
    }

}

