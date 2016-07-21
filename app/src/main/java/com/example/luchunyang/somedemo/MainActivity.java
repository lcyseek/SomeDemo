package com.example.luchunyang.somedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void screen(View view) {
        Intent intent = new Intent(this,ScreenActiviy.class);
        startActivity(intent);
    }
}
