package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Ambitions extends AppCompatActivity {

    public String gender_check;
    final String AMBITIONS = "amb text";
    SharedPreferences mSettings;
    String check;
    String save_amb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_you_want);

        Intent intent = getIntent();
        check = intent.getStringExtra("check_button");

        if ("change".equals(check)) {
            save_amb = "";
        }

        else {

            mSettings = getPreferences(MODE_PRIVATE);
            save_amb = mSettings.getString(AMBITIONS, "");

        }

        Person.setAmbition(save_amb);

        Toast.makeText(this, "Text Load", Toast.LENGTH_SHORT).show();

        if (!save_amb.equals("") && Person.getGender_value().equals("Мужской")){
            Intent intent_next = new Intent(this, MainMenuMale.class);
            startActivity(intent_next);
        }

        else if (!save_amb.equals("") && Person.getGender_value().equals("Женский")){
            Intent intent_next = new Intent(this, MainMenuFemale.class);
            startActivity(intent_next);
        }


    }


    public void muscule_click(View view) {
        String ambition = "Набор мышечной массы";
        Person.setAmbition(ambition);

        mSettings = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor edito_w = mSettings.edit();
        edito_w.putString(AMBITIONS, Person.getAmbition());
        edito_w.apply();

        if (Person.getGender_value().equals("Женский")) {
            Intent intent_muscule_female = new Intent(this, MainMenuFemale.class);
            startActivity(intent_muscule_female);
        } else if (Person.getGender_value().equals("Мужской")){
            Intent intent_muscule_male = new Intent(this, MainMenuMale.class);
            startActivity(intent_muscule_male);
        }
    }

    public void lose_weight_click(View view) {
        String ambition = "Потеря веса";
        Person.setAmbition(ambition);

        mSettings = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor_w = mSettings.edit();
        editor_w.putString(AMBITIONS, Person.getAmbition());
        editor_w.apply();

        if (Person.getGender_value().equals("Женский")) {
            Intent intent_lose_weight_female = new Intent(this, MainMenuFemale.class);
            startActivity(intent_lose_weight_female);
        } else if (Person.getGender_value().equals("Мужской")){
            Intent intent_lose_weight_male = new Intent(this, MainMenuMale.class);
            startActivity(intent_lose_weight_male);
        }


    }

    public void tonus_click(View view) {
        String ambition = "Поддержание тела в тонусе";
        Person.setAmbition(ambition);

        mSettings = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor edito_w = mSettings.edit();
        edito_w.putString(AMBITIONS, Person.getAmbition());
        edito_w.apply();

        if (Person.getGender_value().equals("Женский")) {
            Intent intent_tonus_female = new Intent(this, MainMenuFemale.class);
            startActivity(intent_tonus_female);
        } else if (Person.getGender_value().equals("Мужской")){
            Intent intent_tonus_male = new Intent(this, MainMenuMale.class);
            startActivity(intent_tonus_male);
        }
    }

}