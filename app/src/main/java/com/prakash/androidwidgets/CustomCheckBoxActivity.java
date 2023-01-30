package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityCustomCheckBoxBinding;

public class CustomCheckBoxActivity extends AppCompatActivity {

    private ActivityCustomCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOrder();
    }

    private void handleOrder() {
        binding.orderBtn.setOnClickListener(view -> {
            if (binding.checkBox1.isChecked() && binding.checkBox2.isChecked()){
                Toast.makeText(this, "Check box1, Check box2", Toast.LENGTH_SHORT).show();
            } else if (binding.checkBox1.isChecked()) {
                Toast.makeText(this, "Check Box1", Toast.LENGTH_SHORT).show();
            } else if (binding.checkBox2.isChecked()){
                Toast.makeText(this, "Check Box2", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Nothing Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}