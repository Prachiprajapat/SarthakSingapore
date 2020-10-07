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
import com.creators.sarthaksingapore.ModelClasses.RecentProjectsModel;
import com.creators.sarthaksingapore.ModelClasses.RecentPropertiesModel;
import com.creators.sarthaksingapore.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HomeRecentProjectAdapter extends RecyclerView.Adapter<HomeRecentProjectAdapter.RecentProjectAdapter> {

    Context context;
    ArrayList<RecentProjectsModel>recentProjectsModels;

    public HomeRecentProjectAdapter(Context context, ArrayList<RecentProjectsModel> recentProjectsModels) {
        this.context = context;
        this.recentProjectsModels = recentProjectsModels;
    }


    @NonNull
    @Override
    public HomeRecentProjectAdapter.RecentProjectAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_propertise, parent, false);

        return new HomeRecentProjectAdapter.RecentProjectAdapter(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecentProjectAdapter.RecentProjectAdapter holder, int position) {
        RecentProjectsModel recentProjectsModel = recentProjectsModels.get(position);
        Picasso.with(context).load(recentProjectsModel.getPropertiesImage()).error(R.mipmap.ic_launcher).into(holder.iv_Propertyimage);
        holder.tv_property_offer.setText(recentProjectsModel.getPropertiesPrice());
        holder.tv_propertytype.setText(recentProjectsModel.getPropertiestype());
        holder.tv_property_time.setText(recentProjectsModel.getPropertiestime());
        holder.ll_propertyDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, PropertyDetailActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return recentProjectsModels.size();
    }

    public class RecentProjectAdapter extends RecyclerView.ViewHolder {

        TextView tv_urgentcallid, tv_property_offer, tv_propertytype, tv_property_time;
        ImageView iv_Propertyimage;
        LinearLayout ll_propertyDetail;

        public RecentProjectAdapter(@NonNull View itemView) {
            super(itemView);

            iv_Propertyimage = itemView.findViewById(R.id.iv_Propertyimage);
            tv_property_offer = itemView.findViewById(R.id.tv_property_offer);
            tv_propertytype = itemView.findViewById(R.id.tv_propertytype);
            tv_property_time = itemView.findViewById(R.id.tv_property_time);
            ll_propertyDetail= itemView.findViewById(R.id.ll_propertyDetail);
        }
    }
}
