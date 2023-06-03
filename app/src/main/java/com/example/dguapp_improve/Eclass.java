package com.example.dguapp_improve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Eclass extends AppCompatActivity {
    private View logout;
    private Button menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eclass);

        logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 로그아웃 버튼 클릭 시 로그인 화면으로 이동
                Intent intent = new Intent(Eclass.this, MainActivity.class);
                startActivity(intent);
                finish(); // 현재 화면 종료
            }
        });

        menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 메뉴로 이동하는 코드 작성
                Intent intent = new Intent(Eclass.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}