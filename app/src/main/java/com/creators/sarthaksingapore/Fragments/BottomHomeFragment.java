package com.creators.sarthaksingapore.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.creators.sarthaksingapore.Activities.PropertyDetailActivity;
import com.creators.sarthaksingapore.Adapter.HomeOurProjectAdapter;
import com.creators.sarthaksingapore.Adapter.HomePropertyImageAdapter;
import com.creators.sarthaksingapore.Adapter.HomeRecentProjectAdapter;
import com.creators.sarthaksingapore.Fragments.UI.OurProjects.OurProjectFragment;
import com.creators.sarthaksingapore.ModelClasses.OurProjectsModel;
import com.creators.sarthaksingapore.ModelClasses.PropertyImageModel;
import com.creators.sarthaksingapore.ModelClasses.RecentProjectsModel;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;


public class BottomHomeFragment extends Fragment {

    Runnable runnable;
    Handler handler;

    public BottomHomeFragment() {
        // Required empty public constructor
    }

    RecyclerView Rv_Recentproject,rv_imageViewRecycle,Rv_ourproject;
TextView recent_projects_see_all,our_projects_see_all;

    ArrayList<RecentProjectsModel>recentProjectsModels=new ArrayList<>();
    ArrayList<OurProjectsModel>ourProjectsModels=new ArrayList<>();
    ArrayList<PropertyImageModel>propertyImageModels=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_bottom_home, container, false);
        Rv_Recentproject = view.findViewById(R.id.Rv_Recentproject);
        rv_imageViewRecycle = view.findViewById(R.id.rv_imageViewRecycle);
        Rv_ourproject = view.findViewById(R.id.Rv_ourproject);
        recent_projects_see_all = view.findViewById(R.id.recent_projects_see_all);
        our_projects_see_all = view.findViewById(R.id.our_projects_see_all);

        recentProjectsModels=new ArrayList<>();
        recentProjectsModels.add(new RecentProjectsModel(R.drawable.britishparkimg,"150000","1 BHL Flat","Mangalia Railway Station, A.B Road,indore","Immediate"));
        recentProjectsModels.add(new RecentProjectsModel(R.drawable.greenview,"130000","2 BHL Flat","Super Corridor 1.5 km from TCS building, indore","Immediate"));
        recentProjectsModels.add(new RecentProjectsModel(R.drawable.premiumimg,"180000","5 BHL Flat","Talawali Chanda, Indore, Madhya","Immediate"));
        recentProjectsModels.add(new RecentProjectsModel(R.drawable.singaporelifestyle,"220000","5 BHL Flat","Super Corridor Road, Bada Bangarda,indore","Immediate"));
        recentProjectsModels.add(new RecentProjectsModel(R.drawable.sarthaklakeview,"250000","5 BHL Flat","Sarthak Singapore Group, Dewas Naka, Indore","Immediate"));
        recentProjectsModels.add(new RecentProjectsModel(R.drawable.singaporepalm,"230000","5 BHL Flat","Talawali Chanda, Indore, Madhya","Immediate"));
        HomeRecentProjectAdapter homePropertiseAdapter =new HomeRecentProjectAdapter(getContext(),recentProjectsModels);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        Rv_Recentproject.setLayoutManager(layoutManager);
        Rv_Recentproject.setItemAnimator(new DefaultItemAnimator());
        Rv_Recentproject.setAdapter(homePropertiseAdapter);

        recent_projects_see_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OurProjectFragment someFragment = new OurProjectFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();


               // startActivity(new Intent(getContext(), PropertyDetailActivity.class));
            }
        }); our_projects_see_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), PropertyDetailActivity.class));
            }
        });


        ourProjectsModels=new ArrayList<>();
        ourProjectsModels.add(new OurProjectsModel(R.drawable.sarthakgoldcity,"13000","1 BHL Flat","Super Corridor Road, Bada Bangarda,indore","Immediate"));
        ourProjectsModels.add(new OurProjectsModel(R.drawable.sarthakindore,"13000","1 BHL Flat","Mangalia Railway Station, A.B Road,indore","Immediate"));
        ourProjectsModels.add(new OurProjectsModel(R.drawable.premiumimg,"13000","1 BHL Flat","Talawali Chanda, Indore, Madhya","Immediate"));
        ourProjectsModels.add(new OurProjectsModel(R.drawable.sarthaklakeview,"13000","1 BHL Flat","Talawali Chanda, Indore, Madhya","Immediate"));
        ourProjectsModels.add(new OurProjectsModel(R.drawable.singaporeprojects,"13000","1 BHL Flat","Mangalia Railway Station, A.B Road,indore","Immediate"));
        HomeOurProjectAdapter homeOurProjectAdapter =new HomeOurProjectAdapter(getContext(),ourProjectsModels);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        Rv_ourproject.setLayoutManager(layoutManager1);
        Rv_ourproject.setItemAnimator(new DefaultItemAnimator());
        Rv_ourproject.setAdapter(homeOurProjectAdapter);



        propertyImageModels=new ArrayList<>();
        propertyImageModels.add(new PropertyImageModel(R.drawable.sarthakallproject));
        propertyImageModels.add(new PropertyImageModel(R.drawable.sarthakgoldcity));
        propertyImageModels.add(new PropertyImageModel(R.drawable.singaporeprojects));
        propertyImageModels.add(new PropertyImageModel(R.drawable.sarthakindore));
        propertyImageModels.add(new PropertyImageModel(R.drawable.indorepropertt));
        propertyImageModels.add(new PropertyImageModel(R.drawable.sarthakmainbg));
        propertyImageModels.add(new PropertyImageModel(R.drawable.propertynight));

        HomePropertyImageAdapter homePropertiseimageAdapter =new HomePropertyImageAdapter(getContext(),propertyImageModels);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rv_imageViewRecycle.setLayoutManager(layoutManager2);
        rv_imageViewRecycle.setItemAnimator(new DefaultItemAnimator());
        rv_imageViewRecycle.setAdapter(homePropertiseimageAdapter);

        autoScroll();

        rv_imageViewRecycle.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {

                switch (newState) {

                    case RecyclerView.SCROLL_STATE_IDLE:

                        float targetBottomPosition1 = rv_imageViewRecycle.getX();
                        float targetBottomPosition2 = rv_imageViewRecycle.getX() + rv_imageViewRecycle.getWidth();

                        Log.e("", "targetBottomPosition1 = " + targetBottomPosition1);
                        Log.e("", "targetBottomPosition2 = " + targetBottomPosition2);

                        View v1 = rv_imageViewRecycle.findChildViewUnder(targetBottomPosition1, 0);
                        View v2 = rv_imageViewRecycle.findChildViewUnder(targetBottomPosition2, 0);

                        float x1 = targetBottomPosition1;
                        if (v1 != null) {
                            x1 = v1.getX();
                        }

                        float x2 = targetBottomPosition2;
                        if (v2 != null) {
                            x2 = v2.getX();
                        }


                        Log.i("", "x1 = " + x1);
                        Log.i("", "x2 = " + x2);

                        float dx1 = Math.abs(rv_imageViewRecycle.getX() - x1);
                        float dx2 = Math.abs(rv_imageViewRecycle.getX() + rv_imageViewRecycle.getWidth() - x2);


                        Log.e("", "dx1 = " + dx1);
                        Log.e("", "dx2 = " + dx2);

                        float visiblePortionOfItem1 = 0;
                        float visiblePortionOfItem2 = 0;

                        if (x1 < 0 && v1 != null) {
                            visiblePortionOfItem1 = v1.getWidth() - dx1;
                        }

                        if (v2 != null) {
                            visiblePortionOfItem2 = v2.getWidth() - dx2;
                        }

                        Log.e("", "visiblePortionOfItem1 = " + visiblePortionOfItem1);
                        Log.e("", "visiblePortionOfItem2 = " + visiblePortionOfItem2);

                        int position = 0;
                        if (visiblePortionOfItem1 >= visiblePortionOfItem2) {
                            position = rv_imageViewRecycle.getChildAdapterPosition(rv_imageViewRecycle.findChildViewUnder(targetBottomPosition1, 0));
                        } else {

                            position = rv_imageViewRecycle.getChildAdapterPosition(rv_imageViewRecycle.findChildViewUnder(targetBottomPosition2, 0));
                        }
                        rv_imageViewRecycle.scrollToPosition(position);

                        break;

                    case RecyclerView.SCROLL_STATE_DRAGGING:

                        break;

                    case RecyclerView.SCROLL_STATE_SETTLING:

                        break;

                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            }
        });

        return  view;
    }

    private void autoScroll() {
        final int speedScroll = 2000;
        handler = new Handler();
        runnable = new Runnable() {
            int count = -1;
            @Override
            public void run() {
                Log.d("home","coutn "+rv_imageViewRecycle.getAdapter().getItemCount());
                if (count < rv_imageViewRecycle.getAdapter().getItemCount()) {
                    rv_imageViewRecycle.smoothScrollToPosition(++count);
                    Log.d("recycl","coutn "+count);
                    handler.postDelayed(this, speedScroll);
                    Log.d("inne","coutn "+rv_imageViewRecycle.getAdapter().getItemCount());
                }
                else if(rv_imageViewRecycle.getAdapter().getItemCount()==count){
                    rv_imageViewRecycle.smoothScrollToPosition(0);
                    count=-1;
                    handler.postDelayed(this, speedScroll);
                }
            }
        };

        handler.post(runnable);
    }



    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }

}