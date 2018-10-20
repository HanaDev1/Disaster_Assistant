package com.example.hanaalalawi.nasachallenge;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisasterDetails extends AppCompatActivity {
    TextView disDescription, beforeDis, afterDis, duringDis, title;
    ImageView disImage;
    Bundle bundle;
    LinearLayout linearbefore;
    String discerption, disTitle;
    String img;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster_details);

        disDescription = (TextView) findViewById(R.id.dis);
        beforeDis = (TextView) findViewById(R.id.before);
        afterDis = (TextView) findViewById(R.id.after);
        duringDis = (TextView) findViewById(R.id.during);
        disImage = (ImageView) findViewById(R.id.disImg);
        title = (TextView) findViewById(R.id.title);
        linearbefore = (LinearLayout) findViewById(R.id.linearbefore);

        bundle = getIntent().getExtras();
        disTitle = bundle.getString("dis_name");
        img = bundle.getString("dis_img");

        title.setText(disTitle);
        disImage.setImageResource(Integer.parseInt(img));

        beforeDis.setText("Before "+disTitle);
        duringDis.setText("During "+disTitle);
        afterDis.setText("After "+disTitle);

        if(disTitle.equals("Earthquakes")){
            disDescription.setText(R.string.earthquake);
            linearbefore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = disTitle;
                    Intent before = new Intent(DisasterDetails.this,PrepreationActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("dis_name", name);
                    before.putExtras(bundle);
                    before.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);//clear all activities before the signin
                    startActivity(before);
                }
            });
        }else if(disTitle.equals("Fires")){
            disDescription.setText(R.string.fire);
        }else if(disTitle.equals("Floods")){
            disDescription.setText(R.string.flood);
        }else if(disTitle.equals("Hurricane")){
            disDescription.setText(R.string.Hurricane);
        }else if(disTitle.equals("Volcano")){
            disDescription.setText(R.string.Volcano);
        }

    }
}
