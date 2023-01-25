package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;

import com.prakash.androidwidgets.databinding.ActivityAlertDailogBinding;

public class AlertDailogActivity extends AppCompatActivity {

    private ActivityAlertDailogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertDailogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleBack();
    }

    private void handleBack() {
        binding.backBtn.setOnClickListener(view -> {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Alert!");
            alertDialog.setMessage("Are you for going to back?");
            alertDialog.setPositiveButton("yes", (dialogInterface, i) -> {
                finish();
            });
            alertDialog.setNegativeButton("No", (dialogInterface, i) -> {
                alertDialog.setCancelable(true);
            });
            AlertDialog alertDialog1 = alertDialog.create();
            alertDialog1.show();
        });
    }
}