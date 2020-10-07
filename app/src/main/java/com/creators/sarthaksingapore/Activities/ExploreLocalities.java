package com.creators.sarthaksingapore.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.creators.sarthaksingapore.HomeActivity;
import com.creators.sarthaksingapore.R;

public class ExploreLocalities extends AppCompatActivity {

    Button btnSearch;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_localities);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Localities");

        final PopUpClass popUpClass=new PopUpClass();

        btnSearch=findViewById(R.id.btnSearch);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
popUpClass.showPopupWindow(view);
            }
        });
    }
}
