package com.hebun.private_social_app.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hebun.private_social_app.R;
import com.hebun.private_social_app.models.Model_Search;

import java.util.List;

public class Adapter_Search extends RecyclerView.Adapter<Adapter_Search.ViewHolderS> {
    List<Model_Search> search_list;
    Context context;
    Activity activity;

    public Adapter_Search(List<Model_Search> search_list, Context context, Activity activity) {
        this.search_list = search_list;
        this.context = context;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolderS onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_adapter_search, parent, false);
        return new ViewHolderS(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderS holder, int position) {

    }

    @Override
    public int getItemCount() {
        return search_list.size();
    }

    public static class ViewHolderS extends RecyclerView.ViewHolder {
        public ViewHolderS(@NonNull View itemView) {
            super(itemView);
        }
    }
}
