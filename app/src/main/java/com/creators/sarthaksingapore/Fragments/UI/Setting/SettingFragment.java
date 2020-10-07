package com.creators.sarthaksingapore.Fragments.UI.Setting;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.creators.sarthaksingapore.Activities.AboutUsFragmentDialog;
import com.creators.sarthaksingapore.Activities.BottomSheetDialog;
import com.creators.sarthaksingapore.Activities.ChangePasswordActivity;
import com.creators.sarthaksingapore.Activities.PrivacyPolicyDialogFragment;
import com.creators.sarthaksingapore.R;

import java.util.ArrayList;

public class SettingFragment  extends Fragment {
    TextView tv_changepassword,tv_history,tv_clearfev,terms_condition,shareapp,tv_privacypolicy,aboutus;
    public SettingFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.settingfragment, container, false);

        tv_changepassword =view.findViewById(R.id.tv_changepassword);
        tv_history = view.findViewById(R.id.tv_history);
        tv_clearfev= view.findViewById(R.id.tv_clearfev);
        terms_condition = view.findViewById(R.id.terms_condition);
        shareapp = view.findViewById(R.id.shareapp);
        tv_privacypolicy = view.findViewById(R.id.privacy);
        aboutus =view.findViewById(R.id.aboutus);


        final ArrayList itemsSelected = new ArrayList();

        shareapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent =   new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
                String app_url = " https://play.google.com/store/apps/details?id=my.example.javatpoint";
                shareIntent.putExtra(Intent.EXTRA_TEXT,app_url);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });

        terms_condition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheet = new BottomSheetDialog();
                bottomSheet.show(getChildFragmentManager(),
                        "ModalBottomSheet");
            }
        });

        tv_privacypolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrivacyPolicyDialogFragment bottomSheet = new PrivacyPolicyDialogFragment();
                bottomSheet.show(getChildFragmentManager(),
                        "ModalBottomSheet");
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutUsFragmentDialog bottomSheet = new AboutUsFragmentDialog();
                bottomSheet.show(getChildFragmentManager(),
                        "ModalBottomSheet");
            }
        });
        tv_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                ViewGroup viewGroup = view.findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.customview,viewGroup, false);
                TextView tv_clear = dialogView.findViewById(R.id.tv_clear);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                alertDialog.show();
                tv_clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });

            }
        });

        tv_clearfev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                ViewGroup viewGroup = view.findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.customview,viewGroup, false);
                TextView tv_clear = dialogView.findViewById(R.id.tv_clear);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.create();
                alertDialog.show();
                tv_clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });

            }
        });




        tv_changepassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ChangePasswordActivity.class);
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


