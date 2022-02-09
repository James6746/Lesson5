package com.example.lesson4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Task3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        EditText userId = findViewById(R.id.user_id);
        EditText userPw = findViewById(R.id.user_pw);

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), userId.getText() + "\n" + userPw.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        /*

    =====================KOTLIN==============================================================================================


        val userId: EditText = findViewById(R.id.user_id)
        val userPw: EditText = findViewById(R.id.user_pw)

        findViewById(R.id.login).setOnClickListener(object : OnClickListener() {
        fun onClick(view: View?) {
            Toast.makeText(getApplicationContext(), userId.getText() + "\n" + userPw.getText(), Toast.LENGTH_SHORT).show()
        }
    })
    ========================================================================================================================
    */

    }
}

