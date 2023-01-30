package com.prakash.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.prakash.androidwidgets.checkbox.CheckBoxActivity;
import com.prakash.androidwidgets.customradiobutton.CustomRadioButtonActivity;
import com.prakash.androidwidgets.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleButton();
        handleCustomToast();
        handleToggleButton();
        handleCheckBox();
        handleSpinner();
        handleAutoCompleteTextView();
        handleRatingBar();
        handleAlertDailog();
        handleDatePicker();
        handleTimePicker();
        handleRadioButton();
        handleSeekbar();
        handleScrollView();
        handleHorizontalScroll();
        handleListView();
        handleImageSwitcher();
        handleImageSlider();
        handleProgressDialog();
        handleWebView();
        handleCustomAlertDialog();
        handleSearchView();
        handleTextWatcher();
        handleSearchViewWithToolBar();
        handleMultiAutoCompleteTextView();
        handleViewStub();
        handleTabbedActivity();
        handleCustomCheckBox();
        handleCustomRadioBtn();
    }

    private void handleButton() {
        binding.buttonBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ButtonActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomToast() {
        binding.customToastBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomToastActivity.class);
            startActivity(intent);
        });
    }

    private void handleToggleButton() {
        binding.togBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ToggleButtonActivity.class);
            startActivity(intent);
        });
    }

    private void handleCheckBox() {
        binding.checkboxBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
    }

    private void handleSpinner() {
        binding.spinnerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        });
    }

    private void handleAutoCompleteTextView() {
        binding.autoCompleteBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AutoCompleteTextViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleRatingBar() {
        binding.ratingBarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RatingBarActivity.class);
            startActivity(intent);
        });
    }

    private void handleAlertDailog() {
        binding.alertDailogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AlertDailogActivity.class);
            startActivity(intent);
        });
    }

    private void handleDatePicker() {
        binding.datePickerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        });
    }

    private void handleTimePicker() {
        binding.timePickerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        });
    }

    private void handleRadioButton() {
        binding.radioBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RadioButtonsActivity.class);
            startActivity(intent);
        });
    }

    private void handleSeekbar() {
        binding.seekBarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SeekBarActivity.class);
            startActivity(intent);
        });
    }

    private void handleScrollView() {
        binding.scrollViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ScrollViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleHorizontalScroll() {
        binding.horiScrollViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, HorizontalScrollViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleListView() {
        binding.listViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleImageSwitcher() {
        binding.imageSwitcherBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ImageSwitcherActivity.class);
            startActivity(intent);
        });
    }

    private void handleImageSlider() {
        binding.imageSliderBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ImageSliderActivity.class);
            startActivity(intent);
        });
    }

    private void handleProgressDialog() {
        binding.progressDialogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ProgressDialogActivity.class);
            startActivity(intent);
        });
    }

    private void handleWebView() {
        binding.webViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, WebViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomAlertDialog() {
        binding.customAlertDialogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomAlertdialogActivity.class);
            startActivity(intent);
        });
    }

    private void handleSearchView() {
        binding.searchViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SearchViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleTextWatcher() {
        binding.textWatcherBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TextWatcherActivity.class);
            startActivity(intent);
        });
    }

    private void handleSearchViewWithToolBar() {
        binding.searchViewWithToolbarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SearchViewWithToolBarActivity.class);
            startActivity(intent);
        });
    }

    private void handleMultiAutoCompleteTextView() {
        binding.multiAutoCompleteTxtBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MultiAutoCompleteTextViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleViewStub() {
        binding.viewStubBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ViewStubActivity.class);
            startActivity(intent);
        });
    }

    private void handleTabbedActivity() {
        binding.tabbedActivityBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TabbedActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomCheckBox() {
        binding.customCheckBoxBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomCheckBoxActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomRadioBtn() {
        binding.customRadioBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomRadioButtonActivity.class);
            startActivity(intent);
        });
    }
}