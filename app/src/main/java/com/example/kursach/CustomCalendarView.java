package com.example.kursach;

import android.app.AlertDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CustomCalendarView extends LinearLayout {

    ImageButton NextButton,PreviousButton;
    TextView CurrentDate;
    GridView gridView;
    private static int MAX_CALENDAR_DAYS=42;
    Calendar calendar= Calendar.getInstance(Locale.ENGLISH);
    Context context;
    SimpleDateFormat dateFormat=new SimpleDateFormat("MMMM yyyy",Locale.ENGLISH);
    SimpleDateFormat monthFormat=new SimpleDateFormat("MMMM",Locale.ENGLISH);
    SimpleDateFormat yearFormat=new SimpleDateFormat("yyyy",Locale.ENGLISH);
    SimpleDateFormat dateFormat1=new SimpleDateFormat("dd-MMMM-yyyy",Locale.ENGLISH);
    MyGridAdapter myGridAdapter;
    List<Date> dates= new ArrayList<>();
    AlertDialog alertDialog;

    public CustomCalendarView(Context context) {

        super(context);
    }

    public CustomCalendarView(final Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        InitializeLayout();
        SetUpCalendar();

        NextButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar.add(Calendar.MONTH, 1);
                SetUpCalendar();
            }
        });

        PreviousButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar.add(Calendar.MONTH, -1);
                SetUpCalendar();
            }
        });

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder builder=new AlertDialog.Builder(context);
                builder.setCancelable(true);

                View addView = LayoutInflater.from(parent.getContext()).inflate(R.layout.dialog, null);
                final EditText ccal = addView.findViewById(R.id.calories);
                final TextView tw=  addView.findViewById(R.id.textView1);

                final String month=monthFormat.format(dates.get(position));
                final String date=dateFormat1.format(dates.get(position));
                final String year=yearFormat.format(dates.get(position))    ;
                Button add = addView.findViewById(R.id.accept);
                Button how=addView.findViewById(R.id.how);

                add.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String caal=ccal.getText().toString() ;
                        Person.hashMap.put(date,caal);


                    }
                });
                how.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s= Person.hashMap.get(date) ;
                        tw.setText(s);

                    }
                });



                builder.setView(addView);
                alertDialog = builder.create();
                alertDialog.show();
            }
        });



        }






    public CustomCalendarView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    private void InitializeLayout(){
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.custom_calendar,this);
        NextButton=view.findViewById(R.id.next_button);
        PreviousButton=view.findViewById(R.id.previous_button);
        CurrentDate=view.findViewById(R.id.currentDate);
        gridView=view.findViewById(R.id.gridView);
    }

    private void SetUpCalendar() {
        String currentDate = dateFormat.format(calendar.getTime());
        CurrentDate.setText(currentDate);
        dates.clear();
        Calendar monthCalendar = (Calendar) calendar.clone();
        monthCalendar.set(Calendar.DAY_OF_MONTH, 1);
        int FirstDayofMonth = monthCalendar.get(Calendar.DAY_OF_WEEK) - 2;
        monthCalendar.add(Calendar.DAY_OF_MONTH, -FirstDayofMonth);
        while (dates.size() < MAX_CALENDAR_DAYS) {
            dates.add(monthCalendar.getTime());
            monthCalendar.add(Calendar.DAY_OF_MONTH, 1);

        }

        

        myGridAdapter=new MyGridAdapter(context,dates,calendar, Person.hashMap);
        gridView.setAdapter(myGridAdapter);


    }


}


