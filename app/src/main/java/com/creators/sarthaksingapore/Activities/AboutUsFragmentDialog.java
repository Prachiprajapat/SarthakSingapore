package com.creators.sarthaksingapore.Activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.creators.sarthaksingapore.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class AboutUsFragmentDialog  extends BottomSheetDialogFragment {

    public View onCreateView(LayoutInflater inflater, @Nullable
            ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.aboutusfragmentdialog,
                container, false);


        return v;
    }
}
