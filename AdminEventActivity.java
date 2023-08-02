package com.example.atria;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminEventActivity extends AppCompatActivity {

    Button viewButton, addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        viewButton = findViewById(R.id.button4);
        addButton = findViewById(R.id.button5);

        viewButton.setOnClickListener(v -> {

            Intent intent = new Intent(AdminEventActivity.this, ViewActivity.class);
            Toast.makeText(AdminEventActivity.this, "All Existing Events!", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });

        addButton.setOnClickListener(v -> {

            Intent intent = new Intent(AdminEventActivity.this, AddEventActivity.class);
            Toast.makeText(AdminEventActivity.this, "Add a new Event!", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });
    }
}
