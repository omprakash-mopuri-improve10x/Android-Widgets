package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivityRatingBarBinding;

public class RatingBarActivity extends AppCompatActivity {

    private ActivityRatingBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleRatingBar();
    }

    private void handleRatingBar() {
        binding.submitBtn.setOnClickListener(view -> {
            float rating = binding.ratingBar.getRating();
            Toast.makeText(this, "Rating : " + rating, Toast.LENGTH_SHORT).show();
        });
    }
}