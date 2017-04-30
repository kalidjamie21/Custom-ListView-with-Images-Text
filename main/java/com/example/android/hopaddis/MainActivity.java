package com.example.android.hopaddis;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;
    ArrayList progList;

    // Set image array
    public static Integer[] progImages = {
            R.drawable.audio,
            R.drawable.audio,
            R.drawable.audio,
            R.drawable.audio,
            R.drawable.audio,
            R.drawable.audio,
            R.drawable.audio,
            R.drawable.audio,
            R.drawable.audio


    };
    // Set the title array
    public static String[] progNames = {
            "Object", "Class", "Polymorphism", "Inhertance", "JDBC", "Abstract", "Constructor", "Android", "Swing"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create new instance of adapter
        MyListAdapter adapter = new MyListAdapter(this, progNames, progImages);

        lv = (ListView) findViewById(R.id.listView2);
        lv.setAdapter(adapter);
    }
}


