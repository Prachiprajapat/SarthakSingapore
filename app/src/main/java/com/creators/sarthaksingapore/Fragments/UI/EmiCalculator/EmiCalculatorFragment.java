package com.creators.sarthaksingapore.Fragments.UI.EmiCalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.creators.sarthaksingapore.HomeActivity;
import com.creators.sarthaksingapore.R;

public class EmiCalculatorFragment extends Fragment {



    public EmiCalculatorFragment(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.emicalculatefragment, container, false);

        return view;
    }
    }
