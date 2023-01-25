package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityButtonBinding;

public class ButtonActivity extends AppCompatActivity {

    private ActivityButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleAdd();
    }

    private void handleAdd() {
        binding.addBtn.setOnClickListener(view -> {
            String number1 = binding.number1Txt.getText().toString();
            int numberOne = Integer.valueOf(number1);
            String number2 = binding.number2Txt.getText().toString();
            int numberTwo = Integer.valueOf(number2);
            int sum = numberOne + numberTwo;
            Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }
}