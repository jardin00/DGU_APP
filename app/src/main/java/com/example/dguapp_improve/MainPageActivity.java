package com.example.dguapp_improve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainPageActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton buttonAll;
    private RadioButton buttonGeneral;
    private RadioButton buttonAcademics;
    private RadioButton buttonScholarship;
    private ImageView noticeImageView;

    private Button logout_o;
    private Button menu;

    private View setting;
    private View user_square;
    private View eclass_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        radioGroup = findViewById(R.id.radioGroup);
        noticeImageView = findViewById(R.id.noticeImageView);
        buttonAll = findViewById(R.id.buttonAll);
        buttonGeneral = findViewById(R.id.buttonGeneral);
        buttonAcademics = findViewById(R.id.buttonAcademics);
        buttonScholarship = findViewById(R.id.buttonScholarship);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // 선택된 라디오 버튼 처리
                RadioButton radioButton = findViewById(checkedId);
                if (radioButton == buttonAll) {
                    // "전체" 버튼 선택 시 동작
                    noticeImageView.setImageResource(R.drawable.notice_all);
                } else if (radioButton == buttonGeneral) {
                    // "일반" 버튼 선택 시 동작
                    noticeImageView.setImageResource(R.drawable.notice_general);
                } else if (radioButton == buttonAcademics) {
                    // "학사" 버튼 선택 시 동작
                    noticeImageView.setImageResource(R.drawable.notice_academic);
                } else if (radioButton == buttonScholarship) {
                    // "장학" 버튼 선택 시 동작
                    noticeImageView.setImageResource(R.drawable.notice_scholarship);
                }
            }
        });

        logout_o = findViewById(R.id.logout_o);
        logout_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 로그아웃 버튼 클릭 시 로그인 화면으로 이동
                Intent intent = new Intent(MainPageActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // 현재 화면 종료
            }
        });

        menu = findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 메뉴로 이동하는 코드 작성
                Intent intent = new Intent(MainPageActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        setting = findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPageActivity.this, Setting.class);
                startActivity(intent);
            }
        });

        user_square = findViewById(R.id.user_square);
        user_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPageActivity.this, StudentCard.class);
                startActivity(intent);
            }
        });

        eclass_button = findViewById(R.id.eclass_button);
        eclass_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPageActivity.this, Eclass.class);
                startActivity(intent);
            }
        });

    }
}
