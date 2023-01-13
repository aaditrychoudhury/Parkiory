package com.example.parkiory.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parkiory.R;

import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedviewHolder> {

    ArrayList<FeaturedHelperClass> featuredLocations;

    public FeaturedAdapter(ArrayList<FeaturedHelperClass> featuredLocations) {
        this.featuredLocations = featuredLocations;
    }

    @NonNull
    @Override
    public FeaturedviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_card_design,parent,false);
        FeaturedviewHolder featuredviewHolder = new FeaturedviewHolder(view);
        return featuredviewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedviewHolder holder, int position) {

        FeaturedHelperClass featuredHelperClass = featuredLocations.get(position);

        holder.image.setImageResource(featuredHelperClass.getImage());
        holder.name.setText(featuredHelperClass.getName());
        holder.desc.setText(featuredHelperClass.getDescription());



    }

    @Override
    public int getItemCount() {
        return featuredLocations.size();
    }

    public static class FeaturedviewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name,desc;

        public FeaturedviewHolder(@NonNull View itemView) {
            super(itemView);

            //Hooks
            image=itemView.findViewById(R.id.featured_image);
            name=itemView.findViewById(R.id.featured_title);
            desc=itemView.findViewById(R.id.featured_desc);


        }
    }
}
