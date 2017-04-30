package com.example.android.hopaddis;

import android.app.Activity;

import android.media.ImageReader;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by User on 2017-04-30.
 */

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] progNames;
    private final Integer[] progImages;

    public MyListAdapter(Activity context, String[] progNames, Integer[] progImages) {
        super(context, R.layout.activity_image_list, progNames);
        this.context = context;
        this.progNames = progNames;
        this.progImages = progImages;
    }

    //This is where the adapter will render the row views
    @Override
    public View getView(int position, @Nullable View convertView, ViewGroup parent) {

        //LayoutInflater will inflate the row view to the listview
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_image_list, null, true);

        // Which items do I want to inflate?
        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView2);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);

        // Populate my listview with array information from TITLE and IMAGE
        txtTitle.setText(progNames[position]);
        imageView.setImageResource(progImages[position]);

        return rowView;
    }
}
