package com.example.demouicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerEx extends AppCompatActivity implements View.OnClickListener {

    DatePicker datePicker;
    Button submit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);
        findViews();
        setListeners();
    }

    private void findViews() {
        datePicker = findViewById(R.id.datePicker);
        submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);
    }

    private void setListeners() {
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int year = datePicker.getYear();
        int month = datePicker.getMonth() + 1;
        int day = datePicker.getDayOfMonth();
        result.setText(year + "-" + month + "-" + day);
    }
}
