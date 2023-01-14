package com.example.parkiory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView btntxtview;
        ImageView goRegisterFace,storedData;
        goRegisterFace=(ImageView) findViewById(R.id.go_registerFaceBtn);
        storedData =(ImageView) findViewById(R.id.storedDataBtn);
        goRegisterFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Register_faceActivity.class);
                startActivity(intent);
            }
        });
        storedData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),StoredActivity.class);
                startActivity(intent);
            }
        });
        btntxtview=findViewById(R.id.features);
        btntxtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DoctorDashboard.class);
                startActivity(intent);
            }
        });
    }
}