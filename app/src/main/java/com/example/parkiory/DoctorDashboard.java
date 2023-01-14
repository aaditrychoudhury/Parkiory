package com.example.parkiory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.parkiory.HomeAdapter.FeaturedAdapter;
import com.example.parkiory.HomeAdapter.FeaturedHelperClass;

import java.util.ArrayList;

public class DoctorDashboard extends AppCompatActivity {

    RecyclerView featuredRecycler;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove the status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_doctor_dashboard);

        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycler);

        featuredRecycler();
        TextView patient_view_onclick;
        patient_view_onclick=findViewById(R.id.patient_detail_txt);
        patient_view_onclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Patient_details.class);
                startActivity(intent);
            }
        });
    }

    private void featuredRecycler(){

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass(R.drawable.yuviraj,"YUVRAJ SINGH DEORA","Need a little more observation.Suffering with parkinson but no sign of Alzheimer"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.ishika,"YUVRAJ SINGH DEORA","Need a little more observation.Suffering with parkinson but no sign of Alzheimer"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.aaditry,"YUVRAJ SINGH DEORA","Need a little more observation.Suffering with parkinson but no sign of Alzheimer"));

        adapter=new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);
    }
}