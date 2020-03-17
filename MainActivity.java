package com.example.elavi.fonttry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView autoCompleteTextView=findViewById(R.id.autocompletetextview);
        String []freinds = {"Nick","Rahul","Raj","Mohan","Lavish","Ramesh","Sara","Siraj","Naitik","Monu"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,freinds);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);
    }
}
