package com.example.pr22;

import java.util.ArrayList;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class RecordPoint extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_tab);

        RecordAdapter ra = new RecordAdapter (this);
        ArrayList<String> arr = ra.getRecPoint();

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, R.layout.item, arr);
        setListAdapter(mAdapter);
    }
}