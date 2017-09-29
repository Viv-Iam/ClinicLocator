package com.innovach.clinic_locator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.Btnlogin);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText a = (EditText) findViewById(R.id.TFusername);
                String str = a.getText().toString();
               Intent i = new Intent(MainActivity.this, FindClinicActivity.class);
                i.putExtra("Username", str);
                startActivity(i);
            }
        });

//    public void onButtonClick(View v) {
//
//    }
}
}