package com.hebun.private_social_app.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hebun.private_social_app.models.Model_Shares;

import java.util.List;

public class Adapter_Home_Page extends RecyclerView.Adapter<Adapter_Home_Page.ViewHolderHP> {
    List<Model_Shares> shares_list;
    Context context;
    Activity activity;

    public Adapter_Home_Page(List<Model_Shares> shares_list, Context context, Activity activity) {
        this.shares_list = shares_list;
        this.context = context;
        this.activity = activity;
    }

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
        return shares_list.size();
    }

    public static class ViewHolderHP extends RecyclerView.ViewHolder {
        public ViewHolderHP(@NonNull View itemView) {
            super(itemView);
        }
    }
}
