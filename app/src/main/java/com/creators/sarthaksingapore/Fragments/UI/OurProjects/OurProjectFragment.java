package com.creators.sarthaksingapore.Fragments.UI.OurProjects;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.creators.sarthaksingapore.Adapter.BHKAdapter;

import com.creators.sarthaksingapore.Adapter.OurProjectAdapter;
import com.creators.sarthaksingapore.ModelClasses.BHKModel;

import com.creators.sarthaksingapore.ModelClasses.OurProjectModel;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;

public class OurProjectFragment extends Fragment {
    RecyclerView recyclerourproject;
    OurProjectAdapter ourProjectAdapter;
    ArrayList<OurProjectModel> ourProjectModels = new ArrayList<>();
    Context context;

    public OurProjectFragment(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.ourprojectfrag, container, false);
        recyclerourproject = view.findViewById(R.id.ourprojectrecycle) ;
        context = getContext();

        ourProjectAdapter = new OurProjectAdapter(context,ourProjectModels);
        ourProjectModels.add(new OurProjectModel("Sarthak Singapore","Indore(M.P)","1 BHK",R.drawable.property1));
        ourProjectModels.add(new OurProjectModel("Sarthak Singapore","Indore(M.P)","1 BHK",R.drawable.property2));
        ourProjectModels.add(new OurProjectModel("Sarthak Singapore","Indore(M.P)","1 BHK",R.drawable.property1));
        ourProjectModels.add(new OurProjectModel("Sarthak Singapore","Indore(M.P)","1 BHK",R.drawable.property2));
        ourProjectModels.add(new OurProjectModel("Sarthak Singapore","Indore(M.P)","1 BHK",R.drawable.property1));
        ourProjectModels.add(new OurProjectModel("Sarthak Singapore","Indore(M.P)","1 BHK",R.drawable.property2));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerourproject.setLayoutManager(linearLayoutManager);
        recyclerourproject.setHasFixedSize(true);
        recyclerourproject.setAdapter(ourProjectAdapter);

        return view;
    }



    }
