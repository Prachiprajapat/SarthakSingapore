package com.creators.sarthaksingapore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.creators.sarthaksingapore.ModelClasses.SavedModel;
import com.creators.sarthaksingapore.R;

import org.w3c.dom.Text;

import java.util.List;

public class SavedAdapter extends RecyclerView.Adapter<SavedAdapter.SViewHolder> {
    Context context;
    List<SavedModel> savedModelList;

    public SavedAdapter(Context context, List<SavedModel> savedModelList) {
        this.context = context;
        this.savedModelList = savedModelList;
    }

    @NonNull
    @Override
    public SViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_saved, parent, false);

        return new SViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SViewHolder holder, int position) {

        SavedModel savedModel=savedModelList.get(position);
        holder.txtPropertyName.setText(savedModel.getName());
        holder.txtPrice.setText(savedModel.getPrice());
        holder.txtBhkFloor.setText(savedModel.getSize());
        holder.txtAddress.setText(savedModel.getAddress());
    }

    @Override
    public int getItemCount() {
        return savedModelList.size();
    }

    public class SViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView txtPrice,txtBhkFloor,txtPropertyName,txtAddress;

        public SViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imgProperty);
            txtAddress=itemView.findViewById(R.id.txtAddress);
            txtBhkFloor=itemView.findViewById(R.id.txtBhkFloor);
            txtPrice=itemView.findViewById(R.id.txtPrice);
            txtPropertyName=itemView.findViewById(R.id.txtPropertyName);

        }
    }
}
