package com.sakarisson.kristian.androidassignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button translateTo;
    private Button translateFrom;
    private Button about;
    private Button quit;

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
