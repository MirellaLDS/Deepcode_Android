package com.domain.newbanking.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.domain.newbanking.R;
import com.domain.newbanking.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewbind;
    private ArrayList<Integer> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewbind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewbind.getRoot());
        setSupportActionBar(viewbind.tbBarra);

        userList.add(R.drawable.ic_apple_avatar_illness_sick_watch_icon);
        userList.add(R.drawable.ic_afro_avatar_male_man_icon);
        userList.add(R.drawable.ic_animal_avatar_bear_russian_icon);
        userList.add(R.drawable.ic_avatar_avocado_food_scream_icon);
        userList.add(R.drawable.ic_avatar_cacti_cactus_pirate_icon);
        userList.add(R.drawable.ic_avatar_bad_breaking_chemisrty_heisenberg_icon);
        setupListView();
    }

    private void setupListView() {
        UserAdapter adapter = new UserAdapter(this, userList);
        viewbind.lvLista.setAdapter(adapter);
    }
}