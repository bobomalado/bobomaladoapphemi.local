package com.example.my_project_android_end.Controler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.my_project_android_end.Model.Questionnent;
import com.example.my_project_android_end.R;

public class PresentationActivity extends AppCompatActivity {

    private Button btn_commencer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);

        btn_commencer=findViewById(R.id.btn_commrncer);
        btn_commencer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PresentationActivity.this, MenuActivity2.class);
            }
        });
    }
}