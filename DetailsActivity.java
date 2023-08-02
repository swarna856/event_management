package com.example.atria;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DetailsActivity extends AppCompatActivity {

    public EditText name;
    public EditText team;
    public EditText mem;
    public EditText contact;
    public Button done;
    public FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = findViewById(R.id.ev1);
        team = findViewById(R.id.ev2);
        mem = findViewById(R.id.ev3);
        contact = findViewById(R.id.ev4);
        done = findViewById(R.id.b1);

        done.setOnClickListener(v -> submit());
    }

    public void submit() {
        FirebaseDatabase.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();

        DatabaseReference regRef = FirebaseDatabase.getInstance().getReference("registrations");
        String ev1 = name.getText().toString().trim();
        String ev2 = team.getText().toString().trim();
        String ev3 = mem.getText().toString().trim();
        String ev4 = contact.getText().toString().trim();


        RegisterActivity user;
        user = new RegisterActivity(ev1,ev2,ev3,ev4 );

        // Save the user object to Firebase database
        regRef.push().setValue(user).addOnSuccessListener(aVoid -> {
                    // Data successfully saved
                    Toast.makeText(getApplicationContext(), "Data saved", Toast.LENGTH_SHORT).show();
                })
                .addOnFailureListener(e -> {
                    // Error occurred while saving data
                    Toast.makeText(getApplicationContext(), "Failed to save data.Please try again", Toast.LENGTH_SHORT).show();
                });
    }



}





