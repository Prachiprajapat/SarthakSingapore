package com.creators.sarthaksingapore.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

import com.creators.sarthaksingapore.R;

public class SettingActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    ImageView imageView;

    ImageView img_daliy,img_alternet,img_week;

    RelativeLayout rel5,rel6,rel7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
      toggleButton=findViewById(R.id.toggle);

        rel5=findViewById(R.id.rel5);
        rel6=findViewById(R.id.rel6);
        rel7=findViewById(R.id.rel7);

        img_alternet=findViewById(R.id.img_alternet);
        img_daliy=findViewById(R.id.img_daily);
        img_week=findViewById(R.id.img_weekly);

       toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(toggleButton.isChecked()){
                    toggleButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.switcht));
                }else {
                    toggleButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.switcht));
                }
            }
        });

        rel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rel5.setBackgroundDrawable(getResources().getDrawable(R.drawable.backbox));
                rel5.setBackgroundColor(getResources().getColor(R.color.color_gray_light));
                img_daliy.setImageResource(R.drawable.ic_check_circle_black_24dp);
                img_alternet.setImageResource(R.drawable.ic_radio_button_unchecked_black_24dp);
                img_week.setImageResource(R.drawable.ic_radio_button_unchecked_black_24dp);
             // rel6.setBackgroundColor(getResources().getColor(R.color.white));
             //   rel7.setBackgroundColor(getResources().getColor(R.color.white));
                rel7.setBackgroundDrawable(getResources().getDrawable(R.drawable.boxback));
                rel6.setBackgroundDrawable(getResources().getDrawable(R.drawable.boxback));

            }
        });

        rel6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rel5.setBackgroundDrawable(getResources().getDrawable(R.drawable.boxback));
                //rel6.setBackgroundColor(getResources().getColor(R.color.color_gray_light));
                img_alternet.setImageResource(R.drawable.ic_check_circle_black_24dp);
                img_daliy.setImageResource(R.drawable.ic_radio_button_unchecked_black_24dp);
                img_week.setImageResource(R.drawable.ic_radio_button_unchecked_black_24dp);

                rel6.setBackgroundDrawable(getResources().getDrawable(R.drawable.backbox));

                rel7.setBackgroundDrawable(getResources().getDrawable(R.drawable.boxback));

            }
        });

        rel7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  rel7.setBackgroundColor(getResources().getColor(R.color.color_gray_light));
                img_week.setImageResource(R.drawable.ic_check_circle_black_24dp);
                img_daliy.setImageResource(R.drawable.ic_radio_button_unchecked_black_24dp);
                img_alternet.setImageResource(R.drawable.ic_radio_button_unchecked_black_24dp);

               // rel6.setBackgroundColor(getResources().getColor(R.color.white));
                //rel5.setBackgroundColor(getResources().getColor(R.color.white));
                rel5.setBackgroundDrawable(getResources().getDrawable(R.drawable.boxback));
                rel6.setBackgroundDrawable(getResources().getDrawable(R.drawable.boxback));
                rel7.setBackgroundDrawable(getResources().getDrawable(R.drawable.backbox));

            }
        });
    }
}
