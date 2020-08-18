package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void msgSend(View view)
    {
        Intent intent= new Intent( this, SecondActivity.class );
        num1=findViewById(R.id.txt_num1);
        num2=findViewById(R.id.txt_num2);
        intent.putExtra(num1,num2);
    }
}