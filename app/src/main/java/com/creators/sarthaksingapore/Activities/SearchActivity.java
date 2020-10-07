package com.creators.sarthaksingapore.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.creators.sarthaksingapore.Adapter.BHKAdapter;
import com.creators.sarthaksingapore.Adapter.PropertyTypeAdapter;
import com.creators.sarthaksingapore.ModelClasses.BHKModel;
import com.creators.sarthaksingapore.ModelClasses.PropertyTypeModel;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner sp_min,sp_max;
    LinearLayout lay_buy,lay_rent;
    RecyclerView recycle_property,recycle_budget;
    Activity activity;
    Context context;
    SeekBar seekBar;
    ArrayList<PropertyTypeModel> propertyTypeModels =  new ArrayList<>();
    PropertyTypeAdapter propertyTypeAdapter;
    TextView txtseekbar;
    ArrayList<BHKModel> bhkModels = new ArrayList<>();
    BHKAdapter bhkAdapter;
    LinearLayout lay_villa,lay_apart,lay_floor,lay_plot,lay_ongoing,lay_completed,lay_upcoming;

    String[] Min = { "Rs. Min", " Rs. 5 Lac",
            "Rs. 10 Lac", "Rs. 15 Lac",
            "Rs. 20 Lac", "Rs. 25 Lac","Rs. 30 Lac","Rs. 35 Lac","Rs. 50 Lac" };

    String[] Max = { "Rs. Max", " Rs. 10 Lac",
            "Rs. 20 Lac", "Rs. 30 Lac",
            "Rs. 40 Lac", "Rs. 50 Lac","Rs. 60 Lac","Rs. 80 Lac","Rs. 1Cr" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_search);

//
//        recycle_property = findViewById(R.id.rv_property_type);
//        recycle_budget = findViewById(R.id.recycle_budget);
        sp_max = findViewById(R.id.sp_max);
        sp_min = findViewById(R.id.sp_min);
        txtseekbar= findViewById(R.id.txtseekbar);
        lay_apart = findViewById(R.id.lay_appart);
        lay_plot = findViewById(R.id.lay_plot);
        lay_villa = findViewById(R.id.lay_villa);
        lay_floor = findViewById(R.id.layfloor);
        lay_ongoing  = findViewById(R.id.lay_ongoing);
        lay_completed  = findViewById(R.id.lay_completed);
        lay_upcoming  = findViewById(R.id.lay_upcoming);




        sp_max.setOnItemSelectedListener(this);
        sp_max.setOnItemSelectedListener(this);
        context = getApplicationContext();


        lay_completed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lay_completed.setBackgroundColor(getResources().getColor(R.color.orange));
                lay_upcoming.setBackgroundColor(getResources().getColor(R.color.white));
                lay_ongoing.setBackgroundColor(getResources().getColor(R.color.white));

            }
        });
        lay_upcoming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lay_completed.setBackgroundColor(getResources().getColor(R.color.white));
                lay_upcoming.setBackgroundColor(getResources().getColor(R.color.orange));
                lay_ongoing.setBackgroundColor(getResources().getColor(R.color.white));

            }
        });
        lay_ongoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lay_completed.setBackgroundColor(getResources().getColor(R.color.white));
                lay_upcoming.setBackgroundColor(getResources().getColor(R.color.white));
                lay_ongoing.setBackgroundColor(getResources().getColor(R.color.orange));

            }
        });


        lay_apart.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int check = 1;

                lay_apart.setBackgroundColor(getResources().getColor(R.color.orange));
                lay_villa.setBackgroundColor(getResources().getColor(R.color.white));
                lay_floor.setBackgroundColor(getResources().getColor(R.color.white));
                lay_plot.setBackgroundColor(getResources().getColor(R.color.white));


            }

        });


        lay_floor.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                int check = 1;

                lay_floor.setBackgroundColor(getResources().getColor(R.color.orange));
                lay_villa.setBackgroundColor(getResources().getColor(R.color.white));
                lay_apart.setBackgroundColor(getResources().getColor(R.color.white));
                lay_plot.setBackgroundColor(getResources().getColor(R.color.white));


            }

        });


        lay_plot.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                int check = 1;
                lay_plot.setBackgroundColor(getResources().getColor(R.color.orange));
                lay_villa.setBackgroundColor(getResources().getColor(R.color.white));
                lay_floor.setBackgroundColor(getResources().getColor(R.color.white));
                lay_apart.setBackgroundColor(getResources().getColor(R.color.white));


            }

        });


        lay_villa.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                int check = 1;
                lay_villa.setBackgroundColor(getResources().getColor(R.color.orange));
                lay_apart.setBackgroundColor(getResources().getColor(R.color.white));
                lay_floor.setBackgroundColor(getResources().getColor(R.color.white));
                lay_plot.setBackgroundColor(getResources().getColor(R.color.white));


            }

        });




        seekBar = findViewById(R.id.rangeSeekbar);

        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int progress = 0;

                    @Override
                    public void onProgressChanged(SeekBar seekBar,
                                                  int progressValue, boolean fromUser) {
                        progress = progressValue;
                       // Toast.makeText(getApplicationContext(), progress, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        // Display the value in textview
                        txtseekbar.setText(progress + "/" + seekBar.getMax());
                        Toast.makeText(getApplicationContext(), progress + "/" + seekBar.getMax(), Toast.LENGTH_SHORT).show();

                    }
                });





        //<------------------------------For Spinner recycler ------------------------------->


        ArrayAdapter ad = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, Min);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_min.setAdapter(ad);

        ArrayAdapter ad1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, Max);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_max.setAdapter(ad1);


        //<------------------------------For Property recycler ------------------------------->

//
//        propertyTypeAdapter = new PropertyTypeAdapter(propertyTypeModels,context);
//        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"Flat"));
//        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"House/Villa"));
//        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"Plot"));
//        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"Office Space"));
//        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"Shop/Showroom"));
//        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"Other Commercial"));
//
//        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(context);
//        gridLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
//        recycle_property.setLayoutManager(gridLayoutManager);
//        recycle_property.setHasFixedSize(true);
//        recycle_property.setAdapter(propertyTypeAdapter);
//
//        //<------------------------------For BHK recycler ------------------------------->
//
//        bhkAdapter = new BHKAdapter(bhkModels,context);
//        bhkModels.add(new BHKModel("1 BHK"));
//        bhkModels.add(new BHKModel("2 BHK"));
//        bhkModels.add(new BHKModel("3 BHK"));
//        bhkModels.add(new BHKModel("4 BHK"));
//        bhkModels.add(new BHKModel("5 BHK"));
//
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
//        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
//        recycle_budget.setLayoutManager(linearLayoutManager);
//        recycle_budget.setHasFixedSize(true);
//        recycle_budget.setAdapter(bhkAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(getApplicationContext(),
                Min[position],
                Toast.LENGTH_LONG)
                .show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}