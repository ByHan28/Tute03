package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String n1=intent.getStringExtra("number1");
        String n2=intent.getStringExtra("number2");

        int num1,num2;

        num1=Integer.parseInt(n1);
        num2=Integer.parseInt(n2);

        txt_number1=findViewById(R.id.txt_number1);
        txt_number2=findViewById(R.id.txt_number2);
        lbl_answer=findViewById(R.id.lbl_answer);

        txt_number1.setText(n1);
        txt_number2.setText(n2);

        public void Add(View view)
        {
            answer=num1+num2;
            lbl_answer.setText(Integer.toString(answer));
        }

        public void subtraction(View view)
        {
            answer=num1-num2;
            lbl_answer.setText(Integer.toString(answer));
        }

        public void division(View view)
        {
            answer=num1/num2;
            lbl_answer.setText(Integer.toString(answer));
        }

        public void multiplication(View view)
        {
            answer=num1*num2;
            lbl_answer.setText(Integer.toString(answer));
        }


    }




}