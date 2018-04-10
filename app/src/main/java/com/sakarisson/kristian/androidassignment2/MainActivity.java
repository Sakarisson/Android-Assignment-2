package com.sakarisson.kristian.androidassignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button translateTo;
    private Button translateFrom;
    private Button about;
    private Button quit;

    private Intent translateToIntent;
    private Intent translateFromIntent;

    OnClickListener translateToListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(translateToIntent);
        }
    };

    OnClickListener translateFromListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(translateFromIntent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        translateTo = findViewById(R.id.translateToButton);
        translateToIntent = new Intent(this, TranslateToActivity.class);
        translateTo.setOnClickListener(translateToListener);
        translateFrom = findViewById(R.id.translateFromButton);
        translateFromIntent = new Intent(this, TranslateFromActivity.class);
        translateFrom.setOnClickListener(translateFromListener);
        about = findViewById(R.id.aboutButton);
        quit = findViewById(R.id.quitButton);
    }
}
