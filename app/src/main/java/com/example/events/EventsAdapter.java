package com.example.events;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventInfo> {
    Context context;
    int images[];
    String titles[];

    public EventsAdapter(Context context, int[] images, String[] titles) {
        this.context = context;
        this.images = images;
        this.titles = titles;
    }

    @NonNull
    @Override
    public EventInfo onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(context).inflate(R.layout.row, viewGroup, false);
        return new EventInfo(v);
    }

    @Override
    public void onBindViewHolder(@NonNull EventInfo eventInfo, int i) {
        eventInfo.img.setImageResource(images[i]);
        eventInfo.tv.setText(titles[i]);
    }

    @Override
    public int getItemCount() {
        return images.length;

    }

    public static class EventInfo extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tv;


        public EventInfo(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageview);
            tv = itemView.findViewById(R.id.tv_title);
        }
    }
}
