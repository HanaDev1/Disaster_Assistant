package com.example.hanaalalawi.nasachallenge;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class PrepreationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepreation);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottobNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navList);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_place,new BeforeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navList =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.nav_before:
                            selectedFragment = new BeforeFragment();
                            break;
                        case R.id.nav_during:
                            selectedFragment = new DuringFragment();
                            break;
                        case R.id.nav_after:
                            selectedFragment = new Fragment();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_place,selectedFragment).commit();
                    return true;
                }
            };
}
