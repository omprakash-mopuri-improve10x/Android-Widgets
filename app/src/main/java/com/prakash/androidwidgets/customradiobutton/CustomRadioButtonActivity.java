package com.prakash.androidwidgets.customradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.prakash.androidwidgets.R;
import com.prakash.androidwidgets.databinding.ActivityCustomRadioButtonBinding;

public class CustomRadioButtonActivity extends AppCompatActivity implements CustomRadioButtonView {
    private ActivityCustomRadioButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomRadioButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleShowGendar();
    }

    @Override
    public void handleShowGendar() {
        binding.showGendarBtn.setOnClickListener(view -> {
            if (binding.maleRb.isChecked()) {
                Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
            }
        });
    }
}