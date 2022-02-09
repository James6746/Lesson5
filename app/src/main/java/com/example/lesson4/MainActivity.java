package com.example.lesson4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Task1(View view) {

        Intent intent = new Intent(getApplicationContext(), Task1.class);
        startActivity(intent);
    }

    public void Task2(View view) {
        Intent intent = new Intent(getApplicationContext(), Task2.class);
        startActivity(intent);
    }

    public void Task3(View view) {
        Intent intent = new Intent(getApplicationContext(), Task3.class);
        startActivity(intent);
    }

    public void Task4(View view) {
        Intent intent = new Intent(getApplicationContext(), Task4.class);
        startActivity(intent);
    }
}