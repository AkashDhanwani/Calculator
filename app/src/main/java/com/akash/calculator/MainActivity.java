package com.akash.calculator;

import android.content.pm.ActivityInfo;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etNumber1,etNumber2;
    Button btnAdd,btnSubtract,btnMultiply,btnDivide;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        setRequestedOrientation(orientation);

        etNumber1 = (EditText) findViewById(R.id.etNumber1);
        etNumber2 = (EditText) findViewById(R.id.etNumber2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
                                        
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(etNumber1.getText().toString().length() == 0 || etNumber2.getText().toString().length() == 0) {
            Toast.makeText(this, "Enter proper Numbers", Toast.LENGTH_LONG).show();
            etNumber1.requestFocus();
            return;
        }
        double num1 = Double.parseDouble(etNumber1.getText().toString());
        double num2 = Double.parseDouble(etNumber2.getText().toString());
        switch(v.getId())
        {
            case R.id.btnAdd:
                Toast.makeText(MainActivity.this, ""+(num1+num2), Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnSubtract:
                Toast.makeText(MainActivity.this, ""+(num1-num2), Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnMultiply:
                Toast.makeText(MainActivity.this, ""+num1*num2, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnDivide:
                Toast.makeText(MainActivity.this, ""+num1/num2, Toast.LENGTH_SHORT).show();
        }

    }

}
