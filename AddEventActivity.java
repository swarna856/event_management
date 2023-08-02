package com.example.atria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;

public class AddEventActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    EditText name, cname,max,date,last;
    Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_addevent);
        //Hooks
        name = findViewById(R.id.name);
        cname = findViewById(R.id.coname);
        max = findViewById(R.id.max);
        date = findViewById(R.id.date);
        last = findViewById(R.id.lastdate);
        btn = findViewById(R.id.buttonSubmit);
        //Pass Data on Button Click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get data from input field
                String getName = name.getText().toString();
                String getCname = cname.getText().toString();
                String getMax = max.getText().toString();
                String getDate = date.getText().toString();
                String getLast = last.getText().toString();
                //Pass data to 2nd activity
                Intent intent = new Intent(AddEventActivity.this, ViewActivity.class);
                intent.putExtra("name", getName);
                intent.putExtra("cname", getCname);
                intent.putExtra("max", getMax);
                intent.putExtra("date", getDate);
                intent.putExtra("last", getLast);
                startActivity(intent);
            }
        });
    }
}
