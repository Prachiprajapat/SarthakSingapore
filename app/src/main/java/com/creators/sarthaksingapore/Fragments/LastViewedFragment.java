package com.creators.sarthaksingapore.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.creators.sarthaksingapore.Adapter.SavedAdapter;

import com.creators.sarthaksingapore.ModelClasses.SavedModel;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;

public class LastViewedFragment extends Fragment {
    Button btn_property,btn_agent,btn_project;
    ImageView imageView;
    RecyclerView recyclerView;
    ArrayList<SavedModel> savedModelArrayList;

    public LastViewedFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.lastviewed_fragment, container, false);

        btn_property = view.findViewById(R.id.btn_property);
        btn_agent = view.findViewById(R.id.btn_agent);
        imageView = view.findViewById(R.id.imageview);
        btn_project= view.findViewById(R.id.btn_project);
        recyclerView=view.findViewById(R.id.recycle);

        savedModelArrayList=new ArrayList<>();

        btn_agent.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
             //   imageView.setImageResource(R.drawable.property2);
                btn_property.setBackgroundResource(R.drawable.button_background);
                btn_agent.setBackgroundResource(R.drawable.button_back);
                btn_project.setBackgroundResource(R.drawable.button_background);

                // is not working here
            }
        });
        btn_property.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                savedModelArrayList.add(new SavedModel("70.0 Lac","3 BHK Builder Floor Apartment","Shri Balaji Floors","Uttam Nagar, New Delhi 589.6...",R.drawable.property1));
                savedModelArrayList.add(new SavedModel("70.0 Lac","3 BHK Builder Floor Apartment","Shri Balaji Floors","Uttam Nagar, New Delhi 589.6...",R.drawable.property1));
                savedModelArrayList.add(new SavedModel("70.0 Lac","3 BHK Builder Floor Apartment","Shri Balaji Floors","Uttam Nagar, New Delhi 589.6...",R.drawable.property1));

                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                SavedAdapter savedAdapter=new SavedAdapter(getActivity(),savedModelArrayList);
                recyclerView.setAdapter(savedAdapter);

                // Have to find why
               // imageView.setImageResource(R.drawable.property1);
                btn_property.setBackgroundResource(R.drawable.button_back);
                btn_agent.setBackgroundResource(R.drawable.button_background);
                btn_project.setBackgroundResource(R.drawable.button_background);
                // is not working here
            }
        });

        btn_project.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                // Have to find why
              //  imageView.setImageResource(R.drawable.property1);
                btn_property.setBackgroundResource(R.drawable.button_background);
                btn_agent.setBackgroundResource(R.drawable.button_background);
                btn_project.setBackgroundResource(R.drawable.button_back);
                // is not working here
            }
        });
        return view;
    }
}
