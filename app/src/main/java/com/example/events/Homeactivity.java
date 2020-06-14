package com.example.events;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.Switch;

public class Homeactivity extends AppCompatActivity {
    ViewPager v;
    TabLayout t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        v = findViewById(R.id.viewpager);
        t = findViewById(R.id.tabLayout);
        PAdapter adapter = new PAdapter(getSupportFragmentManager());
        v.setAdapter(adapter);
        t.setupWithViewPager(v);
    }

    class PAdapter extends FragmentPagerAdapter {


        public PAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new Sports();

                case 1:
                    return new Department();

                case 2:
                    return new Common();

            }
            return null;
        }

        @Override
        public int getCount() {

            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            {
                switch (position) {
                    case 0:
                        return "Sports";
                    case 1:
                        return "Department";
                    case 2:
                        return "Common";
                }
                return super.getPageTitle(position);
            }
        }
    }
}