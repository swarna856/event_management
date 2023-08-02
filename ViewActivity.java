package com.example.atria;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {


    public Button b1,b2,b3,b4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_events);
        b1=findViewById(R.id.button6);
        b2=findViewById(R.id.button7);
        b3=findViewById(R.id.button8);
        b4=findViewById(R.id.button9);


        b1.setOnClickListener(v -> reg());

        b2.setOnClickListener(v -> reg());

        b3.setOnClickListener(v -> reg());
        b4.setOnClickListener(v -> reg());
    }

        public void reg(){
            Intent intent = new Intent(ViewActivity.this, DetailsActivity.class);
            Toast.makeText(getApplicationContext(), "Please Enter the Details", Toast.LENGTH_SHORT).show();
            startActivity(intent);

    }
}