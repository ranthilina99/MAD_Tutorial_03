package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String takeExtra,takeExtra1;
    EditText et1,et2;
    Button b1,b2,b3,b4;
    TextView tv;

    int  result;
    int no1,no2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et1=findViewById(R.id.txtseno1);
        et2=findViewById(R.id.txtseno2);

        b1=findViewById(R.id.plus);
        b2=findViewById(R.id.btnmin);
        b3=findViewById(R.id.btnmultiple);
        b4=findViewById(R.id.btndivision);
        tv=findViewById(R.id.result);

        //set the passing values of activity one
        Intent intent=getIntent();
        takeExtra=intent.getStringExtra("value");
        takeExtra1=intent.getStringExtra("value1");

        //adding
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               no1=Integer.parseInt(takeExtra);
                no2=Integer.parseInt(takeExtra1);
                result=no1+no2;
                tv.setText(no1+"+"+no2+"="+String.valueOf(result));

            }
        });
        //minimum
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1=Integer.parseInt(takeExtra);
                no2=Integer.parseInt(takeExtra1);
                result=no1-no2;
                tv.setText(no1+"-"+no2+"="+String.valueOf(result));

            }
        });
        //multiple
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1=Integer.parseInt(takeExtra);
                no2=Integer.parseInt(takeExtra1);
                result=no1*no2;
                tv.setText(no1+"*"+no2+"="+String.valueOf(result));

            }
        });
        //Division
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1=Integer.parseInt(takeExtra);
                no2=Integer.parseInt(takeExtra1);
                result=no1/no2;
                tv.setText(no1+"/"+no2+"="+String.valueOf(result));

            }
        });
    }

    //set the values of text area
    @Override
    protected void onResume() {
        super.onResume();
        et1.setText(takeExtra);
        et2.setText(takeExtra1);
    }

}