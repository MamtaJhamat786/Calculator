package com.example.calculatorfuctions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNumEditText= (EditText) findViewById(R.id.firstNumEditText);
        final EditText secondNumEditText= (EditText) findViewById(R.id.secondNumEditText);
        final TextView textView=(TextView) findViewById(R.id.textView);

        Button addButton =(Button) findViewById(R.id.addButton);
        Button subtractButton=(Button) findViewById(R.id.subtractButton);
        Button multiplyButton=(Button) findViewById(R.id.multiplyButton);
        Button divideButton=(Button) findViewById(R.id.divideButton);
        Button powerButton=(Button) findViewById(R.id.powerButton);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(firstNumEditText.getText().toString());
                int num2=Integer.parseInt(secondNumEditText.getText().toString());
                int result= num1+num2;
                textView.setText(result+ " ");
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(firstNumEditText.getText().toString());
                int num2=Integer.parseInt(secondNumEditText.getText().toString());
                int result= num1-num2;
                textView.setText(result+ " ");
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(firstNumEditText.getText().toString());
                int num2=Integer.parseInt(secondNumEditText.getText().toString());
                int result= num1 * num2;
                textView.setText(result+ " ");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(firstNumEditText.getText().toString());
                int num2=Integer.parseInt(secondNumEditText.getText().toString());
                int result= num1/num2;
                textView.setText(result+ " ");
            }
        });
        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(firstNumEditText.getText().toString());
                int num2=Integer.parseInt(secondNumEditText.getText().toString());
                double result= Math.pow(num1,num2);
                textView.setText(result+ " ");
            }
        });



    }

}
