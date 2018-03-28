package com.example.android.ambedo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by roix on 3/23/18.
 */

public class ReccomendationAdapter extends ArrayAdapter<Recommendation> {
    public ReccomendationAdapter(Activity context, ArrayList<Recommendation> recommendations) {

        super(context, 0, recommendations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.withpicture, parent, false);
        }
        Recommendation currentWord = getItem(position);
        TextView bandNameTextView = (TextView) listItemView.findViewById(R.id.band_name_text_view);
        bandNameTextView.setText(currentWord.getBandName());

        TextView songsTextView = (TextView) listItemView.findViewById(R.id.songs_text_view);
        songsTextView.setText("Notable Songs:\n" + currentWord.getSongs());

        ImageView image = (ImageView) listItemView.findViewById(R.id.band_pic);
        image.setImageResource(currentWord.getPicture());

        return listItemView;


    }
}