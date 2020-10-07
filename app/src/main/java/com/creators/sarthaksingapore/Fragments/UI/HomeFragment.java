package com.creators.sarthaksingapore.Fragments.UI;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.creators.sarthaksingapore.Activities.AllPropertiesActivity;
import com.creators.sarthaksingapore.Activities.SearchActivity;
import com.creators.sarthaksingapore.Fragments.BottomAlertFragment;
import com.creators.sarthaksingapore.Fragments.BottomHomeFragment;
import com.creators.sarthaksingapore.Fragments.BottomProfileFragment;
import com.creators.sarthaksingapore.Fragments.BottomSavedFragment;
import com.creators.sarthaksingapore.Fragments.BottomSearchFragment;
import com.creators.sarthaksingapore.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeFragment extends Fragment {
    BottomNavigationView bottomNavigationView;
    private HomeViewModel homeViewModel;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // ((AppCompatActivity) getActivity()).getSupportActionBar();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content, new BottomHomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentTransaction.replace(R.id.content, new BottomHomeFragment()).commit();
                    ((AppCompatActivity) getActivity()).getSupportActionBar().show();
                    // getActivity().onBackPressed();

                    return true;
                case R.id.navigation_dashboard:
                    startActivity(new Intent(getContext(), SearchActivity.class));
                   /* fragmentTransaction.replace(R.id.content, new BottomSearchFragment()).commit();
                    ((AppCompatActivity) getActivity()).getSupportActionBar().hide();*/
                    //   getActivity().onBackPressed();

                    return true;

                case R.id.navigation_offer:
                    fragmentTransaction.replace(R.id.content, new BottomSavedFragment()).commit();
                    ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
                    //   getActivity().onBackPressed();

                    return true;
                case R.id.navigation_setting:
                    fragmentTransaction.replace(R.id.content, new BottomProfileFragment()).commit();
                    ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
                    //   getActivity().onBackPressed();

                    return true;

                case R.id.navigation_Profile:
                    fragmentTransaction.replace(R.id.content, new BottomAlertFragment()).commit();
                    ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
                    //   getActivity().onBackPressed();

                    return true;

            }
            return false;
        }

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        BottomNavigationView navigation = (BottomNavigationView) view.findViewById(R.id.bottom_navigation);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        return view;

    }
}