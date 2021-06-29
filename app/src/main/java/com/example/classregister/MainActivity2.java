package com.example.classregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button AboutApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AboutApp = (Button) findViewById(R.id.btnAboutApp);
        AboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutIntent =  new Intent(MainActivity2.this, AboutApp.class);
                startActivity(aboutIntent);
                Toast.makeText(MainActivity2.this, "Successfully Logged in", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setContentView(int activity_main2) {
    }
}