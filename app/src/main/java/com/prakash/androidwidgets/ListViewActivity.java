package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityListViewBinding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding binding;
    private ArrayList<String> languages;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        handleListView();
    }

    private void setData() {
        languages = new ArrayList();
        languages.add("Java");
        languages.add("Android");
        languages.add("HTML");
        languages.add("CSS");
        languages.add("Python");
        languages.add("Java");
        languages.add("Android");
        languages.add("HTML");
        languages.add("CSS");
        languages.add("Python");
        languages.add("Java");
        languages.add("Android");
        languages.add("HTML");
        languages.add("CSS");
        languages.add("Python");
        languages.add("Java");
        languages.add("Android");
        languages.add("HTML");
        languages.add("CSS");
        languages.add("Python");
    }

    private void handleListView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, languages);
        binding.languagesLv.setAdapter(arrayAdapter);
        binding.languagesLv.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(this, String.valueOf(languages.get(i)), Toast.LENGTH_SHORT).show();
        });
    }
}