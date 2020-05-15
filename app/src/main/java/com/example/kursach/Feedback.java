package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Feedback extends AppCompatActivity {

    String gender_check;
    EditText mEditTextTo, mEditTextFrom, mEditTextText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        mEditTextTo = findViewById(R.id.textEmail);
        mEditTextFrom = findViewById(R.id.textEmail_from);
        mEditTextText = findViewById(R.id.text_is);

        Button buttonSend = findViewById(R.id.send);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }

    private void sendMail() {
        String recipientList = mEditTextTo.getText().toString();
        String[] recipients = recipientList.split(",");

        String subject = mEditTextFrom.getText().toString();
        String message = mEditTextText.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,recipients );
        intent.putExtra(Intent.EXTRA_SUBJECT,subject );
        intent.putExtra(Intent.EXTRA_TEXT,message );

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));

    }

    public void change_click(View view){
        Intent intent_plan = new Intent(this, AfterSplash.class);
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
