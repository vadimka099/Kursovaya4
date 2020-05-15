package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class YourLevel extends AppCompatActivity {

    TextView our_train;
    public String gender_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_level);

        our_train = findViewById(R.id.Your_train_id);
        our_train.setText(Person.getWorkout_value());
    }

    public void n_1_click(View view) {

        Intent n_1_click = new Intent(this, Beginner1.class);
        startActivity(n_1_click);
    }

    public void n_2_click(View view) {
        Intent n_2_click = new Intent(this, Beginner2.class);
        startActivity(n_2_click);
    }

    public void p_1_click(View view) {
        Intent p_1_click = new Intent(this, Intermediate1.class);
        startActivity(p_1_click);
    }

    public void p_2_click(View view) {
        Intent p_2_click = new Intent(this, Intermediate2.class);
        startActivity(p_2_click);
    }

    public void pr_1_click(View view) {
        Intent pr_1_click = new Intent(this, Professional_1.class);
        startActivity(pr_1_click);
    }


    public void pr_2_click(View view) {
        Intent pr_2_click = new Intent(this, Professional2.class);
        startActivity(pr_2_click);
    }
}
