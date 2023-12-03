package com.example.pr22;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MemoriaStart extends Activity   {

    Button mStart, mSettings, mScore, mExit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        mStart = (Button)findViewById(R.id.butStart);
        mSettings = (Button)findViewById(R.id.butSettings);
        mScore = (Button)findViewById(R.id.butScore);
        mExit = (Button)findViewById(R.id.butExit);

        mStart.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
        });

        mSettings.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View v) {
                startSettings();
            }
        });

        mScore.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View v) {
                startRecords();
            }
        });

        mExit.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void startGame () {
        Intent i = new Intent(this, MemoriaActivity.class);
        startActivity (i);
    }

    private void startSettings () {
        Intent i = new Intent(this, Settings.class);
        startActivity (i);
    }

    private void startRecords () {
        Intent i = new Intent(this, Records.class);
        startActivity (i);
    }
}