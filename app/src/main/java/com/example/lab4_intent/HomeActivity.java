package com.example.lab4_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView tvWelcome;
    Button btnLogout; // Khai báo thêm nút Đăng xuất

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvWelcome = findViewById(R.id.tvWelcome);
        btnLogout = findViewById(R.id.btnLogout); // Ánh xạ nút Đăng xuất

        // Nhận dữ liệu Username từ Login gửi sang
        Intent intent = getIntent();
        String nhanUsername = intent.getStringExtra("KEY_USERNAME");

        if (nhanUsername != null) {
            tvWelcome.setText("Xin chào, " + nhanUsername);
        }

        // Bắt sự kiện khi bấm nút Đăng xuất
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đóng màn hình hiện tại (HomeActivity) để quay về màn hình trước đó (LoginActivity)
                finish();
            }
        });
    }
}