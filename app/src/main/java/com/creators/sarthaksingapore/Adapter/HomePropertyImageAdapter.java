package com.creators.sarthaksingapore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.creators.sarthaksingapore.ModelClasses.PropertyImageModel;
import com.creators.sarthaksingapore.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HomePropertyImageAdapter extends RecyclerView.Adapter<HomePropertyImageAdapter.PropertyImageViewHolder> {


    Context context;
    ArrayList<PropertyImageModel> propertyImageModels;

    public HomePropertyImageAdapter(Context context, ArrayList<PropertyImageModel> propertyImageModels) {
        this.context = context;
        this.propertyImageModels = propertyImageModels;
    }

    @NonNull
    @Override
    public PropertyImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.imageslayout, parent, false);
        return new HomePropertyImageAdapter.PropertyImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyImageViewHolder holder, int position) {
        PropertyImageModel propertyImageModel = propertyImageModels.get(position);
        Picasso.with(context).load(propertyImageModel.getPropertyImage()).error(R.mipmap.ic_launcher).into(holder.imageid);

    }

    @Override
    public int getItemCount() {
        return propertyImageModels.size();
    }

    public class PropertyImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageid;
        public PropertyImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageid = itemView.findViewById(R.id.imageid);
        }
    }
}
