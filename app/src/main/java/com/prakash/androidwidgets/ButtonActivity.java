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
            int number1 = Integer.parseInt(binding.number1Txt.getText().toString());
            int number2 = Integer.parseInt(binding.number2Txt.getText().toString());
            String sum = add(number1, number2);
            Toast.makeText(this, sum, Toast.LENGTH_SHORT).show();
        });
    }

    private String add(int a, int b) {
        int sum = a + b;
        return String.valueOf(sum);
    }
}