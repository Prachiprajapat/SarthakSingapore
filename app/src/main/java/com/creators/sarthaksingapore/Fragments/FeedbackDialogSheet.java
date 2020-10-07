package com.creators.sarthaksingapore.Fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.creators.sarthaksingapore.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class FeedbackDialogSheet extends BottomSheetDialogFragment implements View.OnClickListener {

       TextView poor_listing,searchisuue,crash,login_issue,others;
       LinearLayout layout,lay_visible;
    public View onCreateView(LayoutInflater inflater, @Nullable
            ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.feedbackdialog,
                container, false);
        poor_listing = v.findViewById(R.id.poor_listing);
        searchisuue=v.findViewById(R.id.searchisuue);
        layout = v.findViewById(R.id.layout);
        crash = v.findViewById(R.id.crash);
        login_issue = v.findViewById(R.id.login_issue);
        others = v.findViewById(R.id.others);

        lay_visible =v.findViewById(R.id.lay_visible);
        poor_listing.setOnClickListener(this);
        searchisuue.setOnClickListener(this);
        others.setOnClickListener(this);
        crash.setOnClickListener(this);
        login_issue.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = getChildFragmentManager()
                .beginTransaction();

        switch(v.getId()) {
            case R.id.poor_listing:
                 layout.setVisibility(View.GONE);

                transaction.replace(R.id.content1,
                        new PureListingQualityFragment()).commit();
                ((AppCompatActivity) getActivity()).getSupportActionBar().show();

            case R.id.searchisuue:
                layout.setVisibility(View.GONE);
               transaction = getChildFragmentManager()
                        .beginTransaction();
                transaction.replace(R.id.content1,
                        new SearchIssueFragment()).commit();


                ((AppCompatActivity) getActivity()).getSupportActionBar().show();

            case  R.id.others:
                lay_visible.setVisibility(View.VISIBLE);
                case  R.id.login_issue:
                lay_visible.setVisibility(View.VISIBLE);
                case  R.id.crash:
                lay_visible.setVisibility(View.VISIBLE);

        }

                // getActivity().onBackPressed();



    }

//    public void setupDialog(Dialog dialog, int style)
//    {
//
//        View view = View.inflate(getContext(), R.layout.feedbackdialog, null);
//        dialog.setContentView(view);
//
//
//        View bottomSheet = dialog.findViewById(R.id.design_bottom_sheet);
//        BottomSheetBehavior behavior = BottomSheetBehavior.from(bottomSheet);
//        behavior.setPeekHeight(1200);
//        // how to set maximum expanded height???? Or a minimum top offset?
//
//    }

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
