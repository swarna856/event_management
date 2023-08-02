package com.example.atria;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonGetStarted;
    FirebaseAuth auth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGetStarted = findViewById(R.id.button3);

        buttonGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your logic to navigate to the next activity or perform any action
                // For example, start a new activity
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
