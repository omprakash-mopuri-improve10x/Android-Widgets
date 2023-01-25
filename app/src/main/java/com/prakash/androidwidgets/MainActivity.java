package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.prakash.androidwidgets.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleButton();
        handleCustomToast();
        handleToggleButton();
        handleCheckBox();
        handleSpinner();
        handleAutoCompleteTextView();
        handleRatingBar();
        handleAlertDailog();
        handleDatePicker();
        handleTimePicker();
    }

    private void handleButton() {
        binding.buttonBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ButtonActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomToast() {
        binding.customToastBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomToastActivity.class);
            startActivity(intent);
        });
    }

    private void handleToggleButton() {
        binding.togBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ToggleButtonActivity.class);
            startActivity(intent);
        });
    }

    private void handleCheckBox() {
        binding.checkboxBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
    }

    private void handleSpinner() {
        binding.spinnerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        });
    }

    private void handleAutoCompleteTextView() {
        binding.autoCompleteBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AutoCompleteTextViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleRatingBar() {
        binding.ratingBarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RatingBarActivity.class);
            startActivity(intent);
        });
    }

    private void handleAlertDailog() {
        binding.alertDailogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AlertDailogActivity.class);
            startActivity(intent);
        });
    }

    private void handleDatePicker() {
        binding.datePickerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        });
    }

    private void handleTimePicker() {
        binding.timePickerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        });
    }
}