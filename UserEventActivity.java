package com.example.atria;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UserEventActivity extends AppCompatActivity {

    Button viewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashborad);

        viewButton = findViewById(R.id.button4);


        viewButton.setOnClickListener(v -> {
            // Add your logic to navigate to the next activity or perform any action
            // For example, start a new activity
            Intent intent = new Intent(UserEventActivity.this, ViewActivity.class);
            Toast.makeText(UserEventActivity.this, "All Existing Events!", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });
    }
}