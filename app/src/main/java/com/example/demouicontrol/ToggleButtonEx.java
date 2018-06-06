package com.example.demouicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonEx extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebutton);

        tbtn = findViewById(R.id.toggleButton);
        tbtn.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked)
            Toast.makeText(ToggleButtonEx.this,"Now is On",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(ToggleButtonEx.this,"Now is Off",Toast.LENGTH_SHORT).show();
    }
}
