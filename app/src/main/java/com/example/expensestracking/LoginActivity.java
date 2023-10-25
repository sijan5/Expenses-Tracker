package com.example.expensestracking;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

import com.example.expensestracking.activity_signin;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView dontHaveAccountTextView = findViewById(R.id.dont_have_account);
        dontHaveAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the SignInActivity
                Intent intent = new Intent(LoginActivity.this, activity_signin.class);
                startActivity(intent);
            }
        });
    }
}
