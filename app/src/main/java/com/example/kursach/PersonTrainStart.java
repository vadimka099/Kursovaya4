package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PersonTrainStart extends AppCompatActivity {

    public String gender_check, check_amb, train_check;
    public int check_age, check_height, check_weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_train_start);

        TextView tv_4 = findViewById(R.id.textView4);
        TextView tv_6 = findViewById(R.id.textView6);
        TextView kalories = findViewById(R.id.kkal);
        TextView water_day = findViewById(R.id.water);

        int age_int = Person.getAge_value_int();
        int weight_int = Person.getWeight_value_int();
        int height_int = Person.getHeight_value_int();


        gender_check = Person.getGender_value();
        if (gender_check.equals("Мужской")) {
            double DCI = ((((weight_int * 10) + (height_int) * 6.25) - (age_int * 5) + 5) * 1.4);

            String aString = String.format("%.2f", DCI);
            kalories.setText(aString);
        }
        else if (gender_check.equals("Женский")){
            double DCI = ((((weight_int * 10) + (height_int) * 6.2) - (age_int * 5) + - 161) * 1.5);
            String aString = String.format("%.2f", DCI);
            kalories.setText(aString);
        }

        double my_water = weight_int * 0.05;
        String water_String = String.format("%.2f", my_water);

        tv_4.setText(Person.getAmbition());
        tv_6.setText("Рост: " + Person.getHeight_value_string() + " Вес: " + Person.getWeight_value_string() + " Возраст: " + Person.getAge_value_string());
        water_day.setText(water_String);

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

    public void pn_click(View view) {
        check_amb = Person.getAmbition();
        check_height = Person.getHeight_value_int();
        check_weight = Person.getWeight_value_int();
        check_age = Person.getAge_value_int();
        gender_check = Person.getGender_value();
        train_check = "ТРЕНИРОВКА ВЕРХНЕЙ ЧАСТИ ТЕЛА";
        Person.setWorkout_value(train_check);
        if (gender_check.equals("Мужской")) Person.setGender_value("Мужской");
        else if (gender_check .equals("Женский")) Person.setGender_value("Женский");

        if (check_amb.equals("Набор мышечной массы") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Beginner2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Набор мышечной массы") && check_height > 165 && check_weight > 60 && check_height < 180 && check_weight < 70) {
            Intent n_2_click = new Intent(this, Intermediate1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Набор мышечной массы") &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Professional_1.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Набор мышечной массы") &&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner1.class);
            startActivity(n_4_click);
        }

        // second

        if (check_amb.equals("Потеря веса") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Intermediate2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Потеря веса") && check_height > 165 && check_weight > 60 && check_height <= 180 && check_weight <= 70) {
            Intent n_2_click = new Intent(this, Professional_1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Потеря веса") &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Professional2.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Потеря веса") &&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner2.class);
            startActivity(n_4_click);
        }

        // third

        if (check_amb.equals("Поддержание тела в тонусе") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Beginner2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Поддержание тела в тонусе")  && check_height > 165 && check_weight > 60 && check_height <= 180 && check_weight <= 70) {
            Intent n_2_click = new Intent(this, Intermediate1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Поддержание тела в тонусе")  &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Intermediate2.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Поддержание тела в тонусе")  &&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner1.class);
            startActivity(n_4_click);
        }
    }

    public void sr_click(View view) {
        check_amb = Person.getAmbition();
        check_height = Person.getHeight_value_int();
        check_weight = Person.getWeight_value_int();
        check_age = Person.getAge_value_int();
        gender_check = Person.getGender_value();
        train_check = "ТРЕНИРОВКА ТОРСА";
        Person.setWorkout_value(train_check);
        if (gender_check.equals("Мужской")) Person.setGender_value("Мужской");
        else if (gender_check.equals("Женский")) Person.setGender_value("Женский");

        if (check_amb.equals("Набор мышечной массы") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Beginner2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Набор мышечной массы") && check_height > 165 && check_weight > 60 && check_height < 180 && check_weight < 70) {
            Intent n_2_click = new Intent(this, Intermediate1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Набор мышечной массы") &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Professional_1.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Набор мышечной массы") &&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner1.class);
            startActivity(n_4_click);
        }

        // second

        if (check_amb.equals("Потеря веса") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Intermediate2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Потеря веса") && check_height > 165 && check_weight > 60 && check_height < 180 && check_weight < 70) {
            Intent n_2_click = new Intent(this, Professional_1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Потеря веса") &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Professional2.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Потеря веса") &&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner2.class);
            startActivity(n_4_click);
        }

        // third

        if (check_amb.equals("Поддержание тела в тонусе") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Beginner2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Поддержание тела в тонусе")  && check_height > 165 && check_weight > 60 && check_height < 180 && check_weight < 70) {
            Intent n_2_click = new Intent(this, Intermediate1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Поддержание тела в тонусе") &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Intermediate2.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Поддержание тела в тонусе")  &&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner1.class);
            startActivity(n_4_click);
        }
    }

    public void pt_click(View view) {
        check_amb = Person.getAmbition();
        check_height = Person.getHeight_value_int();
        check_weight = Person.getWeight_value_int();
        check_age = Person.getAge_value_int();
        gender_check = Person.getGender_value();
        train_check = "ТРЕНИРОВКА СПИНЫ";
        Person.setWorkout_value(train_check);
        if (gender_check.equals("Мужской")) Person.setGender_value("Мужской");
        else if (gender_check.equals("Женский")) Person.setGender_value("Женский");

        if (check_amb.equals("Набор мышечной массы") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Beginner2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Набор мышечной массы") && check_height > 165 && check_weight > 60 && check_height < 180 && check_weight < 70) {
            Intent n_2_click = new Intent(this, Intermediate1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Набор мышечной массы") &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Professional_1.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Набор мышечной массы") &&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner1.class);
            startActivity(n_4_click);
        }

        // second

        if (check_amb.equals("Потеря веса") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Intermediate2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Потеря веса") && check_height > 165 && check_weight > 60 && check_height < 180 && check_weight < 70) {
            Intent n_2_click = new Intent(this, Professional_1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Потеря веса") &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Professional2.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Потеря веса") &&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner2.class);
            startActivity(n_4_click);
        }

        // third

        if (check_amb.equals("Поддержание тела в тонусе") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Beginner2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Поддержание тела в тонусе") && check_height > 165 && check_weight > 60 && check_height < 180 && check_weight < 70) {
            Intent n_2_click = new Intent(this, Intermediate1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Поддержание тела в тонусе") &&  (check_height >= 180 && check_weight >= 70)) {
            Intent n_3_click = new Intent(this, Intermediate2.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Поддержание тела в тонусе") &&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner1.class);
            startActivity(n_4_click);
        }
    }

    public void vs_click(View view) {
        check_amb = Person.getAmbition();
        check_height = Person.getHeight_value_int();
        check_weight = Person.getWeight_value_int();
        check_age = Person.getAge_value_int();
        gender_check = Person.getGender_value();
        train_check = "ТРЕНИРОВКА НИЖНЕЙ ЧАСТИ ТЕЛА";
        Person.setWorkout_value(train_check);
        if (gender_check.equals("Мужской")) Person.setGender_value("Мужской");
        else if (gender_check.equals("Женский")) Person.setGender_value("Женский");

        if (check_amb.equals("Набор мышечной массы") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Beginner2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Набор мышечной массы") && check_height > 165 && check_weight > 60 && check_height < 180 && check_weight < 70) {
            Intent n_2_click = new Intent(this, Intermediate1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Набор мышечной массы") &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Professional_1.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Набор мышечной массы")&&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner1.class);
            startActivity(n_4_click);
        }

        // second

        if (check_amb.equals("Потеря веса") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Intermediate2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Потеря веса")&& check_height > 165 && check_weight > 60 && check_height < 180 && check_weight < 70) {
            Intent n_2_click = new Intent(this, Professional_1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Потеря веса") &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Professional2.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Потеря веса") &&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner2.class);
            startActivity(n_4_click);
        }

        // third

        if (check_amb.equals("Поддержание тела в тонусе") && check_height <= 165 && check_weight <= 60) {
            Intent n_1_click = new Intent(this, Beginner2.class);
            startActivity(n_1_click);
        }
        else if(check_amb.equals("Поддержание тела в тонусе") && check_height > 165 && check_weight > 60 && check_height < 180 && check_weight < 70) {
            Intent n_2_click = new Intent(this, Intermediate1.class);
            startActivity(n_2_click);
        }
        else if(check_amb.equals("Поддержание тела в тонусе") &&  check_height >= 180 && check_weight >= 70) {
            Intent n_3_click = new Intent(this, Intermediate2.class);
            startActivity(n_3_click);
        }
        else if (check_amb.equals("Поддержание тела в тонусе")&&  ((check_height > 180 && check_weight < 69) || (check_height < 165 && check_weight > 70) || (check_height < 180 && check_weight > 70))) {
            Intent n_4_click = new Intent(this, Beginner1.class);
            startActivity(n_4_click);
        }
    }


}
