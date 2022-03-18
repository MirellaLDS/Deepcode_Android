package com.domain.newbanking.view.home.user;

import android.view.View;
import android.widget.ImageView;

import com.domain.newbanking.R;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    private final ImageView imageView;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivUser);
    }

    public ImageView getImageView() {
        return imageView;
    }
}
