package com.creators.sarthaksingapore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.creators.sarthaksingapore.ModelClasses.NotificationModel;
import com.creators.sarthaksingapore.R;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotViewHolder> {

    List<NotificationModel> notificationModelList;
    Context context;

    public NotificationAdapter(List<NotificationModel> notificationModelList, Context context) {
        this.notificationModelList = notificationModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public NotViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_notification_layout, parent, false);
        return new NotViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotViewHolder holder, int position) {

        NotificationModel notificationModel=notificationModelList.get(position);
        holder.txtTitle.setText(notificationModel.getTxtTitle());
        holder.txtTimeAgo.setText(notificationModel.getTxtTimeAgo());
        holder.txtDesc.setText(notificationModel.getTxtDesc());
        holder.imgLogo.setImageResource(notificationModel.getImage());
    }

    @Override
    public int getItemCount() {
        return notificationModelList.size();
    }

    public class NotViewHolder extends RecyclerView.ViewHolder{
        ImageView imgLogo;
        TextView txtTitle,txtDesc,txtTimeAgo;
        public NotViewHolder(@NonNull View itemView) {
            super(itemView);

            imgLogo=itemView.findViewById(R.id.img_logo);
            txtDesc=itemView.findViewById(R.id.tv_desc);
            txtTimeAgo=itemView.findViewById(R.id.tv_time_ago);
            txtTitle=itemView.findViewById(R.id.tv_title);


        }
    }
}
