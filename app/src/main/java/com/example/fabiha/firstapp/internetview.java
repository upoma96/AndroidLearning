package com.example.fabiha.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class internetview extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internetview);
        t1 = findViewById(R.id.text);

        Bundle b = getIntent().getExtras();
        if (b != null)
        {
            String name,email,home;
            name= b.getString("NAME_TAG");
            email= b.getString("Email_TAG");
            home=b.getString("home_TAG");

            t1.setText("Hello, "+name+
                   ".Your email Address is "+email+
                    "& Your home town is "+home);
        }
    }
}
