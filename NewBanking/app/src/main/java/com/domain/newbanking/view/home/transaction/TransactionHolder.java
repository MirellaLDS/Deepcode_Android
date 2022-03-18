package com.domain.newbanking.view.home.transaction;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.domain.newbanking.R;

public class TransactionHolder extends RecyclerView.ViewHolder {

    private ImageView userImage;
    private TextView title;
    private TextView balance;
    private TextView date;

    public TransactionHolder(@NonNull View itemView) {
        super(itemView);
        userImage = itemView.findViewById(R.id.ivFriendUserImage);
        title = itemView.findViewById(R.id.tvFriendUserName);
        balance = itemView.findViewById(R.id.tvBalanceValue);
        date = itemView.findViewById(R.id.tvCardDescription);
    }

    public ImageView getUserImage() {
        return userImage;
    }

    public TextView getTitle() {
        return title;
    }

    public TextView getBalance() {
        return balance;
    }

    public TextView getDate() {
        return date;
    }
}
