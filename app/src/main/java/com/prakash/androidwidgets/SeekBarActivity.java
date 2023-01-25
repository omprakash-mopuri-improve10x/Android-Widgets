package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import com.prakash.androidwidgets.databinding.ActivitySeekBarBinding;

public class SeekBarActivity extends AppCompatActivity {
    
    private ActivitySeekBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeekBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleSeekBar();
    }

    private void handleSeekBar() {
        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(SeekBarActivity.this, "Seek Bar progress : " + i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "Started", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "Stop touch", Toast.LENGTH_SHORT).show();
            }
        });
    }
}