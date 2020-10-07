package com.creators.sarthaksingapore.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.creators.sarthaksingapore.Adapter.PageAdapter;
import com.creators.sarthaksingapore.HomeActivity;
import com.creators.sarthaksingapore.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class BottomSavedFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1,tab2,tab3,tab4,tab5;
    PagerAdapter pageAdapter;
    Toolbar toolbar;
    ImageView iv_back;


    public BottomSavedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom_saved, container, false);



        tab2 = view.findViewById(R.id.Shortlist);
        tab3 = view.findViewById(R.id.Last);
        tab4 = view.findViewById(R.id.Saved);





        tabLayout = view.findViewById(R.id.tablayout);
        viewPager = view.findViewById(R.id.pager_product);


        pageAdapter = new PageAdapter(getChildFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        /*iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getContext().startActivity(new Intent(getContext(),HomeActivity.class));
            }
        });*/
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));






        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }



}