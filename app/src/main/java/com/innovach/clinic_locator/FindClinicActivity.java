package com.innovach.clinic_locator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FindClinicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_clinic);
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView) findViewById(R.id.TVusername);
        tv.setText(username);
    }
}
