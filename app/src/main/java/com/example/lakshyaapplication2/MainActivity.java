package com.example.lakshyaapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNum1,etNum2,etNumSquare;
    TextView tvResult,tvSquare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        tvResult = findViewById(R.id.tvResult);
        tvSquare = findViewById(R.id.tvSquare);
        etNumSquare = findViewById(R.id.etNumSquare);
    }
    public void add(View v){
        //Read data from textField
        String num1= etNum1.getText().toString();
        String num2= etNum2.getText().toString();
        //Convert to int from string for computation
        int res= Integer.parseInt(num1) + Integer.parseInt(num2);
        //Display result
        tvResult.setText("Result : "+res);
    }
    public void subtract(View v){
        //Read data from textField
        String num1= etNum1.getText().toString();
        String num2= etNum2.getText().toString();
        //Convert to int from string for computation
        int res= Integer.parseInt(num1) - Integer.parseInt(num2);
        //Display result
        tvResult.setText("Result : "+res);
    }
    public void multiply(View v){
        //Read data from textField
        String num1= etNum1.getText().toString();
        String num2= etNum2.getText().toString();
        //Convert to int from string for computation
        int res= Integer.parseInt(num1) * Integer.parseInt(num2);
        //Display result
        tvResult.setText("Result : "+res);
    }
    public void divide(View v){
        //Read data from textField
        String num1= etNum1.getText().toString();
        String num2= etNum2.getText().toString();
        //Convert to int from string for computation
        int res= Integer.parseInt(num1) / Integer.parseInt(num2);
        //Display result
        tvResult.setText("Result : "+res);
    }

    public void square(View v){
        //Read data from textField
        String num= etNumSquare.getText().toString();
        //Convert to int from string for computation
        int res= Integer.parseInt(num) * Integer.parseInt(num);
        //Display result
        tvSquare.setText("Square : "+res);
    }
    public void cube(View v){
        //Read data from textField
        String num= etNumSquare.getText().toString();
        //Convert to int from string for computation
        int res= Integer.parseInt(num) * Integer.parseInt(num) * Integer.parseInt(num);
        //Display result
        tvSquare.setText("Cube : "+res);
    }

}