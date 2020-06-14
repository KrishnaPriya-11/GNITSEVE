package com.example.events;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Department extends Fragment {

    ViewPager v;
    TabLayout t;
    public Department() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_department, container, false);
        v=view.findViewById(R.id.viewpagerdept);
        t = view.findViewById(R.id.tablayoutdept);
        PAdapter adapter = new PAdapter(getFragmentManager());
        v.setAdapter(adapter);
        t.setupWithViewPager(v);
        return view;

    }
    class PAdapter extends FragmentPagerAdapter {


        public PAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new Cse();

                case 1:
                    return new Ece();

                case 2:
                    return new It();

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
                        return "CSE";
                    case 1:
                        return "ECE";
                    case 2:
                        return "IT";
                }
                return super.getPageTitle(position);
            }
        }
    }

}
