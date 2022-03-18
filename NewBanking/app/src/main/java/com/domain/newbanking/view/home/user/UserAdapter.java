package com.domain.newbanking.view.home.user;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.domain.newbanking.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private ArrayList<Integer> res;

    public UserAdapter(Context context, ArrayList<Integer> res) {
        this.context = context;
        this.res = res;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_item_layout, parent, false);
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
