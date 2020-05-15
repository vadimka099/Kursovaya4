package com.example.kursach;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class MyGridAdapter extends ArrayAdapter {
    List<Date> dates;
    SimpleDateFormat dateFormat1=new SimpleDateFormat("dd-MMMM-yyyy", Locale.ENGLISH);
    Calendar currentDate;
    LayoutInflater inflater;
    Map<String, String> hashMap = new HashMap<>();




    public MyGridAdapter(@NonNull Context context, List<Date> dates, Calendar currentDate, Map<String, String> hashMap) {
        super(context, R.layout.single_cell_layout);
        this.dates=dates;
        this.currentDate=currentDate;
        this.hashMap=hashMap;
        inflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return dates.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return dates.get(position);
    }

    @Override
    public int getPosition(@Nullable Object item) {
        return dates.indexOf(item);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Date monthDate = dates.get(position);
        Calendar dateCalendar = Calendar.getInstance();
        dateCalendar.setTime(monthDate);
        int DayNo = dateCalendar.get(Calendar.DAY_OF_MONTH);

        final String date=dateFormat1.format(dates.get(position));
        int displayMonth = dateCalendar.get(Calendar.MONTH);
        int currentMonth = currentDate.get(Calendar.MONTH);
        int currentDay=currentDate.get(Calendar.DAY_OF_MONTH);
        int displayDay= dateCalendar.get(Calendar.DAY_OF_MONTH);

        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.single_cell_layout, parent, false);
        }


        if (displayMonth!=currentMonth)
            view.setBackgroundColor(getContext().getResources().getColor(R.color.colorGrey));









            TextView Day_Number = view.findViewById(R.id.calendar_day);
            Day_Number.setText(String.valueOf(DayNo));


            return view;
        }
    }