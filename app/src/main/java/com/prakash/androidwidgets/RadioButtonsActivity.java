package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityRadioButtonsBinding;

public class RadioButtonsActivity extends AppCompatActivity {

    private ActivityRadioButtonsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioButtonsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleShowGendar();
    }

    private void handleShowGendar() {
        binding.showGendarBtn.setOnClickListener(view -> {
            if (binding.maleRb.isChecked()) {
                String male = binding.maleRb.getText().toString();
                Toast.makeText(this, male, Toast.LENGTH_SHORT).show();
            } else if (binding.femaleRb.isChecked()){
                String female = binding.femaleRb.getText().toString();
                Toast.makeText(this, female, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Nothing selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}