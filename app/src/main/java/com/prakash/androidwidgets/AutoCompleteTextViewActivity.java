package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityAutoCompleteTextViewBinding;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityAutoCompleteTextViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleAutoSuggestions();
    }

    private void handleAutoSuggestions() {
        String[] languages = createLanguages();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, languages);
        binding.languageAutoCompleteTxt.setAdapter(arrayAdapter);
        binding.languageAutoCompleteTxt.setTextColor(Color.BLUE);
    }

    private String[] createLanguages() {
        String[] languages = {"Java", "Android", "Python", "HTMl", "JavaScript"};
        return languages;
    }
}