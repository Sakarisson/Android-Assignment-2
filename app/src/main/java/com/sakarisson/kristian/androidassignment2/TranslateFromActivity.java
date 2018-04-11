package com.sakarisson.kristian.androidassignment2;

public class TranslateFromActivity extends TranslateActivity {

    @Override
    final String translate(String toTranslate) {
        String result = toTranslate;
        for (String consonant : consonants) {
            result = result.replace(consonant + "o" + consonant, consonant);
        }
        return result;
    }
}
