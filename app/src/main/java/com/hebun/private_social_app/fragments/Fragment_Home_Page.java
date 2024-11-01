package com.hebun.private_social_app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hebun.private_social_app.R;
import com.hebun.private_social_app.adapters.Adapter_Home_Page;
import com.hebun.private_social_app.models.Model_Shares;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Home_Page extends Fragment {
    List<Model_Shares> shares_list = new ArrayList<>();
    Adapter_Home_Page adapterHomePage;
    RecyclerView rv_home_shares;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_home_page, container, false);
        definitions(view);
        return view;
    }

    private void definitions(View view) {
        rv_home_shares = view.findViewById(R.id.rv_home_shares);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
        rv_home_shares.setLayoutManager(manager);
        adapterHomePage = new Adapter_Home_Page(shares_list, getContext(), getActivity());
        rv_home_shares.setAdapter(adapterHomePage);
    }
}
