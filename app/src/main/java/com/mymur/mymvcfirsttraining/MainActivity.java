package com.mymur.mymvcfirsttraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
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
    String enteredText;
    KeyListener keyListener;
    Context context;

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
        context  = this;


       keyListener =  new KeyListener() {
                    @Override
                    public int getInputType() {
                        return 0;
                    }

                    @Override
                    public boolean onKeyDown(View view, Editable text, int keyCode, KeyEvent event) {
                        if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                            //Сохраняем введённый текст через метод контроллера
                            controller.updateModelData();
                            return true;
                        }
                        return false;
                    }


                    @Override
                    public boolean onKeyUp(View view, Editable text, int keyCode, KeyEvent event) {
                        return false;
                    }

                    @Override
                    public boolean onKeyOther(View view, Editable text, KeyEvent event) {
                        return false;
                    }

                    @Override
                    public void clearMetaKeyState(View view, Editable content, int states) {
                    }
                };

       setOnKeyListener( keyListener);

    }
}
