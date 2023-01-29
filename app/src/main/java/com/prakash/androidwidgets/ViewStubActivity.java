package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.prakash.androidwidgets.databinding.ActivityViewStubBinding;

public class ViewStubActivity extends AppCompatActivity {

    private ActivityViewStubBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewStubBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setViewStub();
        handleShow();
        handleHide();
    }

    private void setViewStub() {
        binding.viewStub.inflate();
    }

    private void handleShow() {
        binding.showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.viewStub.setVisibility(View.VISIBLE);
            }
        });
    }

    private void handleHide() {
        binding.hideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.viewStub.setVisibility(View.GONE);
            }
        });
    }
}