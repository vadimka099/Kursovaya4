package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BodyInformation extends AppCompatActivity {
    

    SharedPreferences mSettings;
    String weight_str,height_str,age_str;
    final String WEIGHT_TEXT = "weight text";
    final String HEIGHT_TEXT = "height text";
    final String AGE_TEXT = "age text";
    int saveText_weight_int,saveText_height_int,saveText_age_int;
    String check;
    String saveText_weight , saveText_height , saveText_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_information);

        Intent intent = getIntent();
        check = intent.getStringExtra("check_button");

        if ("change".equals(check)) {
            saveText_weight = "";
            saveText_height = "";
            saveText_age = "";
        }
        else {

            mSettings = getPreferences(MODE_PRIVATE);
            saveText_weight = mSettings.getString(WEIGHT_TEXT, "");
            saveText_height = mSettings.getString(HEIGHT_TEXT, "");
            saveText_age = mSettings.getString(AGE_TEXT, "");

            saveText_weight_int = Integer.parseInt(saveText_weight);
            saveText_height_int = Integer.parseInt(saveText_height);
            saveText_age_int = Integer.parseInt(saveText_age);
        }
            Person.setWeight_value_string(saveText_weight);
            Person.setHeight_value_string(saveText_height);
            Person.setAge_value_string(saveText_age);

            Person.setWeight_value_int(saveText_weight_int);
            Person.setHeight_value_int(saveText_height_int);
            Person.setAge_value_int(saveText_age_int);


            Toast.makeText(this, "Text Load", Toast.LENGTH_SHORT).show();


       if (!saveText_weight.equals("") && !saveText_height.equals("") && !saveText_age.equals("")  && saveText_weight_int != 0 && saveText_height_int != 0 && saveText_age_int != 0){
           Intent intent_next = new Intent(this, Ambitions.class);
           startActivity(intent_next);
       }


        }


    public void next_click(View view) {

        EditText editText_height = findViewById(R.id.height_edit_text);
        EditText editText_weight = findViewById(R.id.weight_edit_text);
        EditText editText_age = findViewById(R.id.age_edit_text);
        Button button = findViewById(R.id.button_next);

        if (editText_height.getText().toString().equals("") || editText_weight.getText().toString().equals("") || editText_age.getText().toString().equals(""))
        {
            button.setClickable(true);

        }
        else
        {

            check = "change";

            button.setClickable(true);
            Intent intent_next = new Intent(this, Ambitions.class);

            weight_str = editText_weight.getText().toString();
            int weight_int = Integer.parseInt(weight_str);
            Person.setWeight_value_int(weight_int);
            Person.setWeight_value_string(weight_str);

            mSettings = getPreferences(MODE_PRIVATE);
            SharedPreferences.Editor edito_w = mSettings.edit();
            edito_w.putString(WEIGHT_TEXT, weight_str);
            edito_w.apply();


            height_str = editText_height.getText().toString();
            int height_int = Integer.parseInt(height_str);
            Person.setHeight_value_int(height_int);
            Person.setHeight_value_string(height_str);

            mSettings = getPreferences(MODE_PRIVATE);
            SharedPreferences.Editor editor_h = mSettings.edit();
            editor_h.putString(HEIGHT_TEXT, height_str);
            editor_h.apply();

            age_str = editText_age.getText().toString();
            int age_int = Integer.parseInt(age_str);
            Person.setAge_value_int(age_int);
            Person.setAge_value_string(age_str);

            mSettings = getPreferences(MODE_PRIVATE);
            SharedPreferences.Editor editor_a = mSettings.edit();
            editor_a.putString(AGE_TEXT, age_str);
            editor_a.apply();

            intent_next.putExtra("check_button", check);
            startActivity(intent_next);



        }

    }


}
