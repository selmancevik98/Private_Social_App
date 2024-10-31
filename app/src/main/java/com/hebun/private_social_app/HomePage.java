package com.hebun.private_social_app;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hebun.private_social_app.fragments.Fragment_Add_Share;
import com.hebun.private_social_app.fragments.Fragment_Chats;
import com.hebun.private_social_app.fragments.Fragment_Home_Page;
import com.hebun.private_social_app.fragments.Fragment_Profile;
import com.hebun.private_social_app.fragments.Fragment_Search;

public class HomePage extends AppCompatActivity {
    FrameLayout fragment_container;
    BottomNavigationView bv_bar;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        definitions();
        fragment_page_change();
    }

    private void definitions () {
        bv_bar = findViewById(R.id.bv_bar);
        fragment_container = findViewById(R.id.fragment_container);
    }

    public void fragment_page_change () {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new Fragment_Home_Page()).commit();
        bv_bar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home_item) {
                    fragment = new Fragment_Home_Page();
                }

                if (item.getItemId() == R.id.search_item) {
                    fragment = new Fragment_Search();
                }

                if (item.getItemId() == R.id.add_share_item) {
                    fragment = new Fragment_Add_Share();
                }

                if (item.getItemId() == R.id.chats_item) {
                    fragment = new Fragment_Chats();
                }

                if (item.getItemId() == R.id.profile_item) {
                    fragment = new Fragment_Profile();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                return true;
            }
        });
    }
}