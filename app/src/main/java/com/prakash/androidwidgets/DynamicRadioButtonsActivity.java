package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DynamicRadioButtonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_radio_buttons);
        setupRadioButtons();
    }

    private void setupRadioButtons() {
        RadioGroup radioGroup = new RadioGroup(this);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        RadioButton radioButton1 = new RadioButton(this);
        RadioButton radioButton2 = new RadioButton(this);
        radioButton1.setText("Male");
        radioButton2.setText("Female");
        radioGroup.addView(radioButton1);
        radioGroup.addView(radioButton2);
        radioGroup.setOrientation(RadioGroup.VERTICAL);
        ConstraintLayout.LayoutParams  params = new ConstraintLayout.LayoutParams(RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.MATCH_PARENT);
        params.leftMargin = 150;
        params.rightMargin = 100;
        radioGroup.setLayoutParams(params);
        constraintLayout.addView(radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = (RadioButton) findViewById(i);
                Toast.makeText(getApplicationContext(), radioButton.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}