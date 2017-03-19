package com.teng520.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private Spinner spinner;
    private Button button;
    private TextView textView;
    private String str;
    private String[] opera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.input1);
        editText2=(EditText)findViewById(R.id.input2);
        spinner=(Spinner)findViewById(R.id.spinner);
        button=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.result);
        opera=getResources().getStringArray(R.array.operator);
        ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,opera);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                str=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.valueOf(editText1.getText().toString());
                float num2=Float.valueOf(editText2.getText().toString());
                switch (str){
                    case "+":
                        textView.setText(Float.toString(num1+num2));
                        break;
                    case "-":
                        textView.setText(Float.toString(num1-num2));
                        break;
                    case "*":
                        textView.setText(Float.toString(num1*num2));
                        break;
                    case "/":
                        textView.setText(Float.toString(num1/num2));
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
