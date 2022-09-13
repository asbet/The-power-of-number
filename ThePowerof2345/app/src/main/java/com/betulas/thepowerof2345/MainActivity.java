package com.betulas.thepowerof2345;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   EditText enter_number;
   EditText result_number;
   TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        enter_number=findViewById(R.id.enter_number);
        textView=findViewById(R.id.textView2);

    }
    public void thepowerof2(View view){
    int enter_number1=Integer.parseInt(enter_number.getText().toString());
    int result=enter_number1*enter_number1;
    textView.setText("result: "+result);
    }

    public void thepowerof3(View view){
        int enter_number1=Integer.parseInt((enter_number.getText().toString()));
        int result=enter_number1*enter_number1*enter_number1;
        textView.setText("result: "+result);
    }
    public void thepowerof4(View view){
        int enter_number1=Integer.parseInt(enter_number.getText().toString());
        int result=enter_number1*enter_number1*enter_number1*enter_number1;
        textView.setText("result: " +result);
    }
    public void thepowerof5(View view){
        int enter_number1=Integer.parseInt(enter_number.getText().toString());
        int result=enter_number1*enter_number1*enter_number1*enter_number1*enter_number1;
        textView.setText("result: " +result);
    }

}

