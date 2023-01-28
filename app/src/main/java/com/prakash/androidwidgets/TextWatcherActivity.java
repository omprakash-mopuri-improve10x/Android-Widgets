package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityTextWatcherBinding;

import java.util.ArrayList;

public class TextWatcherActivity extends AppCompatActivity {

    private ActivityTextWatcherBinding binding;
    private ArrayList<String> fruits;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTextWatcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        setupFruitsLv();
        handleEditText();
    }

    private void setData() {
        fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Orange");
        fruits.add("Lychee");
        fruits.add("Gavava");
        fruits.add("Peech");
        fruits.add("Melon");
        fruits.add("Watermelon");
        fruits.add("Papaya");
    }

    private void setupFruitsLv() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits);
        binding.fruitsLv.setAdapter(arrayAdapter);
    }

    private void handleEditText() {
        binding.searchTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(TextWatcherActivity.this, "Before", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                arrayAdapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(TextWatcherActivity.this, "After", Toast.LENGTH_SHORT).show();
            }
        });
    }
}