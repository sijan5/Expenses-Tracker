package com.example.expensestracking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;

public class activity_location extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private Button skipButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        autoCompleteTextView = findViewById(R.id.listoflocation);

        String[] nepalLocations = {
                "Achham",
                "Arghakhanchi",
                "Baglung",
                "Baitadi",
                "Bajhang",
                "Bajura",
                "Banke",
                "Bara",
                "Bardiya",
                "Bhaktapur",
                "Bhojpur",
                "Bhojpur",
                "Chitwan",
                "Dadeldhura",
                "Dailekh",
                "Dang",
                "Darchula",
                "Dhading",
                "Dhankuta",
                "Dhanusa",
                "Dholkha",
                "Dolpa",
                "Doti",
                "Gorkha",
                "Gulmi",
                "Humla",
                "Ilam",
                "Jajarkot",
                "Jhapa",
                "Jumla",
                "Kailali",
                "Kalikot",
                "Kanchanpur",
                "Kapilvastu",
                "Kaski",
                "Kathmandu",
                "Kavrepalanchok",
                "Khotang",
                "Lalitpur",
                "Lamjung",
                "Mahottari",
                "Makwanpur",
                "Manang",
                "Morang",
                "Mugu",
                "Mustang",
                "Myagdi",
                "Nawalparasi",
                "Nuwakot",
                "Okhaldhunga",
                "Palpa",
                "Panchthar",
                "Parbat",
                "Parsa",
                "Pyuthan",
                "Ramechhap",
                "Rasuwa",
                "Rautahat",
                "Rolpa",
                "Rukum",
                "Rupandehi",
                "Salyan",
                "Sankhuwasabha",
                "Sankhuwasabha",
                "Saptari",
                "Sarlahi",
                "Sindhuli",
                "Sindhupalchok",
                "Siraha",
                "Solukhumbu",
                "Sunsari",
                "Surkhet",
                "Syangja",
                "Tanahu",
                "Taplejung",
                "Terhathum",
                "Udayapur"

                // ... (your location data)
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_dropdown_item_1line, nepalLocations
        );
        autoCompleteTextView.setAdapter(adapter);

        TextInputLayout textInputLayout = findViewById(R.id.location);
        textInputLayout.setEndIconOnClickListener(v -> autoCompleteTextView.setText(""));

        // Find and set up the "Skip" button
        skipButton = findViewById(R.id.skip_button);
        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the Home activity when the "Skip" button is clicked
                Intent intent = new Intent(activity_location.this, activity_home.class);
                startActivity(intent);
                finish(); // Optional: Close the current activity if needed
            }
        });
    }
}
