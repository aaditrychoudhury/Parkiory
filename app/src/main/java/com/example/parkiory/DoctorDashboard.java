package com.example.parkiory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.parkiory.HomeAdapter.FeaturedHelperClass;

import java.util.ArrayList;

public class DoctorDashboard extends AppCompatActivity {

    RecyclerView featuredRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove the status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_doctor_dashboard);

        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycler);

        featuredRecycler();

    }

    private void featuredRecycler(){

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass(R.drawable.yuviraj,"YUVRAJ SINGH DEORA","Need a little more observation.Suffering with parkinson but no sign of Alzheimer"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.ishika,"YUVRAJ SINGH DEORA","Need a little more observation.Suffering with parkinson but no sign of Alzheimer"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.aaditry,"YUVRAJ SINGH DEORA","Need a little more observation.Suffering with parkinson but no sign of Alzheimer"));

    }
}