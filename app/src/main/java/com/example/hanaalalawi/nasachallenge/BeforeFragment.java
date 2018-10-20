package com.example.hanaalalawi.nasachallenge;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BeforeFragment extends Fragment {
    TextView plan1, plan2, plan3, plan4, plan5, plan6, plan7, plan8User, titleB;
    EditText userPlan;
    Bundle bundle;
    String disTitle;
    Button save;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_before_fragment, container, false);

        bundle = getActivity().getIntent().getExtras();
        disTitle = bundle.getString("dis_name");
        plan1 = (TextView) v.findViewById(R.id.step1);                                       hdsnbds
        plan2 = (TextView) v.findViewById(R.id.step2);
        plan3 = (TextView) v.findViewById(R.id.step3);
        plan4 = (TextView) v.findViewById(R.id.step4);
        plan5 = (TextView) v.findViewById(R.id.step5);
        plan6 = (TextView) v.findViewById(R.id.step6);
        plan7 = (TextView) v.findViewById(R.id.step7);
        titleB = (TextView) v.findViewById(R.id.title);
        plan8User = (TextView) v.findViewById(R.id.userPlanResult);
        userPlan = (EditText) v.findViewById(R.id.userPlan);
        save = (Button) v.findViewById(R.id.save);

        titleB.setText(disTitle);

        if (disTitle.equals("Earthquakes")) {
            plan1.setText(R.string.beforeep1);
            plan2.setText(R.string.beforeep2);
            plan3.setText(R.string.beforeep3);
            plan4.setText(R.string.beforeep4);
            plan5.setText(R.string.beforeep5);
            plan6.setText(R.string.beforeep6);
            plan7.setText(R.string.beforeep7);

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String userplanstr = userPlan.getText().toString();
                    plan8User.setText(userplanstr);
                }
            });

        } else if (disTitle.equals("Fires")) {
            plan1.setText(R.string.beforeep1);
            plan1.setText("Charge your phone to use the app and to call emergency.");
            plan2.setText("Choose a safe place in every room. It’s best to get under a sturdy piece of furniture like a table or a desk where nothing can fall on you. ");
            plan3.setText("Practice DROP, COVER AND HOLD ON!");
            plan4.setText("Drop under something sturdy, hold on, and protect your eyes by pressing your face against your arm.  ");
            plan5.setText("If you live in an earthquake prone area, bolt tall furniture to the wall and install strong latches to cupboards. ");
            plan6.setText("Remember! Emergency preparedness can save lives. ");
            plan7.setText("Prepare a first aid kit for your home By taking special precautions and checking for hazards before a disaster strikes, you will be much more likely to stay safe");

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String userplanstr = userPlan.getText().toString();
                    plan8User.setText(userplanstr);
                }
            });
        } else if (disTitle.equals("Floods")) {
            plan1.setText(R.string.beforeep1);
            plan1.setText("Charge your phone to use the app and to call emergency.");
            plan2.setText("Choose a safe place in every room. It’s best to get under a sturdy piece of furniture like a table or a desk where nothing can fall on you. ");
            plan3.setText("Practice DROP, COVER AND HOLD ON!");
            plan4.setText("Drop under something sturdy, hold on, and protect your eyes by pressing your face against your arm.  ");
            plan5.setText("If you live in an earthquake prone area, bolt tall furniture to the wall and install strong latches to cupboards. ");
            plan6.setText("Remember! Emergency preparedness can save lives. ");
            plan7.setText("Prepare a first aid kit for your home By taking special precautions and checking for hazards before a disaster strikes, you will be much more likely to stay safe");

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String userplanstr = userPlan.getText().toString();
                    plan8User.setText(userplanstr);
                }
            });
        } else if (disTitle.equals("Hurricane")) {
            plan1.setText(R.string.beforeep1);
            plan1.setText("Charge your phone to use the app and to call emergency.");
            plan2.setText("Choose a safe place in every room. It’s best to get under a sturdy piece of furniture like a table or a desk where nothing can fall on you. ");
            plan3.setText("Practice DROP, COVER AND HOLD ON!");
            plan4.setText("Drop under something sturdy, hold on, and protect your eyes by pressing your face against your arm.  ");
            plan5.setText("If you live in an earthquake prone area, bolt tall furniture to the wall and install strong latches to cupboards. ");
            plan6.setText("Remember! Emergency preparedness can save lives. ");
            plan7.setText("Prepare a first aid kit for your home By taking special precautions and checking for hazards before a disaster strikes, you will be much more likely to stay safe");

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String userplanstr = userPlan.getText().toString();
                    plan8User.setText(userplanstr);
                }
            });
        } else if (disTitle.equals("Volcano")) {
            plan1.setText(R.string.beforeep1);
            plan1.setText("Charge your phone to use the app and to call emergency.");
            plan2.setText("Choose a safe place in every room. It’s best to get under a sturdy piece of furniture like a table or a desk where nothing can fall on you. ");
            plan3.setText("Practice DROP, COVER AND HOLD ON!");
            plan4.setText("Drop under something sturdy, hold on, and protect your eyes by pressing your face against your arm.  ");
            plan5.setText("If you live in an earthquake prone area, bolt tall furniture to the wall and install strong latches to cupboards. ");
            plan6.setText("Remember! Emergency preparedness can save lives. ");
            plan7.setText("Prepare a first aid kit for your home By taking special precautions and checking for hazards before a disaster strikes, you will be much more likely to stay safe");

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String userplanstr = userPlan.getText().toString();
                    plan8User.setText(userplanstr);
                }
            });
        }


        return inflater.inflate(R.layout.activity_before_fragment, container, false);
    }
}

