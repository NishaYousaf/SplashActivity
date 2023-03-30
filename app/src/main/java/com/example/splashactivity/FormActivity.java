package com.example.splashactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
private Button button;
EditText name;
EditText arid_no;

EditText email;
EditText Phone_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        name=findViewById(R.id.name);
        arid_no=findViewById(R.id.arid_no);
        email=findViewById(R.id.email);
        Phone_no=findViewById(R.id.Phone_no);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String NAME=name.getText().toString();
                String ARID_NO=arid_no.getText().toString();
                String EMAIL=email.getText().toString();
                String PHONE=Phone_no.getText().toString();
                Uri n=Uri.parse(NAME);
                Uri a=Uri.parse(ARID_NO);
                Uri e=Uri.parse(EMAIL);
                Uri p=Uri.parse(PHONE);
                Intent intent=new Intent(FormActivity.this,FinalActivity.class);
                intent.putExtra("key1",NAME);
                intent.putExtra("key2",ARID_NO);
                intent.putExtra("key3",EMAIL);
                intent.putExtra("key4",PHONE);
                startActivity(intent);



            }
        });
    }
}