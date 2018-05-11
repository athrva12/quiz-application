package com.example.athrv.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class quiz extends AppCompatActivity {
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        rg=(RadioGroup)findViewById(R.id.radiogrp);
        rg.clearCheck();
        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(quiz.this,quiz2.class);

                RadioButton rb=(RadioButton)v;
                if(rb.getText().toString().equals("Mumbai indians"))
                {
                    String c="1";
                    it.putExtra("stuff",c);


                }else
                {
                    String c="0";
                    it.putExtra("stuff",c);

                }startActivity(it);


            }
        };
        RadioButton rb1 =(RadioButton)findViewById(R.id.radioButton3);
        RadioButton rb2 =(RadioButton)findViewById(R.id.radioButton4);
        RadioButton rb3 =(RadioButton)findViewById(R.id.radioButton10);

        rb1.setOnClickListener(listener);
        rb2.setOnClickListener(listener);
        rb3.setOnClickListener(listener);

    }
}
