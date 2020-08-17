package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btn;
    String myExtras,myExtras1;
    EditText et,et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn=findViewById(R.id.btnok);
        et=findViewById(R.id.txtno1);
        et1=findViewById(R.id.txtno2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                myExtras=et.getText().toString();

                //Pass the Extra Values SecondActivity
                intent.putExtra("value",myExtras);
                myExtras1=et1.getText().toString();

                intent.putExtra("value1",myExtras1);
                startActivity(intent);

                //Display Toast
                Context context=getApplicationContext();
                CharSequence message="You Just Click the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

            }
        });
    }
}