package com.sakarisson.kristian.androidassignment2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TranslateToActivity extends AppCompatActivity {

    private EditText editText;
    private Button translateButton;
    private TextView translatedText;
    private String[] consonants = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "x", "z" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translate_to);

        editText = findViewById(R.id.editText);
        translateButton = findViewById(R.id.translateButton);
        translatedText = findViewById(R.id.translatedText);
        translatedText.setMovementMethod(new ScrollingMovementMethod());
        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                String translated = translate(inputText);
                translatedText.append(translated + "\n");
            }
        });
    }

    private String translate(String toTranslate) {
        String result = toTranslate;
        for (String consonant : consonants) {
            result = result.replace(consonant, consonant + "o" + consonant);
        }
        return result;
    }
}
