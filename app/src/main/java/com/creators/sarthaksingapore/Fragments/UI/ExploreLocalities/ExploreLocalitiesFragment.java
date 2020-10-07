package com.creators.sarthaksingapore.Fragments.UI.ExploreLocalities;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.creators.sarthaksingapore.Activities.PopUpClass;
import com.creators.sarthaksingapore.R;


public class ExploreLocalitiesFragment extends Fragment {

    Button btnSearch;
    public ExploreLocalitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =inflater.inflate(R.layout.activity_explore_localities, container, false);


        final PopUpClass popUpClass=new PopUpClass();

        btnSearch=view.findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popUpClass.showPopupWindow(view);
            }
        });
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