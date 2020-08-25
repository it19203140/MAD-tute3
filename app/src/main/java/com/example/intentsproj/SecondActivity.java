package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int number1 = intent.getIntExtra(MainActivity.EXTRA_NUMBER1,0);
        int number2 = intent.getIntExtra(MainActivity.EXTRA_NUMBER2,0);

        EditText textView1 = findViewById(R.id.editTextNo12);
        EditText textView2 = findViewById(R.id.editTextNo22);

        textView1.setText(R.string.number1);
        textView2.setText(R.string.number2);
    }
}