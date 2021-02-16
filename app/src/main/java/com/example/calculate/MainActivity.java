package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addclick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        try{int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            result.setText(Integer.toString(n1+n2));}catch(NumberFormatException e){
            result.setText("숫자를 입력하세요");
        }
    }
    public void subtractclick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        try{int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            result.setText(Integer.toString(n1-n2));}catch(NumberFormatException e){
            result.setText("숫자를 입력하세요");
        }
    }
    public void multiplyclick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        try{int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            result.setText(Integer.toString(n1*n2));}catch(NumberFormatException e){
            result.setText("숫자를 입력하세요");
        }

        }
    public void divideclick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);
        try{int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            result.setText(Integer.toString(n1/n2));}catch(NumberFormatException e){
            result.setText("숫자를 입력하세요");
        }
    }

}

