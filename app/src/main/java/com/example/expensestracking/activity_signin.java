package com.example.expensestracking;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;  // Add this import
import android.content.Intent;

public class activity_signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        TextView alreadyHaveAccountTextView = findViewById(R.id.already_have_account);
        alreadyHaveAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the LoginActivity
                Intent intent = new Intent(activity_signin.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        Button createButton = findViewById(R.id.create_account); // Find the "Create Account" button
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the LocationActivity when the "Create Account" button is clicked
                Intent intent = new Intent(activity_signin.this, activity_location.class);
                startActivity(intent);
            }
        });
    }
}
