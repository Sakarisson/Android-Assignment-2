package com.sakarisson.kristian.androidassignment2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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
    OnClickListener aboutListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle("About");
            alertDialog.setMessage("The Robber Language is a Swedish language game. It became popular after the booke about Kalle Blomkvist by Astrid Lindgren, where the children use it as a code, both at play and in solving actual crimes. The principle is easy enough. Every consonant (spelling matters, not pronounciation) is doubled, and an o is inserted in-between. Viwels are left intact. (From Wikipedia)");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }
    };
    OnClickListener quitListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            finishAndRemoveTask();
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
        about.setOnClickListener(aboutListener);
        quit = findViewById(R.id.quitButton);
        quit.setOnClickListener(quitListener);
    }
}
