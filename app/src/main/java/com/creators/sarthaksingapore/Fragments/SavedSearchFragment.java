package com.creators.sarthaksingapore.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.creators.sarthaksingapore.R;

public class SavedSearchFragment extends Fragment {

    public SavedSearchFragment() {
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.savedsearch_fragment, container, false);
        return view;
    }
}
