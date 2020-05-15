package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Intermediate1 extends AppCompatActivity {
    public String gender_check;
    public String train_check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_1);

        gender_check = Person.getGender_value();
        train_check = Person.getWorkout_value();

        set_upr_intermediate_1();

    }
    public void set_upr_intermediate_1() {
        if (gender_check.equals("Мужской")) {
            if (train_check == "КОМПЛЕКСНАЯ ТРЕНИРОВКА ВСЕГО ТЕЛА") {
                // первое упражнение
                ImageView imageView = findViewById(R.id.upr_1);
                imageView.setImageResource(R.drawable.otzhymaniya);

                TextView textview = findViewById(R.id.upr_1_text);
                textview.setText(R.string.text_1);

                TextView textView_how_much_1 = findViewById(R.id.how_much_text_1);
                textView_how_much_1.setText(R.string.how_much_1_n);
                // второе упражнение

                ImageView imageView_1 = findViewById(R.id.upr_2);
                imageView_1.setImageResource(R.drawable.podtyagivaniya);

                TextView textView_how_much_2 = findViewById(R.id.how_much_text_2);
                textView_how_much_2.setText(R.string.how_much_2_n);

                TextView textview_1 = findViewById(R.id.upr_2_text);
                textview_1.setText(R.string.text_2);
                //третье упражнение

                ImageView imageView_2 = findViewById(R.id.upr_3);
                imageView_2.setImageResource(R.drawable.tyaga_verhnego_bloka);

                TextView textView_how_much_3 = findViewById(R.id.how_much_text_3);
                textView_how_much_3.setText(R.string.how_much_3_n);

                TextView textview_3 = findViewById(R.id.upr_3_text);
                textview_3.setText(R.string.text_3);
                //четвертое кпражнение

                ImageView imageView_3 = findViewById(R.id.upr_4);
                imageView_3.setImageResource(R.drawable.otzhymaniya_na_brusyah);

                TextView textView_how_much_4 = findViewById(R.id.how_much_text_4);
                textView_how_much_4.setText(R.string.how_much_4_n);

                TextView textview_4 = findViewById(R.id.upr_4_text);
                textview_4.setText(R.string.text_4);
                //пятое упражнение

                ImageView imageView_4 = findViewById(R.id.upr_5);
                imageView_4.setImageResource(R.drawable.prisedaniya);

                TextView textView_how_much_5 = findViewById(R.id.how_much_text_5);
                textView_how_much_5.setText(R.string.how_much_5_n);

                TextView textview_5 = findViewById(R.id.upr_5_text);
                textview_5.setText(R.string.text_5);
                //шестое упражнение

                ImageView imageView_6 = findViewById(R.id.upr_6);
                imageView_6.setImageResource(R.drawable.promej_zhim_pechi);

                TextView textView_how_much_6 = findViewById(R.id.how_much_text_6);
                textView_how_much_6.setText(R.string.how_much_1);

                TextView textview_6 = findViewById(R.id.upr_6_text);
                textview_6.setText(R.string.text_2_n);


            }

            if (train_check == "ТРЕНИРОВКА ВЕРХНЕЙ ЧАСТИ ТЕЛА") {

                ImageView imageView = findViewById(R.id.upr_1);
                imageView.setImageResource(R.drawable.otzhymaniya);

                TextView textview = findViewById(R.id.upr_1_text);
                textview.setText(R.string.text_1);

                TextView textView_how_much_1 = findViewById(R.id.how_much_text_1);
                textView_how_much_1.setText(R.string.how_much_1_n);

                ImageView imageView_1 = findViewById(R.id.upr_2);
                imageView_1.setImageResource(R.drawable.podem_ganteley_na_biceps);

                TextView textView_how_much_2 = findViewById(R.id.how_much_text_2);
                textView_how_much_2.setText(R.string.how_much_5_n);

                TextView textview_1 = findViewById(R.id.upr_2_text);
                textview_1.setText(R.string.text_6);

                ImageView imageView_2 = findViewById(R.id.upr_3);
                imageView_2.setImageResource(R.drawable.sgibaniya_na_biceps_v_trenazhere);

                TextView textView_how_much_3 = findViewById(R.id.how_much_text_3);
                textView_how_much_3.setText(R.string.how_much_5_n);

                TextView textview_3 = findViewById(R.id.upr_3_text);
                textview_3.setText(R.string.text_7);

                ImageView imageView_3 = findViewById(R.id.upr_4);
                imageView_3.setImageResource(R.drawable.zhym_shtangi_lezha);

                TextView textView_how_much_4 = findViewById(R.id.how_much_text_4);
                textView_how_much_4.setText(R.string.how_much_3_n);

                TextView textview_4 = findViewById(R.id.upr_4_text);
                textview_4.setText(R.string.text_8);

                ImageView imageView_4 = findViewById(R.id.upr_5);
                imageView_4.setImageResource(R.drawable.razgibaniya_na_triceps_v_trenazhere);

                TextView textView_how_much_5 = findViewById(R.id.how_much_text_5);
                textView_how_much_5.setText(R.string.how_much_5_n);

                TextView textview_5 = findViewById(R.id.upr_5_text);
                textview_5.setText(R.string.text_9);

                ImageView imageView_6 = findViewById(R.id.upr_6);
                imageView_6.setImageResource(R.drawable.mahi_sidya);

                TextView textView_how_much_6 = findViewById(R.id.how_much_text_6);
                textView_how_much_6.setText(R.string.how_much_1);

                TextView textview_6 = findViewById(R.id.upr_6_text);
                textview_6.setText(R.string.text_5_n);

            }

            if (train_check == "ТРЕНИРОВКА ТОРСА") {
                // первое упражнение
                ImageView imageView = findViewById(R.id.upr_1);
                imageView.setImageResource(R.drawable.skruchivaniya);

                TextView textview = findViewById(R.id.upr_1_text);
                textview.setText(R.string.text_11);

                TextView textView_how_much_1 = findViewById(R.id.how_much_text_1);
                textView_how_much_1.setText(R.string.how_much_5_n);
                // второе упражнение

                ImageView imageView_1 = findViewById(R.id.upr_2);
                imageView_1.setImageResource(R.drawable.podem_koleney_na_press);

                TextView textView_how_much_2 = findViewById(R.id.how_much_text_2);
                textView_how_much_2.setText(R.string.how_much_5_n);

                TextView textview_1 = findViewById(R.id.upr_2_text);
                textview_1.setText(R.string.text_13);
                //третье упражнение

                ImageView imageView_2 = findViewById(R.id.upr_3);
                imageView_2.setImageResource(R.drawable.obratnie_skruchivaniya);

                TextView textView_how_much_3 = findViewById(R.id.how_much_text_3);
                textView_how_much_3.setText(R.string.how_much_3_n);

                TextView textview_3 = findViewById(R.id.upr_3_text);
                textview_3.setText(R.string.text_12);
                //четвертое кпражнение

                ImageView imageView_3 = findViewById(R.id.upr_4);
                imageView_3.setImageResource(R.drawable.skruchivaniya_na_press);

                TextView textView_how_much_4 = findViewById(R.id.how_much_text_4);
                textView_how_much_4.setText(R.string.how_much_5_n);

                TextView textview_4 = findViewById(R.id.upr_4_text);
                textview_4.setText(R.string.text_14);
                //пятое упражнение

                ImageView imageView_6 = findViewById(R.id.upr_6);
                imageView_6.setImageResource(R.drawable.nogi_skam);

                TextView textView_how_much_6 = findViewById(R.id.how_much_text_6);
                textView_how_much_6.setText(R.string.how_much_1_f);

                TextView textview_6 = findViewById(R.id.upr_6_text);
                textview_6.setText(R.string.text_4_n);
                //шестое упражнение

                ImageView imageView_4 = findViewById(R.id.upr_5);
                imageView_4.setImageResource(R.drawable.planka);

                TextView textView_how_much_5 = findViewById(R.id.how_much_text_5);
                textView_how_much_5.setText(R.string.how_much_6_n);

                TextView textview_5 = findViewById(R.id.upr_5_text);
                textview_5.setText(R.string.text_10);
            }

            if (train_check == "ТРЕНИРОВКА СПИНЫ") {
                // первое упражнение
                ImageView imageView = findViewById(R.id.upr_1);
                imageView.setImageResource(R.drawable.podtyagivaniya);

                TextView textview = findViewById(R.id.upr_1_text);
                textview.setText(R.string.text_2);

                TextView textView_how_much_1 = findViewById(R.id.how_much_text_1);
                textView_how_much_1.setText(R.string.how_much_2_n);
                // второе упражнение

                ImageView imageView_1 = findViewById(R.id.upr_2);
                imageView_1.setImageResource(R.drawable.tyaga_verhnego_bloka);

                TextView textView_how_much_2 = findViewById(R.id.how_much_text_2);
                textView_how_much_2.setText(R.string.how_much_3_n);

                TextView textview_1 = findViewById(R.id.upr_2_text);
                textview_1.setText(R.string.text_3);
                //третье упражнение

                ImageView imageView_2 = findViewById(R.id.upr_3);
                imageView_2.setImageResource(R.drawable.spina_second);

                TextView textView_how_much_3 = findViewById(R.id.how_much_text_3);
                textView_how_much_3.setText(R.string.how_much_3_n);

                TextView textview_3 = findViewById(R.id.upr_3_text);
                textview_3.setText(R.string.text_22);
                //четвертое кпражнение

                ImageView imageView_3 = findViewById(R.id.upr_4);
                imageView_3.setImageResource(R.drawable.tyaga_ganteley_lezha);

                TextView textView_how_much_4 = findViewById(R.id.how_much_text_4);
                textView_how_much_4.setText(R.string.how_much_5_n);

                TextView textview_4 = findViewById(R.id.upr_4_text);
                textview_4.setText(R.string.text_15);
                //пятое упражнение

                ImageView imageView_4 = findViewById(R.id.upr_5);
                imageView_4.setImageResource(R.drawable.tyaga_shtangi_k_zhyvotu);

                TextView textView_how_much_5 = findViewById(R.id.how_much_text_5);
                textView_how_much_5.setText(R.string.how_much_4_n);

                TextView textview_5 = findViewById(R.id.upr_5_text);
                textview_5.setText(R.string.text_16);
                //шестое упражнение

                ImageView imageView_6 = findViewById(R.id.upr_6);
                imageView_6.setImageResource(R.drawable.spina_dop_1);

                TextView textView_how_much_6 = findViewById(R.id.how_much_text_6);
                textView_how_much_6.setText(R.string.how_much_4_n);

                TextView textview_6 = findViewById(R.id.upr_6_text);
                textview_6.setText(R.string.text_1_n);
            }
            if (train_check == "ТРЕНИРОВКА НИЖНЕЙ ЧАСТИ ТЕЛА") {
                // первое упражнение
                ImageView imageView = findViewById(R.id.upr_1);
                imageView.setImageResource(R.drawable.razgibanie_nog);

                TextView textview = findViewById(R.id.upr_1_text);
                textview.setText(R.string.text_17);

                TextView textView_how_much_1 = findViewById(R.id.how_much_text_1);
                textView_how_much_1.setText(R.string.how_much_1_n);
                // второе упражнение

                ImageView imageView_1 = findViewById(R.id.upr_2);
                imageView_1.setImageResource(R.drawable.prisedaniya);

                TextView textView_how_much_2 = findViewById(R.id.how_much_text_2);
                textView_how_much_2.setText(R.string.how_much_5_n);

                TextView textview_1 = findViewById(R.id.upr_2_text);
                textview_1.setText(R.string.text_5);
                //третье упражнение

                ImageView imageView_2 = findViewById(R.id.upr_3);
                imageView_2.setImageResource(R.drawable.jim_nogami);

                TextView textView_how_much_3 = findViewById(R.id.how_much_text_3);
                textView_how_much_3.setText(R.string.how_much_3_n);

                TextView textview_3 = findViewById(R.id.upr_3_text);
                textview_3.setText(R.string.text_20);
                //четвертое кпражнение

                ImageView imageView_3 = findViewById(R.id.upr_4);
                imageView_3.setImageResource(R.drawable.sgibanie_nog_leja);

                TextView textView_how_much_4 = findViewById(R.id.how_much_text_4);
                textView_how_much_4.setText(R.string.how_much_5_n);

                TextView textview_4 = findViewById(R.id.upr_4_text);
                textview_4.setText(R.string.text_19);
                //пятое упражнение

                ImageView imageView_4 = findViewById(R.id.upr_5);
                imageView_4.setImageResource(R.drawable.noski);

                TextView textView_how_much_5 = findViewById(R.id.how_much_text_5);
                textView_how_much_5.setText(R.string.how_much_3_n);

                TextView textview_5 = findViewById(R.id.upr_5_text);
                textview_5.setText(R.string.text_18);
                //шестое упражнение

                ImageView imageView_6 = findViewById(R.id.upr_6);
                imageView_6.setImageResource(R.drawable.vypadi);

                TextView textView_how_much_6 = findViewById(R.id.how_much_text_6);
                textView_how_much_6.setText(R.string.how_much_1_f);

                TextView textview_6 = findViewById(R.id.upr_6_text);
                textview_6.setText(R.string.text_3_n);
            }
        } else if (gender_check.equals("Женский")) {
            if (train_check == "КОМПЛЕКСНАЯ ТРЕНИРОВКА ВСЕГО ТЕЛА") {
                // первое упражнение
                ImageView imageView = findViewById(R.id.upr_1);
                imageView.setImageResource(R.drawable.otz_fem);

                TextView textview = findViewById(R.id.upr_1_text);
                textview.setText(R.string.text_1);

                TextView textView_how_much_1 = findViewById(R.id.how_much_text_1);
                textView_how_much_1.setText(R.string.how_much_1_n);
                // второе упражнение

                ImageView imageView_1 = findViewById(R.id.upr_2);
                imageView_1.setImageResource(R.drawable.podt_fem);

                TextView textView_how_much_2 = findViewById(R.id.how_much_text_2);
                textView_how_much_2.setText(R.string.how_much_2_n);

                TextView textview_1 = findViewById(R.id.upr_2_text);
                textview_1.setText(R.string.text_2);
                //третье упражнение

                ImageView imageView_2 = findViewById(R.id.upr_3);
                imageView_2.setImageResource(R.drawable.tyaga_verh_fem);

                TextView textView_how_much_3 = findViewById(R.id.how_much_text_3);
                textView_how_much_3.setText(R.string.how_much_3_n);

                TextView textview_3 = findViewById(R.id.upr_3_text);
                textview_3.setText(R.string.text_3);
                //четвертое кпражнение

                ImageView imageView_3 = findViewById(R.id.upr_4);
                imageView_3.setImageResource(R.drawable.brus_fem);

                TextView textView_how_much_4 = findViewById(R.id.how_much_text_4);
                textView_how_much_4.setText(R.string.how_much_4_n);

                TextView textview_4 = findViewById(R.id.upr_4_text);
                textview_4.setText(R.string.text_4);
                //пятое упражнение

                ImageView imageView_4 = findViewById(R.id.upr_5);
                imageView_4.setImageResource(R.drawable.prised_fem);

                TextView textView_how_much_5 = findViewById(R.id.how_much_text_5);
                textView_how_much_5.setText(R.string.how_much_5_n);

                TextView textview_5 = findViewById(R.id.upr_5_text);
                textview_5.setText(R.string.text_5);
                //шестое упражнение

                ImageView imageView_6 = findViewById(R.id.upr_6);
                imageView_6.setImageResource(R.drawable.jim_plechi_fem);

                TextView textView_how_much_6 = findViewById(R.id.how_much_text_6);
                textView_how_much_6.setText(R.string.how_much_1);

                TextView textview_6 = findViewById(R.id.upr_6_text);
                textview_6.setText(R.string.text_2_n);

            }

            if (train_check == "ТРЕНИРОВКА ВЕРХНЕЙ ЧАСТИ ТЕЛА") {

                ImageView imageView = findViewById(R.id.upr_1);
                imageView.setImageResource(R.drawable.otz_fem);

                TextView textview = findViewById(R.id.upr_1_text);
                textview.setText(R.string.text_1);

                TextView textView_how_much_1 = findViewById(R.id.how_much_text_1);
                textView_how_much_1.setText(R.string.how_much_1_n);

                ImageView imageView_1 = findViewById(R.id.upr_2);
                imageView_1.setImageResource(R.drawable.biceps_fem);

                TextView textView_how_much_2 = findViewById(R.id.how_much_text_2);
                textView_how_much_2.setText(R.string.how_much_5_n);

                TextView textview_1 = findViewById(R.id.upr_2_text);
                textview_1.setText(R.string.text_6);

                ImageView imageView_2 = findViewById(R.id.upr_3);
                imageView_2.setImageResource(R.drawable.biceps_cross_fem);

                TextView textView_how_much_3 = findViewById(R.id.how_much_text_3);
                textView_how_much_3.setText(R.string.how_much_5_n);

                TextView textview_3 = findViewById(R.id.upr_3_text);
                textview_3.setText(R.string.text_7);

                ImageView imageView_3 = findViewById(R.id.upr_4);
                imageView_3.setImageResource(R.drawable.jim_shtangi_fem);

                TextView textView_how_much_4 = findViewById(R.id.how_much_text_4);
                textView_how_much_4.setText(R.string.how_much_3_n);

                TextView textview_4 = findViewById(R.id.upr_4_text);
                textview_4.setText(R.string.text_8);

                ImageView imageView_4 = findViewById(R.id.upr_5);
                imageView_4.setImageResource(R.drawable.triceps_cross_fem);

                TextView textView_how_much_5 = findViewById(R.id.how_much_text_5);
                textView_how_much_5.setText(R.string.how_much_5_n);

                TextView textview_5 = findViewById(R.id.upr_5_text);
                textview_5.setText(R.string.text_9);

                ImageView imageView_6 = findViewById(R.id.upr_6);
                imageView_6.setImageResource(R.drawable.mahi_sidya_fem);

                TextView textView_how_much_6 = findViewById(R.id.how_much_text_6);
                textView_how_much_6.setText(R.string.how_much_1);

                TextView textview_6 = findViewById(R.id.upr_6_text);
                textview_6.setText(R.string.text_5_n);
            }

            if (train_check == "ТРЕНИРОВКА ТОРСА") {
                // первое упражнение
                ImageView imageView = findViewById(R.id.upr_1);
                imageView.setImageResource(R.drawable.press_fem);

                TextView textview = findViewById(R.id.upr_1_text);
                textview.setText(R.string.text_11);

                TextView textView_how_much_1 = findViewById(R.id.how_much_text_1);
                textView_how_much_1.setText(R.string.how_much_5_n);
                // второе упражнение

                ImageView imageView_1 = findViewById(R.id.upr_2);
                imageView_1.setImageResource(R.drawable.turnik_fem);

                TextView textView_how_much_2 = findViewById(R.id.how_much_text_2);
                textView_how_much_2.setText(R.string.how_much_5_n);

                TextView textview_1 = findViewById(R.id.upr_2_text);
                textview_1.setText(R.string.text_13);
                //третье упражнение

                ImageView imageView_2 = findViewById(R.id.upr_3);
                imageView_2.setImageResource(R.drawable.obr_skr_fem);

                TextView textView_how_much_3 = findViewById(R.id.how_much_text_3);
                textView_how_much_3.setText(R.string.how_much_3_n);

                TextView textview_3 = findViewById(R.id.upr_3_text);
                textview_3.setText(R.string.text_12);
                //четвертое кпражнение

                ImageView imageView_3 = findViewById(R.id.upr_4);
                imageView_3.setImageResource(R.drawable.press_otyag_fem);

                TextView textView_how_much_4 = findViewById(R.id.how_much_text_4);
                textView_how_much_4.setText(R.string.how_much_5_n);

                TextView textview_4 = findViewById(R.id.upr_4_text);
                textview_4.setText(R.string.text_14);
                //пятое упражнение

                ImageView imageView_4 = findViewById(R.id.upr_5);
                imageView_4.setImageResource(R.drawable.planka_fem);

                TextView textView_how_much_5 = findViewById(R.id.how_much_text_5);
                textView_how_much_5.setText(R.string.how_much_6_n);

                TextView textview_5 = findViewById(R.id.upr_5_text);
                textview_5.setText(R.string.text_10);
                //шестое упражнение

                ImageView imageView_6 = findViewById(R.id.upr_6);
                imageView_6.setImageResource(R.drawable.nogi_skam_fem);

                TextView textView_how_much_6 = findViewById(R.id.how_much_text_6);
                textView_how_much_6.setText(R.string.how_much_1_f);

                TextView textview_6 = findViewById(R.id.upr_6_text);
                textview_6.setText(R.string.text_4_n);
            }

            if (train_check == "ТРЕНИРОВКА СПИНЫ") {
                // первое упражнение
                ImageView imageView = findViewById(R.id.upr_1);
                imageView.setImageResource(R.drawable.podt_fem);

                TextView textview = findViewById(R.id.upr_1_text);
                textview.setText(R.string.text_2);

                TextView textView_how_much_1 = findViewById(R.id.how_much_text_1);
                textView_how_much_1.setText(R.string.how_much_2_n);
                // второе упражнение

                ImageView imageView_1 = findViewById(R.id.upr_2);
                imageView_1.setImageResource(R.drawable.tyaga_verh_fem);

                TextView textView_how_much_2 = findViewById(R.id.how_much_text_2);
                textView_how_much_2.setText(R.string.how_much_3_n);

                TextView textview_1 = findViewById(R.id.upr_2_text);
                textview_1.setText(R.string.text_3);
                //третье упражнение

                ImageView imageView_2 = findViewById(R.id.upr_3);
                imageView_2.setImageResource(R.drawable.tyaga_second_fem);

                TextView textView_how_much_3 = findViewById(R.id.how_much_text_3);
                textView_how_much_3.setText(R.string.how_much_3_n);

                TextView textview_3 = findViewById(R.id.upr_3_text);
                textview_3.setText(R.string.text_22);
                //четвертое кпражнение

                ImageView imageView_3 = findViewById(R.id.upr_4);
                imageView_3.setImageResource(R.drawable.gant_lezha_fem);

                TextView textView_how_much_4 = findViewById(R.id.how_much_text_4);
                textView_how_much_4.setText(R.string.how_much_5_n);

                TextView textview_4 = findViewById(R.id.upr_4_text);
                textview_4.setText(R.string.text_15);
                //пятое упражнение

                ImageView imageView_4 = findViewById(R.id.upr_5);
                imageView_4.setImageResource(R.drawable.tyaga_sht_spina_fem);

                TextView textView_how_much_5 = findViewById(R.id.how_much_text_5);
                textView_how_much_5.setText(R.string.how_much_3_n);

                TextView textview_5 = findViewById(R.id.upr_5_text);
                textview_5.setText(R.string.text_16);
                //шестое упражнение

                ImageView imageView_6 = findViewById(R.id.upr_6);
                imageView_6.setImageResource(R.drawable.spina_dop_1_fem);

                TextView textView_how_much_6 = findViewById(R.id.how_much_text_6);
                textView_how_much_6.setText(R.string.how_much_4_n);

                TextView textview_6 = findViewById(R.id.upr_6_text);
                textview_6.setText(R.string.text_1_n);
            }
            if (train_check == "ТРЕНИРОВКА НИЖНЕЙ ЧАСТИ ТЕЛА") {
                // первое упражнение
                ImageView imageView = findViewById(R.id.upr_1);
                imageView.setImageResource(R.drawable.razgib_fem);

                TextView textview = findViewById(R.id.upr_1_text);
                textview.setText(R.string.text_17);

                TextView textView_how_much_1 = findViewById(R.id.how_much_text_1);
                textView_how_much_1.setText(R.string.how_much_1_n);
                // второе упражнение

                ImageView imageView_1 = findViewById(R.id.upr_2);
                imageView_1.setImageResource(R.drawable.prised_fem);

                TextView textView_how_much_2 = findViewById(R.id.how_much_text_2);
                textView_how_much_2.setText(R.string.how_much_5_n);

                TextView textview_1 = findViewById(R.id.upr_2_text);
                textview_1.setText(R.string.text_5);
                //третье упражнение

                ImageView imageView_2 = findViewById(R.id.upr_3);
                imageView_2.setImageResource(R.drawable.jim_nogi_fem);

                TextView textView_how_much_3 = findViewById(R.id.how_much_text_3);
                textView_how_much_3.setText(R.string.how_much_3_n);

                TextView textview_3 = findViewById(R.id.upr_3_text);
                textview_3.setText(R.string.text_20);
                //четвертое кпражнение

                ImageView imageView_3 = findViewById(R.id.upr_4);
                imageView_3.setImageResource(R.drawable.sgib_nog_fem);

                TextView textView_how_much_4 = findViewById(R.id.how_much_text_4);
                textView_how_much_4.setText(R.string.how_much_5_n);

                TextView textview_4 = findViewById(R.id.upr_4_text);
                textview_4.setText(R.string.text_19);
                //пятое упражнение

                ImageView imageView_4 = findViewById(R.id.upr_5);
                imageView_4.setImageResource(R.drawable.ykri_fem);

                TextView textView_how_much_5 = findViewById(R.id.how_much_text_5);
                textView_how_much_5.setText(R.string.how_much_3_n);

                TextView textview_5 = findViewById(R.id.upr_5_text);
                textview_5.setText(R.string.text_18);
                //шестое упражнение

                ImageView imageView_6 = findViewById(R.id.upr_6);
                imageView_6.setImageResource(R.drawable.vypadi_fem);

                TextView textView_how_much_6 = findViewById(R.id.how_much_text_6);
                textView_how_much_6.setText(R.string.how_much_1_f);

                TextView textview_6 = findViewById(R.id.upr_6_text);
                textview_6.setText(R.string.text_3_n);
            }
        }

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