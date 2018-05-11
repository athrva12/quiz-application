package com.example.athrv.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class quiz3 extends AppCompatActivity {
    RadioGroup rg;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        rg=(RadioGroup)findViewById(R.id.radiogrp3);
        Bundle b=getIntent().getExtras();
        String s=b.getString("stuf");

        score=score+Integer.parseInt(s);

        //Toast.makeText(quiz3.this,"scor"+s,Toast.LENGTH_LONG).show();

        rg.clearCheck();
        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(quiz3.this,quiz4.class);

                RadioButton rb=(RadioButton)v;
                if(rb.getText().toString().equals("Steve Smith"))
                {
                    score=score+1;
                    String a=Integer.toString(score);
                    it.putExtra("stuff",a);



                }else
                {

                    String a=Integer.toString(score);

                    it.putExtra("stuff",a);
                }
                startActivity(it);

            }
        };
        RadioButton rb1 =(RadioButton)findViewById(R.id.radioButton7);
        RadioButton rb2 =(RadioButton)findViewById(R.id.radioButton8);
        RadioButton rb3 =(RadioButton)findViewById(R.id.radioButton12);
        rb1.setOnClickListener(listener);
        rb2.setOnClickListener(listener);
        rb3.setOnClickListener(listener);


    }
}
