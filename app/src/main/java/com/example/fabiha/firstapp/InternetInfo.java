package com.example.fabiha.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InternetInfo extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_info);
        //initially editexts & button
        ed1 = findViewById(R.id.name);
        ed2 = findViewById(R.id.Email);
        ed3  = findViewById(R.id.hometown);
        Submit = findViewById(R.id.Submit);
        //adding button pressing functionally
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nametext, Emailtext, hometext;

                nametext = ed1.getText().toString();
                Emailtext = ed2.getText().toString();
                hometext = ed3.getText().toString();

                Intent intent = new Intent(InternetInfo.this,internetview.class);
                intent.putExtra("NAME_TAG",nametext);
                intent.putExtra("Email_TAG",Emailtext);
                intent.putExtra("home_TAG",hometext);
                startActivity(intent);

            }
        });
    }
}
