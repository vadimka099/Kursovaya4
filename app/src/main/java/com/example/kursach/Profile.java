package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    public String gender_check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }

    public void about_click(View view) {
        Intent intent_about = new Intent(this, PersonInformation.class);
        startActivity(intent_about);
    }
    public void music_click(View view) {
        Intent intent_music = new Intent(this, Music.class);
        startActivity(intent_music);
    }
    public void plan_click(View view) {
        Intent intent_plan = new Intent(this, PersonTrain.class);
        startActivity(intent_plan);
    }

    public void trains_click(View view) {
        gender_check = Person.getGender_value();

        if (gender_check.equals("Мужской")) {
            Intent intent_trains = new Intent(this, MainMenuMale.class);
            startActivity(intent_trains);
        }
        if (gender_check.equals("Женский")) {
            Intent intent_trains = new Intent(this, MainMenuFemale.class);
            startActivity(intent_trains);
        }
    }

    public void otchet_click(View view) {
        Intent intent_profile = new Intent(this, MainCalendar.class);
        startActivity(intent_profile);
    }

    public void profile_click(View view) {
        Intent intent_profile = new Intent(this, Profile.class);
        startActivity(intent_profile);
    }

    public void feedback_click(View view) {
        Intent intent_feedback = new Intent(this, Feedback.class);
        startActivity(intent_feedback);
    }
}
