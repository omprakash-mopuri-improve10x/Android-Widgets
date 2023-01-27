package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivitySearchViewBinding;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {

    private ActivitySearchViewBinding binding;
    private ArrayList<String> fruits;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        setFruitsLv();
        handleSearchView();
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

    private void setFruitsLv() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits);
        binding.fruitsLv.setAdapter(arrayAdapter);
    }

    private void handleSearchView() {
        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if (fruits.contains(s)) {
                    arrayAdapter.getFilter().filter(s);
                } else {
                    Toast.makeText(SearchViewActivity.this, "No match found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });
    }
}