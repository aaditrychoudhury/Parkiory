package com.example.parkiory.HomeAdapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.example.parkiory.R;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    public TextView txtPersonName, txtPersonDescription, txtPersonComments;
    public ImageView imageView;
    public PersonViewHolder(View itemView)
    {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.person_image);
        txtPersonName = (TextView) itemView.findViewById(R.id.person_name);
        txtPersonDescription = (TextView) itemView.findViewById(R.id.person_description_layout_store_data);
        txtPersonComments = (TextView) itemView.findViewById(R.id.comment);
    }
}
