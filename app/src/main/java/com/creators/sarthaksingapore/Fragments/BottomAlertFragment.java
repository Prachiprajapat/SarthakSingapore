package com.creators.sarthaksingapore.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.creators.sarthaksingapore.Activities.SettingActivity;
import com.creators.sarthaksingapore.Adapter.NotificationAdapter;

import com.creators.sarthaksingapore.ModelClasses.NotificationModel;
import com.creators.sarthaksingapore.R;


import java.util.ArrayList;

public class BottomAlertFragment extends Fragment {

    ArrayList<NotificationModel> notificationModelArrayList;
    RecyclerView recyclerView;
    Toolbar toolbar;
    ImageView imgSetting;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_bottom_alert, container, false);
        recyclerView=view.findViewById(R.id.recycle_notification);
        toolbar=view.findViewById(R.id.toolbar);
        imgSetting=view.findViewById(R.id.img_setting);

        imgSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), SettingActivity.class);
                startActivity(intent);
            }
        });
        notificationModelArrayList=new ArrayList<>();
        notificationModelArrayList.add(new NotificationModel("This Residential House is","Connect with the Owner before othr buyers do for this property in","16 hours ago",R.drawable.sarthaksingaporelogo));
        notificationModelArrayList.add(new NotificationModel("This Residential House is","Connect with the Owner before othr buyers do for this property in","16 hours ago",R.drawable.sarthaksingaporelogo));
        notificationModelArrayList.add(new NotificationModel("This Residential House is","Connect with the Owner before othr buyers do for this property in","16 hours ago",R.drawable.sarthaksingaporelogo));

        NotificationAdapter notificationAdapter=new NotificationAdapter(notificationModelArrayList,getContext());
       recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(notificationAdapter);
        return view;
    }
}