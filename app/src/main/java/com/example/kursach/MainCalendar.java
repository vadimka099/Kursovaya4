package com.example.kursach;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainCalendar extends AppCompatActivity {
    CustomCalendarView customCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customCalendarView= findViewById(R.id.customCalendar);
    }
}
