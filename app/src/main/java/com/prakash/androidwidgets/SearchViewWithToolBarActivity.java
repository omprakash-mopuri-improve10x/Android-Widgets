package com.prakash.androidwidgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivitySearchViewWithToolBarBinding;

import java.util.ArrayList;

public class SearchViewWithToolBarActivity extends AppCompatActivity {

    private ActivitySearchViewWithToolBarBinding binding;
    ArrayList<String> fruits;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewWithToolBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Search");
        setData();
        setupFruitsInLv();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_view, menu);
        MenuItem searchViewItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchViewItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                //searchView.clearFocus();
                // (or)
                if (fruits.contains(s)) {
                    arrayAdapter.getFilter().filter(s);
                } else {
                    Toast.makeText(SearchViewWithToolBarActivity.this, "No match found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });
        return true;
    }

    private void setData() {
        fruits = new ArrayList<>();
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

    private void setupFruitsInLv() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits);
        binding.fruitsLv.setAdapter(arrayAdapter);
    }
}