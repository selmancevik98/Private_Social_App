package com.hebun.private_social_app.messages;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.hebun.private_social_app.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class Messages extends AppCompatActivity {
    CircleImageView msg_profile_img;
    TextView msg_username_txt;
    ImageView msg_voice_btn, msg_cam_btn, msg_menu_btn, msg_add_img_btn, msg_send_btn;
    EditText msg_edittext;
    RecyclerView rv_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_messages);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        definitions();
    }

    private void definitions() {
        msg_edittext = findViewById(R.id.msg_edittext);
        msg_cam_btn = findViewById(R.id.msg_cam_btn);
        msg_profile_img = findViewById(R.id.msg_profile_img);
        msg_username_txt = findViewById(R.id.msg_username_txt);
        msg_voice_btn = findViewById(R.id.msg_voice_btn);
        rv_msg = findViewById(R.id.rv_msg);
        msg_menu_btn = findViewById(R.id.msg_menu_btn);
        msg_add_img_btn = findViewById(R.id.msg_add_img_btn);
        msg_send_btn = findViewById(R.id.msg_send_btn);
    }
}