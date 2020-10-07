package com.creators.sarthaksingapore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.creators.sarthaksingapore.ModelClasses.OurProjectModel;
import com.creators.sarthaksingapore.R;

import java.util.List;

public class OurProjectAdapter extends RecyclerView.Adapter<OurProjectAdapter.ViewHolder> {
    Context context;
    List<OurProjectModel> ourProjectModels;


    public OurProjectAdapter(Context context, List<OurProjectModel> ourProjectModels) {
        this.context = context;
        this.ourProjectModels = ourProjectModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.our_project_customlay,parent,false);
        ViewHolder seeproject=new ViewHolder(view);
        return  seeproject;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        OurProjectModel ourProjectModel = ourProjectModels.get(position);
        holder.name.setText(ourProjectModel.getName());
        holder.location_address.setText(ourProjectModel.getAddress());
        holder.bhk.setText(ourProjectModel.getBhk());
    }

    @Override
    public int getItemCount() {
        return ourProjectModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,location_address,bhk;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.firstname);
            location_address = itemView.findViewById(R.id.location_address);
            bhk = itemView.findViewById(R.id.bhk);
        }
    }
}
