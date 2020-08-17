package com.example.hnakoleh.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentTransaction;

import com.example.hnakoleh.R;
import com.example.hnakoleh.RandomMealsActivity;


public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        CardView breackfastCardView = findViewById(R.id.breackfastLayoutClick);

        TextView hanakoleh = findViewById(R.id.hanakolehTextView);
        hanakoleh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, RandomMealsActivity.class);
                startActivity(intent);
            }
        });

//        breackfastCardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                BreakfastListFragment fragment = new BreakfastListFragment();
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.fragment_breakfast_list, fragment);
//                transaction.commit();
//
//            }
//        });
    }
}
