package com.example.expensestracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Start_Screen extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Button nextButton = findViewById(R.id.loginbutton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the LoginActivity
                Intent intent = new Intent(Start_Screen.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}