package com.hebun.private_social_app.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hebun.private_social_app.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter_Chats extends RecyclerView.Adapter<Adapter_Chats.ViewHolderC> {

    @NonNull
    @Override
    public ViewHolderC onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderC holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolderC extends RecyclerView.ViewHolder {
        CircleImageView chats_profile_image;
        TextView chats_name_text, chats_last_msg, chats_date;
        public ViewHolderC(@NonNull View itemView) {
            super(itemView);
            chats_date = itemView.findViewById(R.id.chats_date);
            chats_profile_image = itemView.findViewById(R.id.chats_profile_image);
            chats_name_text = itemView.findViewById(R.id.chats_name_text);
            chats_last_msg = itemView.findViewById(R.id.chats_last_msg);
        }
    }
}
