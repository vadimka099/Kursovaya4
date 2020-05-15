
package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenuFemale extends AppCompatActivity {

    public String your_train;
    public String gender_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_menu_female);

    }

    public void complex_click_female(View view) {
        your_train = "КОМПЛЕКСНАЯ ТРЕНИРОВКА ВСЕГО ТЕЛА";
        Person.setWorkout_value(your_train);

        Intent intent_comlex_female_click = new Intent(this, YourLevel.class);
        startActivity(intent_comlex_female_click);
    }
    public void top_click_female(View view) {
        your_train = "ТРЕНИРОВКА ВЕРХНЕЙ ЧАСТИ ТЕЛА";
        Person.setWorkout_value(your_train);

        Intent intent_click_female = new Intent(this, YourLevel.class);
        startActivity(intent_click_female);
    }
    public void tors_click_female(View view) {
        your_train = "ТРЕНИРОВКА ТОРСА";
        Person.setWorkout_value(your_train);

        Intent intent_tors_click_female = new Intent(this, YourLevel.class);
        startActivity(intent_tors_click_female);
    }
    public void spina_click_female(View view) {
        your_train = "ТРЕНИРОВКА СПИНЫ";
        Person.setWorkout_value(your_train);

        Intent intent_spina_click_female = new Intent(this, YourLevel.class);
        startActivity(intent_spina_click_female);
    }
    public void legs_click_female(View view) {
        your_train = "ТРЕНИРОВКА НИЖНЕЙ ЧАСТИ ТЕЛА";
        Person.setWorkout_value(your_train);

        Intent intent_legs_click_female = new Intent(this, YourLevel.class);
        startActivity(intent_legs_click_female);
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
