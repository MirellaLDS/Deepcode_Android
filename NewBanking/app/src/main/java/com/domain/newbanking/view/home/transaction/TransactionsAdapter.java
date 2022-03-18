package com.domain.newbanking.view.home.transaction;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.domain.newbanking.R;
import com.domain.newbanking.model.TransactionData;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TransactionsAdapter extends RecyclerView.Adapter<TransactionHolder> {
    private Context context;
    private ArrayList<TransactionData> data;

    public TransactionsAdapter(Context context, ArrayList<TransactionData> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public TransactionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_bank_transactions_layout, parent, false);
        return new TransactionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionHolder holder, int position) {
        TransactionData transactionData = data.get(position);
        holder.getTitle().setText(transactionData.getTitle());
        holder.getDate().setText(transactionData.getDate());
        holder.getBalance().setText(transactionData.getValue());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
