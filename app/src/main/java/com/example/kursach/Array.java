package com.example.kursach;

public class Array {
    String DAY,MONTH,YEAR,CALORIES;

    public Array(String DAY, String MONTH, String YEAR, String CALORIES) {
        this.DAY = DAY;
        this.MONTH = MONTH;
        this.YEAR = YEAR;
        this.CALORIES = CALORIES;
    }
    public Array() {

    }

    public String getDAY() {
        return DAY;
    }

    public String getMONTH() {
        return MONTH;
    }

    public String getYEAR() {
        return YEAR;
    }

    public String getCALORIES() {
        return CALORIES;
    }

    public void setDAY(String DAY) {
        this.DAY = DAY;
    }

    public void setMONTH(String MONTH) {
        this.MONTH = MONTH;
    }

    public void setYEAR(String YEAR) {
        this.YEAR = YEAR;
    }

    public void setCALORIES(String CALORIES) {
        this.CALORIES = CALORIES;
    }
}
