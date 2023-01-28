package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import com.prakash.androidwidgets.databinding.ActivityMultiAutoCompleteTextViewBinding;

public class MultiAutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityMultiAutoCompleteTextViewBinding binding;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMultiAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleMultiAutoCompleteTxt();
    }

    private void handleMultiAutoCompleteTxt() {
        String[] languages = {"Java", "Android", "Python", "HTMl", "JavaScript"};
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, languages);
        binding.multiAutoCompleteTxt.setAdapter(arrayAdapter);
        binding.multiAutoCompleteTxt.setThreshold(1);
        binding.multiAutoCompleteTxt.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}