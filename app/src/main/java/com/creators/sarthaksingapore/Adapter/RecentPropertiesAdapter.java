package com.creators.sarthaksingapore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.creators.sarthaksingapore.Fragments.BottomHomeFragment;
import com.creators.sarthaksingapore.ModelClasses.RecentPropertiesModel;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;

public class RecentPropertiesAdapter extends RecyclerView.Adapter<RecentPropertiesAdapter.RecentViewHolder> {

    Context context;
  ArrayList<RecentPropertiesModel>recentPropertiesModels;

    public RecentPropertiesAdapter(Context context, ArrayList<RecentPropertiesModel> recentPropertiesModels) {
        this.context = context;
        this.recentPropertiesModels = recentPropertiesModels;
    }
    @NonNull
    @Override
    public RecentPropertiesAdapter.RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recent_propertieslist, parent, false);

        return new RecentPropertiesAdapter.RecentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentPropertiesAdapter.RecentViewHolder holder, int position) {
       RecentPropertiesModel recentPropertiesModel = recentPropertiesModels.get(position);
       holder.tv_property_price.setText(recentPropertiesModel.getProperty_price());
       holder.tv_property_type.setText(recentPropertiesModel.getProperty_type());
       holder.tv_property_size.setText(recentPropertiesModel.getProperty_size());
       holder.tv_property_status.setText(recentPropertiesModel.getProperty_status());
       holder.tv_property_address.setText(recentPropertiesModel.getProperty_adress());
       holder.tv_property_quality.setText(recentPropertiesModel.getProperty_quality());
       holder.ll_save_image.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(context, "clicked Save", Toast.LENGTH_SHORT).show();
           }
       });

       holder.ll_callownerid.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(context, "clicked call Owner", Toast.LENGTH_SHORT).show();

           }
       });

       holder.ll_get_phoneid.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(context, "clicked get phone", Toast.LENGTH_SHORT).show();

           }
       });
    }

    @Override
    public int getItemCount() {
        return recentPropertiesModels.size();
    }

    public class RecentViewHolder extends RecyclerView.ViewHolder {

        ImageView  iv_property_image;
        TextView tv_property_price,tv_property_status,tv_property_type,tv_property_size,tv_property_address,tv_property_quality;
        LinearLayout ll_save_image,ll_get_phoneid,ll_callownerid ;
        public RecentViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_property_image = itemView.findViewById(R.id.iv_property_image);
            tv_property_price = itemView.findViewById(R.id.tv_property_price);
            tv_property_status = itemView.findViewById(R.id.tv_property_status);
            tv_property_type = itemView.findViewById(R.id.tv_property_type);
            tv_property_size = itemView.findViewById(R.id.tv_property_size);
            tv_property_address = itemView.findViewById(R.id.tv_property_address);
            tv_property_quality = itemView.findViewById(R.id.tv_property_quality);
            ll_save_image = itemView.findViewById(R.id.ll_save_image);
            ll_get_phoneid = itemView.findViewById(R.id.ll_get_phoneid);
            ll_callownerid = itemView.findViewById(R.id.ll_callownerid);
        }
    }
}
