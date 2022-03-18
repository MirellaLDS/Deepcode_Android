package com.domain.newbanking.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.domain.newbanking.R;
import com.domain.newbanking.databinding.FragmentHomeBinding;
import com.domain.newbanking.model.TransactionData;
import com.domain.newbanking.view.home.transaction.TransactionHolder;
import com.domain.newbanking.view.home.transaction.TransactionsAdapter;
import com.domain.newbanking.view.home.user.UserAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding viewBinding;
    private ArrayList<Integer> userList = new ArrayList<>();
    private ArrayList<TransactionData> transactionList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewBinding = FragmentHomeBinding.inflate(getLayoutInflater());
        return viewBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        userList.add(R.drawable.ic_apple_avatar_illness_sick_watch_icon);
        userList.add(R.drawable.ic_afro_avatar_male_man_icon);
        userList.add(R.drawable.ic_animal_avatar_bear_russian_icon);
        userList.add(R.drawable.ic_avatar_avocado_food_scream_icon);
        userList.add(R.drawable.ic_avatar_cacti_cactus_pirate_icon);
        userList.add(R.drawable.ic_avatar_bad_breaking_chemisrty_heisenberg_icon);

        TransactionData data = new TransactionData();
        data.setTitle("Title");
        data.setDate("12/12/2020");
        data.setValue("R$ 255,00");

        TransactionData data2 = new TransactionData();
        data.setTitle("Title");
        data.setDate("12/12/2020");
        data.setValue("R$ 255,00");
        transactionList.add(data);
        transactionList.add(data2);
        setupListView();
    }

    private void setupListView() {
        UserAdapter adapter = new UserAdapter(requireContext(), userList);
        viewBinding.lvLista.setAdapter(adapter);

        TransactionsAdapter transactionsAdapter = new TransactionsAdapter(requireContext(), transactionList);
        viewBinding.lvTransactions.setAdapter(transactionsAdapter);
    }
}