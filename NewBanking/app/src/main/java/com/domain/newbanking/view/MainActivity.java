package com.domain.newbanking.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.domain.newbanking.R;
import com.domain.newbanking.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewbind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewbind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewbind.getRoot());
        setSupportActionBar(viewbind.tbBarra);

    }

}