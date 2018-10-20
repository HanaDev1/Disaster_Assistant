package com.example.hanaalalawi.nasachallenge;

import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class AfterFragment extends Fragment {
    TextView plan1, plan2, plan3, plan4, plan5, plan6, plan7, plan8User, titleB;
    ImageView plan1check, plan2check, plan3check, plan4check, plan5check, plan6check, plan7check;
    EditText userPlan;
    Bundle bundle;
    String disTitle;
    Button save;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LayoutInflater lf = getActivity().getLayoutInflater();
        View v = lf.inflate(R.layout.activity_before_fragment, container, false);

        bundle = getActivity().getIntent().getExtras();
        disTitle = bundle.getString("dis_name");
        plan1 = (TextView) v.findViewById(R.id.step1);
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
        plan1check = (ImageView) v.findViewById(R.id.circle1);
        plan2check = (ImageView) v.findViewById(R.id.circle2);
        plan3check = (ImageView) v.findViewById(R.id.circle3);
        plan4check = (ImageView) v.findViewById(R.id.circle4);
        plan5check = (ImageView) v.findViewById(R.id.circle5);
        plan6check = (ImageView) v.findViewById(R.id.circle6);
        plan7check = (ImageView) v.findViewById(R.id.circle7);


        titleB.setText(disTitle);

        if (disTitle.equals("Earthquakes")) {
            plan1.setText(R.string.afterep1);
            plan2.setText(R.string.afterep2);
            plan3.setText(R.string.afterep3);
            plan4.setText(R.string.afterep4);
            plan5.setVisibility(View.GONE);
            plan6.setVisibility(View.GONE);
            plan7.setVisibility(View.GONE);

            plan1check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    plan1check.setImageResource(R.drawable.circle);
                }
            });
            plan2check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    plan2check.setImageResource(R.drawable.circle);
                }
            });
            plan3check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    plan3check.setImageResource(R.drawable.circle);
                }
            });
            plan4check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    plan4check.setImageResource(R.drawable.circle);
                }
            });
            plan5check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    plan5check.setImageResource(R.drawable.circle);
                }
            });
            plan6check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    plan6check.setImageResource(R.drawable.circle);
                }
            });
            plan7check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    plan7check.setImageResource(R.drawable.circle);
                }
            });

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String userplanstr = userPlan.getText().toString();
                    plan8User.setText(userplanstr);
                }
            });

        }

        return v;
    }
}

