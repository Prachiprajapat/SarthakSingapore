package com.creators.sarthaksingapore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpdatePassword_Activity extends AppCompatActivity {
    Button cvsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_password_);
        cvsubmit = findViewById(R.id.cvsubmit);
        cvsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UpdatePassword_Activity.this,LoginActivity.class));
            }
        });
    }
}