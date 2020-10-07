package com.creators.sarthaksingapore.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.creators.sarthaksingapore.Adapter.RecentPropertiesAdapter;
import com.creators.sarthaksingapore.ModelClasses.RecentPropertiesModel;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;

public class AllPropertiesActivity extends AppCompatActivity {
    RecyclerView rv_recents;
    ImageView backimg;
    ArrayList<RecentPropertiesModel>recentPropertiesModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_properties);
        rv_recents = findViewById(R.id.rv_recents);
        backimg = findViewById(R.id.backimg);
        backimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        recentPropertiesModels=new ArrayList<>();
        recentPropertiesModels.add(new RecentPropertiesModel(R.drawable.sarthak,"20,000","Rent","1 BHK Flat","Andheri East,Mumbai","1 Bath furnished","1000 sqft"));
        recentPropertiesModels.add(new RecentPropertiesModel(R.drawable.sarthak,"40,000","Sold","2 BHK Flat","Andheri West,Mumbai","2 Bath unfurnished","900 sqft"));
        recentPropertiesModels.add(new RecentPropertiesModel(R.drawable.sarthak,"20,000","Rent","1 Room","Andheri Guegoan,Mumbai","no Bath, furnished","2000 sqft"));
        recentPropertiesModels.add(new RecentPropertiesModel(R.drawable.sarthak,"20,000","Rent","1 BHK Flat","Andheri West,Mumbai","3 Bath furnished","200 sqft"));


        RecentPropertiesAdapter propertiesAdapter = new RecentPropertiesAdapter(AllPropertiesActivity.this,recentPropertiesModels);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(AllPropertiesActivity.this,LinearLayoutManager.VERTICAL,false);
        rv_recents.setLayoutManager(layoutManager);
        rv_recents.setItemAnimator(new DefaultItemAnimator());
        rv_recents.setAdapter(propertiesAdapter);

    }
}