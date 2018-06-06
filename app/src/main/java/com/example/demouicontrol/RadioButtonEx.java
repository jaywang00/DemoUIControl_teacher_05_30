package com.example.demouicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioButtonEx extends AppCompatActivity implements View.OnClickListener{

    Button submit;
    RadioButton rbtn1, rbtn2, rbtn3;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton_ex);
        findViews();
        setListeners();
    }

    void findViews(){
        submit = findViewById(R.id.submit);
        rbtn1 = findViewById(R.id.radioButton1);
        rbtn2 = findViewById(R.id.radioButton2);
        rbtn3 = findViewById(R.id.radioButton3);
        result = findViewById(R.id.result);
    }

    void setListeners(){
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(rbtn1.isChecked())
            result.setText("您選取的是："+rbtn1.getText());
        else if(rbtn2.isChecked())
            result.setText("您選取的是："+rbtn2.getText());
        else if(rbtn3.isChecked())
            result.setText("您選取的是："+rbtn3.getText());
    }
}
