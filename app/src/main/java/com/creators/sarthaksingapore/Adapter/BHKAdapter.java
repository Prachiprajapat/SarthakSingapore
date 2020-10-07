package com.creators.sarthaksingapore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.creators.sarthaksingapore.ModelClasses.BHKModel;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;

public class BHKAdapter extends RecyclerView.Adapter<BHKAdapter.ViewHolder> {

    ArrayList<BHKModel> bhkModels ;
    Context context;

    public BHKAdapter(ArrayList<BHKModel> bhkModels, Context context) {
        this.bhkModels = bhkModels;
        this.context = context;
    }

    @NonNull
    @Override


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.bhkadapter,parent,false);
        ViewHolder seeproject=new ViewHolder(view);
        return  seeproject;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txt_name.setText(bhkModels.get(0).getText());

    }

    @Override
    public int getItemCount() {
        return bhkModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_name = itemView.findViewById(R.id.txt_name);
        }
    }
}
