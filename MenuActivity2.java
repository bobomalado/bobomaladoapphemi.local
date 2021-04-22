package com.example.my_project_android_end.Controler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.my_project_android_end.Model.Questionnent;
import com.example.my_project_android_end.R;

public class MenuActivity2 extends AppCompatActivity {

    private Button tester;
    private Button resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        tester=findViewById(R.id.btn_test);
        tester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity2.this, Questionnent.class);
            }
        });
        resultat=findViewById(R.id.btn_resultat);
        resultat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity2.this,ResultatActivity .class);
            }
        });
    }
}