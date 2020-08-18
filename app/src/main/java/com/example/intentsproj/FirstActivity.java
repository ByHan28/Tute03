package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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
        EditText num1=findViewById(R.id.txt_num1);
        EditText num2=findViewById(R.id.txt_num2);
        intent.putExtra("num1",num1.getText().toString());
        intent.putExtra("num2",num2.getText().toString());
        startActivity(intent);

        Context context=getApplicationContext();
        charSequence message="You just clicked the OK button";
        int duration=
    }
}