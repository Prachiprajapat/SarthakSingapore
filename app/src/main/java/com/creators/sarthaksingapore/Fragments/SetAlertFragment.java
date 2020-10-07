package com.creators.sarthaksingapore.Fragments;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.creators.sarthaksingapore.Adapter.BHKAdapter;
import com.creators.sarthaksingapore.Adapter.PropertyTypeAdapter;


import com.creators.sarthaksingapore.ModelClasses.BHKModel;
import com.creators.sarthaksingapore.ModelClasses.PropertyTypeModel;
import com.creators.sarthaksingapore.R;


import java.util.ArrayList;
import java.util.Locale;

public class SetAlertFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    Spinner sp_min,sp_max;
    LinearLayout lay_buy,lay_rent;
    RecyclerView recycle_property,recycle_budget;
    Activity activity;
    Context context;
    ArrayList<PropertyTypeModel>  propertyTypeModels =  new ArrayList<>();
    PropertyTypeAdapter propertyTypeAdapter;

    ArrayList<BHKModel> bhkModels = new ArrayList<>();
    BHKAdapter bhkAdapter;

    String[] Min = { "Rs. Min", " Rs. 5 Lac",
            "Rs. 10 Lac", "Rs. 15 Lac",
            "Rs. 20 Lac", "Rs. 25 Lac","Rs. 30 Lac","Rs. 35 Lac","Rs. 50 Lac" };

    String[] Max = { "Rs. Max", " Rs. 10 Lac",
            "Rs. 20 Lac", "Rs. 30 Lac",
            "Rs. 40 Lac", "Rs. 50 Lac","Rs. 60 Lac","Rs. 80 Lac","Rs. 1Cr" };


    public SetAlertFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.setalertfragment, container, false);

        recycle_property = view.findViewById(R.id.recycle_property);
        recycle_budget = view.findViewById(R.id.recycle_budget);
        sp_max = view.findViewById(R.id.sp_max);
        sp_min = view.findViewById(R.id.sp_min);
        lay_buy = view.findViewById(R.id.lay_buy);
        lay_rent = view.findViewById(R.id.lay_rent);

        sp_max.setOnItemSelectedListener(this);
        sp_max.setOnItemSelectedListener(this);
        context = getContext();
        activity = getActivity();

        lay_rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Click", Toast.LENGTH_LONG).show();
            }
        });


        //<------------------------------For Spinner recycler ------------------------------->


        ArrayAdapter ad = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, Min);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_min.setAdapter(ad);

        ArrayAdapter ad1 = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, Max);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_max.setAdapter(ad1);


        //<------------------------------For Property recycler ------------------------------->


        propertyTypeAdapter = new PropertyTypeAdapter(propertyTypeModels,context);
        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"Flat"));
        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"House/Villa"));
        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"Plot"));
        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"Office Space"));
        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"Shop/Showroom"));
        propertyTypeModels.add(new PropertyTypeModel(R.drawable.property1,"Other Commercial"));

        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(context);
        gridLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recycle_property.setLayoutManager(gridLayoutManager);
        recycle_property.setHasFixedSize(true);
        recycle_property.setAdapter(propertyTypeAdapter);

          //<------------------------------For BHK recycler ------------------------------->

        bhkAdapter = new BHKAdapter(bhkModels,context);
         bhkModels.add(new BHKModel("1 BHK"));
         bhkModels.add(new BHKModel("2 BHK"));
         bhkModels.add(new BHKModel("3 BHK"));
         bhkModels.add(new BHKModel("4 BHK"));
         bhkModels.add(new BHKModel("5 BHK"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recycle_budget.setLayoutManager(linearLayoutManager);
        recycle_budget.setHasFixedSize(true);
        recycle_budget.setAdapter(bhkAdapter);

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getContext(),
                Min[position],
                Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

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
