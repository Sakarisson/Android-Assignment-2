package com.sakarisson.kristian.androidassignment2;

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
    OnClickListener translateToListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            setContentView(R.layout.translate_to);
        }
    };

    OnClickListener translateFromListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            setContentView(R.layout.translate_from);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        translateTo = findViewById(R.id.translateToButton);
        translateFrom = findViewById(R.id.translateFromButton);
        about = findViewById(R.id.aboutButton);
        quit = findViewById(R.id.quitButton);
    }
}
