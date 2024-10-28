package com.hebun.private_social_app.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter_Home_Page extends RecyclerView.Adapter<Adapter_Home_Page.ViewHolderHP> {

    @NonNull
    @Override
    public ViewHolderHP onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHP holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolderHP extends RecyclerView.ViewHolder {
        public ViewHolderHP(@NonNull View itemView) {
            super(itemView);
        }
    }
}
