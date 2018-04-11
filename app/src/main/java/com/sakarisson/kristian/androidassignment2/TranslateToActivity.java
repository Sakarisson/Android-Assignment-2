package com.sakarisson.kristian.androidassignment2;

public class TranslateToActivity extends TranslateActivity {

    @Override
    final String translate(String toTranslate) {
        String result = toTranslate;
        for (String consonant : consonants) {
            result = result.replace(consonant, consonant + "o" + consonant);
        }
        return result;
    }
}
