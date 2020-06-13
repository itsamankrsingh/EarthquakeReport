package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake>earthquakes) {
        super(context, 0,earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //check if the existing view is being reused, otherwise inflate the view
        View listItemView=convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext())
                    .inflate(R.layout.earthquake_list,parent,false);
        }

        //get the object located at this position in the list
        Earthquake currentEarthquake=getItem(position);

        TextView textViewMag=(TextView)listItemView.findViewById(R.id.txtListMag);
        textViewMag.setText(currentEarthquake.getmMagnitude());

        TextView textViewPlace=(TextView)listItemView.findViewById(R.id.txtListPlace);
        textViewPlace.setText(currentEarthquake.getmPlace());

        TextView textViewDate=(TextView)listItemView.findViewById(R.id.txtListDate);
        textViewDate.setText(currentEarthquake.getmDate());


        return listItemView;
    }
}
