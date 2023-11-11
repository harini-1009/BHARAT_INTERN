package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
EditText et1,et2;
TextView tv2;
Button add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName2);
        tv2=findViewById(R.id.textView2);
        add=findViewById(R.id.button);
        sub=findViewById(R.id.button2);
        mul=findViewById(R.id.button3);
        div=findViewById(R.id.button4);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a1=Double.parseDouble(et1.getText().toString());
                double a2=Double.parseDouble(et2.getText().toString());
                double result=a1+a2;
                tv2.setText(Double.toString(result));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a1=Double.parseDouble(et1.getText().toString());
                double a2=Double.parseDouble(et2.getText().toString());
                double result=a1-a2;
                tv2.setText(Double.toString(result));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a1=Double.parseDouble(et1.getText().toString());
                double a2=Double.parseDouble(et2.getText().toString());
                double result=a1*a2;
                tv2.setText(Double.toString(result));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a1=Double.parseDouble(et1.getText().toString());
                double a2=Double.parseDouble(et2.getText().toString());
                double result=a1/a2;
                tv2.setText(Double.toString(result));
            }
        });

    }
}
