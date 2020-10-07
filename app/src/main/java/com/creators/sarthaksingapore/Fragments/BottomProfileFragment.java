package com.creators.sarthaksingapore.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.creators.sarthaksingapore.Activities.MyRecquirments;

import com.creators.sarthaksingapore.R;


public class BottomProfileFragment extends Fragment {

    ImageView img_my_recquirments,img_shortlishtedid;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_bottom_profile, container, false);
        img_my_recquirments=view.findViewById(R.id.clk_my_recquirments);
        img_shortlishtedid=view.findViewById(R.id.img_shortlishtedid);

        img_shortlishtedid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Bundle bundle = new Bundle();
                bundle.putString("TARGET_FRAGMENT_ID", "1");
                BottomSavedFragment someFragment = new BottomSavedFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();*/

                Bundle bundle = new Bundle();
                bundle.putString("TARGET_FRAGMENT_ID","1");
                BottomSavedFragment tabFragment = new BottomSavedFragment();
                tabFragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, tabFragment).commit();

            }
        });
        img_my_recquirments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), MyRecquirments.class);
                startActivity(intent);
            }
        });
        return view;
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