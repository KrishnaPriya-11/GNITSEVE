package com.example.events;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Sports extends Fragment {

    RecyclerView rv;

    public Sports() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sports, container, false);
        rv = v.findViewById(R.id.recycler);

        int images[] = {R.drawable.basketball, R.drawable.badminton, R.drawable.chess,
                R.drawable.throwball, R.drawable.tabletennis,R.drawable.volleyball};
        String titles[] = {"Basketball", "Badminton", "Chess", "Throwball", "Tabletennis","Volleyball"};
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        EventsAdapter adapter = new EventsAdapter(getContext(), images, titles);
        rv.setAdapter(adapter);
        return v;

    }
}






