package com.example.athrv.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class quiz2 extends AppCompatActivity {
    RadioGroup rg;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        rg=(RadioGroup)findViewById(R.id.radiogrp2);
        Bundle b=getIntent().getExtras();
        String s=b.getString("stuff");
        score=score+Integer.parseInt(s);

        // Toast.makeText(quiz2.this,"score"+score,Toast.LENGTH_LONG).show();
        rg.clearCheck();
        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(quiz2.this,quiz3.class);

                RadioButton rb=(RadioButton)v;
                if(rb.getText().toString().equals("Mumbai indians"))
                {
                    score=score+1;
                    String a=Integer.toString(score);
                    it.putExtra("stuf",a);

                }else
                {
                    String a=Integer.toString(score);
                    it.putExtra("stuf",a);
                }
                startActivity(it);

            }
        };
        RadioButton rb1 =(RadioButton)findViewById(R.id.radioButton5);
        RadioButton rb2 =(RadioButton)findViewById(R.id.radioButton6);
        RadioButton rb3 =(RadioButton)findViewById(R.id.radioButton11);
        rb3.setOnClickListener(listener);

        rb1.setOnClickListener(listener);
        rb2.setOnClickListener(listener);


    }
}
