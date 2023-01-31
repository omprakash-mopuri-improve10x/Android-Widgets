package com.prakash.androidwidgets.imageswitcher;

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

import com.prakash.androidwidgets.R;
import com.prakash.androidwidgets.databinding.ActivityImageSwitcherBinding;

public class ImageSwitcherActivity extends AppCompatActivity implements ImageSwitcherView {

    private ActivityImageSwitcherBinding binding;
    private int[] imageSwitcherImages = {R.drawable.back, R.drawable.dasara, R.drawable.download, R.drawable.right};
    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSwitcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showImage(R.drawable.back);
        handleNext();
    }

    @Override
    public void showImage(int resourceId) {
        binding.imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
                ));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(resourceId);
                return imageView;
            }
        });
    }

    @Override
    public void handleNext() {
        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        binding.imageSwitcher.setOutAnimation(aniOut);
        binding.imageSwitcher.setInAnimation(aniIn);
        binding.nextBtn.setOnClickListener(view -> {
            currentImageIndex = new ImageSwitcherImpl().getNextImageIndex(currentImageIndex, imageSwitcherImages.length);
            binding.imageSwitcher.setImageResource(imageSwitcherImages[currentImageIndex]);
        });
    }
}