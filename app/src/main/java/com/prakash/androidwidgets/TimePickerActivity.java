package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityTimePickerBinding;

public class TimePickerActivity extends AppCompatActivity {

    private ActivityTimePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleChangeTime();
    }

    private void handleChangeTime() {
        binding.changeTimeTxt.setOnClickListener(view -> {
            int currentHour = binding.timePicker.getCurrentHour();
            int currentMinute = binding.timePicker.getCurrentMinute();
            Toast.makeText(this, "Current Time : " + currentHour + " : " + currentMinute, Toast.LENGTH_SHORT).show();
        });
    }
}