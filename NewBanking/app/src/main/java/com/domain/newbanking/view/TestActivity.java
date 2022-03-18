package com.domain.newbanking.view;

import android.os.Bundle;

import com.domain.newbanking.R;
import com.domain.newbanking.commons.Utils;
import com.domain.newbanking.databinding.TelaGrandeBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    private TelaGrandeBinding viewbind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewbind = TelaGrandeBinding.inflate(getLayoutInflater());
        setContentView(viewbind.getRoot());

        Utils.setColorShape(viewbind.ivTest, getColor(R.color.cerdt_card));

    }
}
