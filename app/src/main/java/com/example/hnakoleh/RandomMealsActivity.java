package com.example.hnakoleh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hnakoleh.model.MealsDB;
import com.example.hnakoleh.view.HomeActivity;


public class RandomMealsActivity extends AppCompatActivity {
    MealsDB mealsDB = new MealsDB();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView ingredients = findViewById(R.id.textViewاسم);
        final TextView names = findViewById(R.id.textView2خطوات);
        final TextView steps = findViewById(R.id.textViewوصف);
        TextView headerTextView = findViewById(R.id.headerTextView);
        Button Dinnerbutton = findViewById(R.id.buttonUploadDinnerData);
        Button Breakfastbutton = findViewById(R.id.buttonUploadbreakfastData);
        Button Luanchbutton = findViewById(R.id.buttonUploadLaunchData);



        Dinnerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mealsDB.getDinnerData(names, ingredients, steps);
            }
        });

        Luanchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mealsDB.getLunchData(names, ingredients, steps);
            }
        });

        Breakfastbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mealsDB.getBreakfastData(names, ingredients, steps);
            }
        });

    }


}
