package com.example.athrv.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class quiz4 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        Bundle b=getIntent().getExtras();
        String s=b.getString("stuff");
        s=s+" Out of 3";
        //Toast.makeText(quiz4.this,s,Toast.LENGTH_LONG).show();
        tv=(TextView)findViewById(R.id.textView10);
        tv.setText(s);
    }
}
