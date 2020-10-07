package com.creators.sarthaksingapore.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.creators.sarthaksingapore.R;

public class ContactedFragment extends Fragment {

    Button btn_property,btn_agent;
    ImageView imageView;

    public ContactedFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.contactedfragment, container, false);
        btn_property = view.findViewById(R.id.btn_property);
        btn_agent = view.findViewById(R.id.btn_agent);
        imageView = view.findViewById(R.id.imageview);

        btn_agent.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                // Have to find why
                imageView.setImageResource(R.drawable.property2);
                btn_property.setBackgroundResource(R.drawable.button_background);
                btn_agent.setBackgroundResource(R.drawable.button_back);

                // is not working here
            }
        });
        btn_property.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                // Have to find why
                imageView.setImageResource(R.drawable.property1);
                btn_property.setBackgroundResource(R.drawable.button_back);
                btn_agent.setBackgroundResource(R.drawable.button_background);
                // is not working here
            }
        });
        return view;
    }
}
