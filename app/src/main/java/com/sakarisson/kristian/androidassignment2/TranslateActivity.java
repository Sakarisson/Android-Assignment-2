package com.sakarisson.kristian.androidassignment2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

abstract public class TranslateActivity extends AppCompatActivity {

    private EditText editText;
    private Button translateButton;
    private TextView translatedText;
    protected String[] consonants = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "x", "z" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translate);

        editText = findViewById(R.id.editText);
        translateButton = findViewById(R.id.translateButton);
        translatedText = findViewById(R.id.translatedText);
        translatedText.setMovementMethod(new ScrollingMovementMethod());
        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String inputText = editText.getText().toString();
            if (inputText.equals("")) {
                Toast.makeText(getApplicationContext(), "There is nothing to translate", Toast.LENGTH_SHORT).show();
            }
            String translated = translate(inputText);
            translatedText.append(translated + "\n");
            }
        });
    }

    abstract String translate(String toTranslate);
}
