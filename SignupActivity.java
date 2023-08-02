package com.example.atria;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignupActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button signupButton,userbutton,adminbutton;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        firebaseAuth = FirebaseAuth.getInstance();

        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        passwordEditText = findViewById(R.id.editTextTextPassword);
        signupButton = findViewById(R.id.button);
        userbutton=findViewById(R.id.button2);
        adminbutton=findViewById(R.id.button3);

        signupButton.setOnClickListener(v -> signUp());

        userbutton.setOnClickListener(v -> UserLogin());

        adminbutton.setOnClickListener(v -> AdminLogin());
    }

    private void signUp() {
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Please enter your email", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Please enter your password", Toast.LENGTH_SHORT).show();
            return;
        }

        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        // Signup successful
                        FirebaseUser user = firebaseAuth.getCurrentUser();
                        Toast.makeText(getApplicationContext(), "Signup successful. Welcome," + user.getEmail() + "!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(SignupActivity.this, UserEventActivity.class);
                        startActivity(intent);
                        // Perform any additional actions after successful signup
                    } else {
                        // Signup failed
                        Toast.makeText(getApplicationContext(), "Signup failed. Please try again.", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void UserLogin(){
        Intent intent = new Intent(SignupActivity.this, UserLoginActivity.class);
        Toast.makeText(getApplicationContext(), "Welcome Back User", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    private void AdminLogin(){
        Intent intent = new Intent(SignupActivity.this, AdminLoginActivity.class);
        Toast.makeText(getApplicationContext(), "Welcome Back Admin", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
