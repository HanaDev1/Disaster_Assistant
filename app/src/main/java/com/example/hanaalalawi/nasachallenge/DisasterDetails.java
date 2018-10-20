package com.example.hanaalalawi.nasachallenge;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DisasterDetails extends AppCompatActivity {
    TextView disDescription, beforeDis, afterDis, duringDis, title;
    ImageView disImage;
    Bundle bundle;
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
        }else if(disTitle.equals("Fires")){
            disDescription.setText(R.string.fire);
        }else if(disTitle.equals("Floods")){
            disDescription.setText(R.string.flood);
        }else if(disTitle.equals("Hurricane")){
            disDescription.setText("A hurricane is a huge storm! It can be up to 600 miles across and have strong winds spiraling inward and upward at speeds of 75 to 200 mph. " +
                    "Each hurricane usually lasts for over a week, moving 10-20 miles per hour over the open ocean");
        }else if(disTitle.equals("Volcano")){
            disDescription.setText("A volcano is a mountain that opens downward to a pool of molten rock below the surface of the earth. When pressure builds up, eruptions occur." +
                    " Gases and rock shoot up through the opening and spill over or fill the air with lava fragments");
        }

    }
}
