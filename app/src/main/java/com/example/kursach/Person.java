package com.example.kursach;

import java.util.HashMap;
import java.util.Map;

public class Person {

 public static String gender_value;
 public static int age_value_int;
 public static String age_value_string;
 public static int height_value_int;
 public static String height_value_string;
 public static int weight_value_int;
 public static String weight_value_string;
 public static String ambition;
 public static  String workout_value;
 public static Map<String, String> hashMap = new HashMap<>();

    public static String getWorkout_value() {
        return workout_value;
    }

    public static void setWorkout_value(String workout_value) {
        Person.workout_value = workout_value;
    }

    public static String getAmbition() {
        return ambition;
    }

    public static void setAmbition(String ambition) {
        Person.ambition = ambition;
    }

    public static void setGender_value(String gender_value) {
        Person.gender_value = gender_value;
    }

    public static String getGender_value() {
        return gender_value;
    }

    public static void setAge_value_int(int age_value_int) {
        Person.age_value_int = age_value_int;
    }

    public static int getAge_value_int() {
        return age_value_int;
    }

    public static String getAge_value_string() {
        return age_value_string;
    }

    public static void setAge_value_string(String age_value_string) {
        Person.age_value_string = age_value_string;
    }

    public static int getHeight_value_int() {
        return height_value_int;
    }

    public static void setHeight_value_int(int height_value_int) {
        Person.height_value_int = height_value_int;
    }

    public static int getWeight_value_int() {
        return weight_value_int;
    }

    public static void setHeight_value_string(String height_value_string) {
        Person.height_value_string = height_value_string;
    }

    public static String getHeight_value_string() {
        return height_value_string;
    }

    public static void setWeight_value_int(int weight_value_int) {
        Person.weight_value_int = weight_value_int;
    }

    public static String getWeight_value_string() {
        return weight_value_string;
    }

    public static void setWeight_value_string(String weight_value_string) {
        Person.weight_value_string = weight_value_string;
    }
}
