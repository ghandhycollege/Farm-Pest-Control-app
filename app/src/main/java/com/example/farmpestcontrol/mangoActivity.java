package com.example.farmpestcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mangoActivity extends AppCompatActivity {

    ImageButton imgbtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mango);
        imgbtn1=(ImageButton)findViewById(R.id.mag1);

        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open();


            }
        });
    }
    public void open() {
        Intent i = new Intent(this,Mag1Activity.class);
        startActivity(i);
    }
}