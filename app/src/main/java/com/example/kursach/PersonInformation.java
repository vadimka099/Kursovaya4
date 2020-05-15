package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PersonInformation extends AppCompatActivity {

    public String gender_check;
    String TO_BUTTON_CHECK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_information);

        TextView tv = findViewById(R.id.gender);
        tv.setText(Person.getGender_value());

        TextView tv_2 = findViewById(R.id.your_weight);
        tv_2.setText(Person.getWeight_value_string());

        TextView tv_3 = findViewById(R.id.your_height);
        tv_3.setText(Person.getHeight_value_string());

        TextView tv_4 = findViewById(R.id.your_age);
        tv_4.setText(Person.getAge_value_string());
    }


    public void change_click(View view){
        Intent intent_plan = new Intent(this, AfterSplash.class);
        TO_BUTTON_CHECK = "change";
        intent_plan.putExtra("check_button", TO_BUTTON_CHECK);
        startActivity(intent_plan);
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

    public void profile_click(View view) {
        Intent intent_profile = new Intent(this, Profile.class);
        startActivity(intent_profile);
    }
    public void otchet_click(View view) {
        Intent intent_profile = new Intent(this, MainCalendar.class);
        startActivity(intent_profile);
    }
}
