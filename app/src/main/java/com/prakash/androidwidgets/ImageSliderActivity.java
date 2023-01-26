package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.prakash.androidwidgets.databinding.ActivityImageSliderBinding;

public class ImageSliderActivity extends AppCompatActivity {

    private ActivityImageSliderBinding binding;
    private ImageAdapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSliderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleImageSlider();
    }

    private void handleImageSlider() {
        imageAdapter = new ImageAdapter(this);
        binding.viewPager.setAdapter(imageAdapter);
    }
}