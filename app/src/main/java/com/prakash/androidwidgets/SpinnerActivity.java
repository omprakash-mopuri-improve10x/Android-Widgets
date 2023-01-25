package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivitySpinnerBinding;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    private ActivitySpinnerBinding binding;
    ArrayList<String> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySpinnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        handleSpinner();
    }

    private void setData() {
        countries = new ArrayList<>();
        countries.add("India");
        countries.add("Australia");
        countries.add("West Indies");
    }

    private void handleSpinner() {
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
            binding.countryListSp.setAdapter(arrayAdapter);
            binding.countryListSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(SpinnerActivity.this, "Country : " + countries.get(i), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
        });
    }
}