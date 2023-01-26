package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    private ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOrder();
    }

    private void handleOrder() {
        binding.orderBtn.setOnClickListener(view -> {
            boolean isPizzaSelected = binding.pizzaCb.isChecked();
            boolean isCoffeeSelected = binding.coffeeCb.isChecked();
            boolean isTeaSelected = binding.teaCb.isChecked();
            String orderDetails = createOrder(isPizzaSelected, isCoffeeSelected, isTeaSelected);
            Toast.makeText(this, orderDetails, Toast.LENGTH_SHORT).show();
        });
    }

    private String createOrder(boolean pizza, boolean coffee, boolean tea) {
        int totalAmount = 0;
        String orderDetails = "Selected Items:";
        if (pizza) {
            totalAmount += 100;
            orderDetails += "\nPizza Rs.100";
        }
        if (coffee) {
            totalAmount += 50;
            orderDetails += "\nCoffe Rs.50";
        }
        if (tea) {
            totalAmount += 25;
            orderDetails += "\nTea Rs.25";
        }
        orderDetails += "\nTotal Rs: " + totalAmount;
        return orderDetails;
    }
}