package com.creators.sarthaksingapore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.creators.sarthaksingapore.ModelClasses.PropertyTypeModel;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;

public class PropertyTypeAdapter extends RecyclerView.Adapter<PropertyTypeAdapter.ViewHolder>{

    ArrayList<PropertyTypeModel> propertyTypeModels ;
    Context context;


    public PropertyTypeAdapter(ArrayList<PropertyTypeModel> propertyTypeModels, Context context) {
        this.propertyTypeModels = propertyTypeModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.propertyadapterxml,parent,false);
        ViewHolder seeproject=new ViewHolder(view);
        return  seeproject;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txt_name.setText(propertyTypeModels.get(0).getName());


    }

    @Override
    public int getItemCount() {
        return propertyTypeModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imag1;
        TextView txt_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imag1 = itemView.findViewById(R.id.img1);
            txt_name = itemView.findViewById(R.id.txt_name);
        }
    }
}
