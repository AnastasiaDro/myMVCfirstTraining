package com.mymur.mymvcfirsttraining;



//Это класс обработчика событий


public class Controller implements ControllerInterface {

    MyModel myModel;
    com.google.android.material.textfield.TextInputEditText inputText;
    String enteredText;

    public Controller (MyModel myModel, com.google.android.material.textfield.TextInputEditText inputText) {
        this.myModel = myModel;
        this.inputText = inputText;
    }

    //метод измнения данных в модели
    @Override
    public void updateModelData() {
        enteredText = inputText.getText().toString();
        myModel.changeData(enteredText);
    }
}
