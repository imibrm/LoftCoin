package com.imibragimov.loftcoin.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.imibragimov.loftcoin.R;

public class WelcomeActivity extends AppCompatActivity {

    static final String KEY_SHOW_WELCOME = "show_welcome";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
}
