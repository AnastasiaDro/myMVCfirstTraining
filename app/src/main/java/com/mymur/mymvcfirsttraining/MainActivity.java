package com.mymur.mymvcfirsttraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;



public class MainActivity extends AppCompatActivity {

    TextView textView;
    com.google.android.material.textfield.TextInputEditText inputText;

    MyModel myModel;
    CurrentDataDisplay display;
    Controller controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        inputText = findViewById(R.id.inputText);

        //создаём наши классы
        myModel = new MyModel();
        display = new CurrentDataDisplay(myModel, textView);
        controller = new Controller(myModel, inputText);

    }

    public void onBtnOkClick(View view) {
        controller.updateModelData();
    }

}
