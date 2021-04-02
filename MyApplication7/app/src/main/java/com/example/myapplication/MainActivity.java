package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText EditText0;
    TextView text0;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    Button button0;
    Button button1;
    Button button2;
    Spinner spinner;
    Integer value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner =findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getApplicationContext(),R.array.spinner,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Position"+position,Toast.LENGTH_SHORT).show();
                value=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        EditText0=findViewById(R.id.EditText0);
        text0=findViewById(R.id.text0);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        text4=findViewById(R.id.text4);
        text5=findViewById(R.id.text5);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);




    }

    public void metre(View view) {
        double result0=Double.parseDouble(EditText0.getText().toString())*100;
        double result1=Double.parseDouble(EditText0.getText().toString())*3.28;
        double result2=Double.parseDouble(EditText0.getText().toString())*39.37;
        if(value == 1 || value == 2){
            Toast.makeText(MainActivity.this,"Please select the correct conversion icon", Toast.LENGTH_SHORT).show();}
        else{
        text0.setText("Centimetre:");
        text1.setText(Double.toString(result0));
        text2.setText("Foot:");
        text3.setText(Double.toString(result1));
        text4.setText("Inch:");
        text5.setText(Double.toString(result2));}
    }

    public void celsius(View view) {
        double result3=Double.parseDouble(EditText0.getText().toString())*9/5+32;
        double result4=Double.parseDouble(EditText0.getText().toString())-273.15;
        if(value == 0 || value == 2){
            Toast.makeText(MainActivity.this,"Please select the correct conversion icon", Toast.LENGTH_SHORT).show();}
        else{
        text0.setText("Fahrenheit:");
        text1.setText(Double.toString(result3));
        text2.setText("Kelvin:");
        text3.setText(Double.toString(result4));}

    }

    public void kilograms(View view) {
        double result5=Double.parseDouble(EditText0.getText().toString())*1000;
        double result6=Double.parseDouble(EditText0.getText().toString())*35.27;
        double result7=Double.parseDouble(EditText0.getText().toString())*2.20;
            if(value == 0 || value == 1){
                Toast.makeText(MainActivity.this,"Please select the correct conversion icon", Toast.LENGTH_SHORT).show();}
            else {
                text0.setText("Gram:");
                text1.setText(Double.toString(result5));
                text2.setText("ounce:");
                text3.setText(Double.toString(result6));
                text4.setText("pound:");
                text5.setText(Double.toString(result7));
            }


    }
}