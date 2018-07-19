package com.foose.adc.custombottomnav;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView myNavigation;
    ImageView circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myNavigation = findViewById(R.id.myNavigation);
        circle = findViewById(R.id.circle);
        myNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            circle.setPressed(item.getItemId()==R.id.home);
            switch (item.getItemId()) {
                case R.id.inbox:
                    return true;
                case R.id.myStay:
                    return true;
                case R.id.home:
                    return true;
                case R.id.notification:
                    return true;
                case R.id.profile:
                    return true;
            }

            return false;
        }
    };

}
