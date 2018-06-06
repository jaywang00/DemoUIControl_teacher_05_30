package com.example.demouicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarEx extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    SeekBar seekBar1,seekBar2,seekBar3;
    LinearLayout linearLayout1;
    TextView result1, result2, result3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        findViews();
        setListeners();
    }


    private void findViews(){
        seekBar1 = findViewById(R.id.seekBar1);
        seekBar2 = findViewById(R.id.seekBar2);
        seekBar3= findViewById(R.id.seekBar3);
        linearLayout1 = findViewById(R.id.linearlayout1);
        result1 = findViewById(R.id.result1);
        result2 = findViewById(R.id.result2);
        result3 = findViewById(R.id.result3);
    }

    private void setListeners(){
        seekBar1.setOnSeekBarChangeListener(this);
        seekBar2.setOnSeekBarChangeListener(this);
        seekBar3.setOnSeekBarChangeListener(this);
    }

    int Alpha = 255, r, g, b;
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        switch(seekBar.getId()){
            case R.id.seekBar1:
                r = progress;
                break;
            case R.id.seekBar2:
                g = progress;
                break;
            case R.id.seekBar3:
                b = progress;
                break;
        }

        int color = Alpha*(1<<24)+r*(1<<16)+g*(1<<8)+b;
        linearLayout1.setBackgroundColor(color);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
