package com.example.dguapp_improve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StudentCard extends AppCompatActivity {

    private Button logout_o;
    private Button menu;

    private View setting;
    private View user_square;
    private View home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_card);

        logout_o = findViewById(R.id.logout_o);
        logout_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 로그아웃 버튼 클릭 시 로그인 화면으로 이동
                Intent intent = new Intent(StudentCard.this, MainActivity.class);
                startActivity(intent);
                finish(); // 현재 화면 종료
            }
        });
        menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 메뉴로 이동하는 코드 작성
                Intent intent = new Intent(StudentCard.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        setting = findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentCard.this, Setting.class);
                startActivity(intent);
            }
        });

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentCard.this, MainPageActivity.class);
                startActivity(intent);
            }
        });
    }

}