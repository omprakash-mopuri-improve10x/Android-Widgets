package com.prakash.androidwidgets.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity implements CheckBoxView {

    private ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOrder();
    }

    @Override
    public void handleOrder() {
        binding.orderBtn.setOnClickListener(view -> {
            String orderDetails = new CheckBoxControllerImpl().createOrderDetails(binding.pizzaCb.isChecked(),
                    binding.coffeeCb.isChecked(), binding.teaCb.isChecked());
            showToast(orderDetails);
        });
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}