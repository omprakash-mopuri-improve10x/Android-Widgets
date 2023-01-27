package com.prakash.androidwidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.prakash.androidwidgets.databinding.ActivityImageSwitcherBinding;

public class ImageSwitcherActivity extends AppCompatActivity {

    private ActivityImageSwitcherBinding binding;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSwitcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleImageSwitcher();
        handleNext();
    }

    private void handleImageSwitcher() {
        binding.imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
                ));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(R.drawable.back);
                return imageView;
            }
        });
    }

    private void handleNext() {
        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        binding.imageSwitcher.setOutAnimation(aniOut);
        binding.imageSwitcher.setInAnimation(aniIn);
        binding.nextBtn.setOnClickListener(view -> {
            setImages();
        });
    }

    private void setImages() {
        int[] imageSwitcherImages = {R.drawable.back, R.drawable.dasara, R.drawable.download, R.drawable.right};
        if (count < imageSwitcherImages.length) {
            if (count == imageSwitcherImages.length - 1) {
                count = 0;
                binding.imageSwitcher.setImageResource(imageSwitcherImages[count]);
            } else {
                count++;
                binding.imageSwitcher.setImageResource(imageSwitcherImages[count]);
            }
        }
    }
}