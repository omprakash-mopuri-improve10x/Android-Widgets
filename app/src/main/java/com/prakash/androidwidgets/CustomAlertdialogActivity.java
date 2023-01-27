package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.prakash.androidwidgets.databinding.ActivityCustomAlertdialogBinding;
import com.prakash.androidwidgets.databinding.CustomAlertDialogItemBinding;

public class CustomAlertdialogActivity extends AppCompatActivity {

    private ActivityCustomAlertdialogBinding binding;
    private CustomAlertDialogItemBinding itemBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAlertdialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleCustomAlertDialog();
    }

    private void handleCustomAlertDialog() {
        binding.customAlertDialogBtn.setOnClickListener(view -> {
            Dialog dialog = new Dialog(this);
            itemBinding = CustomAlertDialogItemBinding.inflate(getLayoutInflater());
            dialog.setContentView(itemBinding.getRoot());

            itemBinding.dismissBtn.setOnClickListener(view1 -> {
                finish();
            });
            itemBinding.messageTxt.setText("Alert...!!!");
            itemBinding.crossBtn.setOnClickListener(view1 -> {
                dialog.cancel();
            });
            dialog.show();
        });
    }
}