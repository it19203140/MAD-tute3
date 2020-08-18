package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER1= "com.example.intentsproj.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2= "com.example.intentsproj.EXTRA_NUMBER2";
    private Button btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //view object as customtoast.xml
        final View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        btnOk = (Button) findViewById(R.id.okBtn);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setView(layout);
                toast.show();

                toast.show();
                sendNumbers();
                SecondActivity();
            }
        });
        

    }

    private void SecondActivity() {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }

    public void sendNumbers() {
        Intent intent = new Intent (this, SecondActivity.class);
        EditText editTextNo1 = (EditText) findViewById(R.id.editTextNo1);
        EditText editTextNo2 = (EditText) findViewById(R.id.editTextNo2);
        int intNumber1 = Integer.parseInt(editTextNo1.toString());
        int intNumber2 = Integer.parseInt(editTextNo2.toString());
        intent.putExtra(EXTRA_NUMBER1,intNumber1);
        intent.putExtra(EXTRA_NUMBER2,intNumber2);
    }
}