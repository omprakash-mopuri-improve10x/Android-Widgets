package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityToggleButtonBinding;

public class ToggleButtonActivity extends AppCompatActivity {

    private ActivityToggleButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToggleButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleSubmit();
    }

    private void handleSubmit() {
        binding.submitBtn.setOnClickListener(view -> {
            String btn1 = binding.toggleBtn1.getText().toString();
            String btn2 = binding.toggleBtn2.getText().toString();
            Toast.makeText(this, btn1 + "\n" + btn2, Toast.LENGTH_SHORT).show();
        });
    }
}