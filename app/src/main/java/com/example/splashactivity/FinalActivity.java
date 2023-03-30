package com.example.splashactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {
TextView t1;
    TextView t2;

    TextView t3;
    TextView t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        t1=findViewById(R.id.name);
        t2=findViewById(R.id.arid_no);
        t3=findViewById(R.id.email);
        t4=findViewById(R.id.Phone_no);
        String name=getIntent().getStringExtra("key1");
        String arid_no=getIntent().getStringExtra("key2");
        String email=getIntent().getStringExtra("key3");
        String phone=getIntent().getStringExtra("key4");
        t1.setText(name);
        t2.setText(arid_no);
        t3.setText(email);
        t4.setText(phone);
    }

}
