package com.example.parkiory;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parkiory.HomeAdapter.PersonViewHolder;
import com.example.parkiory.HomeAdapter.Person;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class StoredActivity extends AppCompatActivity {
    private DatabaseReference PersonsRef;
    private RecyclerView recyclerView_explore_persons;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stored);
        PersonsRef = FirebaseDatabase.getInstance().getReference().child("Person");
        recyclerView_explore_persons= findViewById(R.id.persondetailrecyclerView);
        recyclerView_explore_persons.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView_explore_persons.setLayoutManager(layoutManager);
    }
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerOptions<Person> options =
                new FirebaseRecyclerOptions.Builder<Person>()
                        .setQuery(PersonsRef, Person.class)
                        .build();

        FirebaseRecyclerAdapter<Person, PersonViewHolder> adapter =
                new FirebaseRecyclerAdapter<Person, PersonViewHolder>(options) {
                    @Override
                    protected void onBindViewHolder(@NonNull PersonViewHolder holder, int position, @NonNull final Person model)
                    {
                        holder.txtPersonName.setText(model.getPname());
                        holder.txtPersonDescription.setText(model.getDescription());
                        holder.txtPersonComments.setText(model.getComments());
                        Picasso.get().load(model.getImage()).into(holder.imageView);

                    }

                    @NonNull
                    @Override
                    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_detail_layout, parent, false);
                        PersonViewHolder holder = new PersonViewHolder(view);
                        return holder;
                    }
                };
        recyclerView_explore_persons.setAdapter(adapter);
        adapter.startListening();

    }
}