package com.creators.sarthaksingapore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.creators.sarthaksingapore.ModelClasses.SeeProjectModel;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;

public class SeeProjectAdapter extends RecyclerView.Adapter<SeeProjectAdapter.ViewHolder> {

    ArrayList<SeeProjectModel> seeProjectModels;
    Context context;

    public SeeProjectAdapter(ArrayList<SeeProjectModel> seeProjectModels, Context context) {
        this.seeProjectModels = seeProjectModels;
        this.context = context;
    }

    @NonNull
    @Override


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.seeproject_custom,parent,false);
        ViewHolder seeproject=new ViewHolder(view);
        return  seeproject;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        holder.tv_name.setText(seeProjectModels.get(0).getName());
        holder.tv_price.setText("Rs."+seeProjectModels.get(0).getPrice());
        holder.tv_status.setText("Status:"+seeProjectModels.get(0).getStatus());
        holder.tv_addres.setText(seeProjectModels.get(0).getAddress());
        holder.tv_bhk.setText(seeProjectModels.get(0).getBhk());

        holder.et_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.layoutmore.setVisibility(View.VISIBLE);
                holder.et_less.setVisibility(View.VISIBLE);
                holder.et_all.setVisibility(View.GONE);
            }
        });

        holder.et_less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.layoutless.setVisibility(View.VISIBLE);
                holder.layoutmore.setVisibility(View.GONE);
                holder.et_all.setVisibility(View.VISIBLE);
                holder.et_less.setVisibility(View.GONE);
            }
        });
      //  holder.imageView.setImageResource(seeProjectModels.get(0).getImage());
       // holder.imageView.setImageResource(R.drawable.property1);

    }

    @Override
    public int getItemCount() {
        return seeProjectModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name,tv_addres,tv_status,tv_bhk,tv_price;
        ImageView imageView;
        LinearLayout layoutless,layoutmore;
        TextView et_less,et_all;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_addres = itemView.findViewById(R.id.tv_address);
            tv_bhk = itemView.findViewById(R.id.tv_bhk);
            tv_status = itemView.findViewById(R.id.tv_status);
            tv_price = itemView.findViewById(R.id.tv_price);
            imageView = itemView.findViewById(R.id.imageview);
            layoutless = itemView.findViewById(R.id.layoutless);
            layoutmore = itemView.findViewById(R.id.layoutmore);
            et_less = itemView.findViewById(R.id.et_less);
            et_all = itemView.findViewById(R.id.et_all);
        }
    }
}
