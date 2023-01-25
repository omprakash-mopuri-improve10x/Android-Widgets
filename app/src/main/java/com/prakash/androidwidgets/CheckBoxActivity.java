package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    private ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOrder();
    }

    private void handleOrder() {
        binding.orderBtn.setOnClickListener(view -> {
            if (binding.coffeeCb.isChecked()) {
                Toast.makeText(this, "coffee 10Rs", Toast.LENGTH_SHORT).show();
            } else if(binding.pizzaCb.isChecked()) {
                Toast.makeText(this, "pizza 100Rs", Toast.LENGTH_SHORT).show();
            } else if (binding.teaCb.isChecked()) {
                Toast.makeText(this, "tea 8Rs", Toast.LENGTH_SHORT).show();
            }
        });
    }
}