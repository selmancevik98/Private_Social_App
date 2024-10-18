package com.hebun.private_social_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText login_mail_edittext, login_password_edittext;
    TextView login_forgot_password, login_signup_redirect;
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        definitions();
    }

    private void definitions() {
        login_mail_edittext = findViewById(R.id.login_mail_edittext);
        login_password_edittext = findViewById(R.id.login_password_edittext);
        login_forgot_password = findViewById(R.id.login_forgot_password);
        login_signup_redirect = findViewById(R.id.login_signup_redirect);
        login_btn = findViewById(R.id.login_btn);
    }
}