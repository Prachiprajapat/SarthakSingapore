package com.creators.sarthaksingapore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp_Activity extends AppCompatActivity {
    Button btnSignUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);
        btnSignUP  = findViewById(R.id.btnSignUP);
        btnSignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp_Activity.this,LoginActivity.class));
            }
        });
    }
}