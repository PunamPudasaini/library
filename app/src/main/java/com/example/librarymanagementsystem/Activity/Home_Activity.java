package com.example.librarymanagementsystem.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.example.librarymanagementsystem.R;

public class Home_Activity extends AppCompatActivity {
    CardView cardview1 , cardview2,cardview3,cardview4,cardview5,cardview6;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);
        cardview1 = findViewById(R.id.cardview1);
        cardview2 = findViewById(R.id.cardview2);
        cardview3 = findViewById(R.id.cardview3);
        cardview4 = findViewById(R.id.cardview4);
        cardview5 = findViewById(R.id.cardview5);
        cardview6 = findViewById(R.id.cardview6);


        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Activity.this, "clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home_Activity.this, Total_Book_List.class);
                startActivity(intent);

            }
        });
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Activity.this, "card2", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home_Activity.this, Available_Book_List.class);
                startActivity(intent);


            }
        });

        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this, Updated_Book_List.class);
                startActivity(intent);
            }
        });
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this, Book_Report.class);
                startActivity(intent);
            }
        });

        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this, StudentList.class);
                startActivity(intent);
            }
        });

        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
