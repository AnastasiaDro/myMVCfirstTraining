package com.mymur.mymvcfirsttraining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;



//мэйн будет выступать как модель
public class MainActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        CurrentDataDisplay currentDataDisplay = new CurrentDataDisplay(textView);


    }




}
