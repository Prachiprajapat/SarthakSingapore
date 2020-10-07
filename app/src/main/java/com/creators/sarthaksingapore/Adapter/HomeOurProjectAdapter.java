package com.creators.sarthaksingapore.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.creators.sarthaksingapore.Activities.PropertyDetailActivity;
import com.creators.sarthaksingapore.ModelClasses.OurProjectsModel;
import com.creators.sarthaksingapore.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HomeOurProjectAdapter extends RecyclerView.Adapter<HomeOurProjectAdapter.OurProjectViewHolder> {
    Context context;
    ArrayList<OurProjectsModel>projectsModels;

    public HomeOurProjectAdapter(Context context, ArrayList<OurProjectsModel> projectsModels) {
        this.context = context;
        this.projectsModels = projectsModels;
    }
    @NonNull
    @Override
    public HomeOurProjectAdapter.OurProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_propertise, parent, false);

        return new HomeOurProjectAdapter.OurProjectViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeOurProjectAdapter.OurProjectViewHolder holder, int position) {
        OurProjectsModel ourProjectsModel = projectsModels.get(position);
        Picasso.with(context).load(ourProjectsModel.getPropertiesImage()).error(R.mipmap.ic_launcher).into(holder.iv_Propertyimage);
       holder.tv_property_offer.setText(ourProjectsModel.getPropertiesPrice());
       holder.tv_propertytype.setText(ourProjectsModel.getPropertiestype());
       holder.tv_property_time.setText(ourProjectsModel.getPropertiestime());
       holder.ll_propertyDetail.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               context.startActivity(new Intent(context, PropertyDetailActivity.class));
           }
       });

    }

    @Override
    public int getItemCount() {
        return projectsModels.size();
    }

    public class OurProjectViewHolder extends RecyclerView.ViewHolder {
        TextView tv_urgentcallid, tv_property_offer, tv_propertytype, tv_property_time;
        ImageView iv_Propertyimage;
        LinearLayout ll_propertyDetail;
        public OurProjectViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_Propertyimage = itemView.findViewById(R.id.iv_Propertyimage);
            tv_property_offer = itemView.findViewById(R.id.tv_property_offer);
            tv_propertytype = itemView.findViewById(R.id.tv_propertytype);
            tv_property_time = itemView.findViewById(R.id.tv_property_time);
            ll_propertyDetail= itemView.findViewById(R.id.ll_propertyDetail);
        }
    }
}
