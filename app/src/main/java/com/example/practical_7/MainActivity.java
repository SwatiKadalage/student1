package com.example.practical_7;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edttxt1=(EditText) findViewById(R.id.edittxt1);
        EditText edttxt2=(EditText) findViewById(R.id.edittxt2);
        Button btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x= String.valueOf(edttxt1.getText());
                String y= String.valueOf(edttxt2.getText());
                if(x=="Srushti" && y=="123@")
                {
                     Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Check user name and password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}