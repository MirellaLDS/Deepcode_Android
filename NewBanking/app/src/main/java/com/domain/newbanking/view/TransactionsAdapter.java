package com.domain.newbanking.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.domain.newbanking.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TransactionsAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private ArrayList<Integer> res;

    public TransactionsAdapter(Context context, ArrayList<Integer> res) {
        this.context = context;
        this.res = res;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_bank_transactions_layout, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        ImageView imageView = holder.getImageView();
        imageView.setImageResource(res.get(position));
    }

    @Override
    public int getItemCount() {
        return res.size();
    }
}
