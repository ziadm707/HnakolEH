package com.example.hnakoleh.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hnakoleh.R;

import java.util.zip.Inflater;

class MyViewHolder extends RecyclerView.ViewHolder {

    TextView name_item_recycler , ingredients_item_recycler , steps_item_recycler;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        name_item_recycler =itemView.findViewById(R.id.name_item_recycler);
        ingredients_item_recycler =itemView.findViewById(R.id.ingredients_item_recycler);
        steps_item_recycler =itemView.findViewById(R.id.steps_item_recycler);


    }
}
