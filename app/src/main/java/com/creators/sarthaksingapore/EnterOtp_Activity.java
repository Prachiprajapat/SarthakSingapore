package com.creators.sarthaksingapore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.goodiebag.pinview.Pinview;

public class EnterOtp_Activity extends AppCompatActivity {
    TextView txnm;
    Pinview et_otp;
    Button  btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_otp_);
        txnm = findViewById(R.id.txnm);
        et_otp = findViewById(R.id.et_otp);
        btnVerify = findViewById(R.id.btnVerify);

        et_otp.setTextColor(getResources().getColor(R.color.white));
        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EnterOtp_Activity.this,UpdatePassword_Activity.class));
            }
        });
    }
}