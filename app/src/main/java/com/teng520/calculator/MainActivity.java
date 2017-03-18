package com.teng520.calculator;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
    private EditText editText1;
    private EditText editText2;
    private Spinner spinner;
    private Button button;
    private TextView textView;
    private String[] opera=getResources().getStringArray(R.array.operator);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.input1);
        editText2=(EditText)findViewById(R.id.input2);
        spinner=(Spinner)findViewById(R.id.spinner);
        button=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.result);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opera);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
