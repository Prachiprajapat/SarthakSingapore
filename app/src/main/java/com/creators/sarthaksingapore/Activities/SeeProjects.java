package com.creators.sarthaksingapore.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;


import com.creators.sarthaksingapore.Adapter.SeeProjectAdapter;
import com.creators.sarthaksingapore.ModelClasses.SeeProjectModel;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;

public class SeeProjects extends AppCompatActivity {

   ArrayList<SeeProjectModel> seeProjectModels = new ArrayList<>();
    RecyclerView recyclerView;
    SeeProjectAdapter seeProjectAdapter;
    Context context;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_projects);

        context = this;
        activity = this;

         recyclerView = findViewById(R.id .recyclerview);


        seeProjectAdapter =new SeeProjectAdapter( seeProjectModels,context);
        seeProjectModels.add(new SeeProjectModel("1.10 Cr","2BHK","Vasant Oasis","Andheri East Mumbai By Creatos","Ready To Move",R.drawable.property1));
        seeProjectModels.add(new SeeProjectModel("1.15 Cr","2BHK","Vasant Oasis","Andheri East Mumbai By Creatos","Ready To Move",R.drawable.property1));
        seeProjectModels.add(new SeeProjectModel("1.16 Cr","2BHK","Vasant Oasis","Andheri East Mumbai By Creatos","Ready To Move",R.drawable.property2));
        seeProjectModels.add(new SeeProjectModel("1.10 Cr","2BHK","Vasant Oasis","Andheri East Mumbai By Creatos","Ready To Move",R.drawable.property2));
        seeProjectModels.add(new SeeProjectModel("1.10 Cr","2BHK","Vasant Oasis","Andheri East Mumbai By Creatos","Ready To Move",R.drawable.property1));
        seeProjectModels.add(new SeeProjectModel("1.10 Cr","2BHK","Vasant Oasis","Andheri East Mumbai By Creatos","Ready To Move",R.drawable.property2));
        seeProjectModels.add(new SeeProjectModel("1.10 Cr","2BHK","Vasant Oasis","Andheri East Mumbai By Creatos","Ready To Move",R.drawable.property1));
        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(SeeProjects.this);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(seeProjectAdapter);
    }


}