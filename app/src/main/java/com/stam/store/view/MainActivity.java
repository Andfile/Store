package com.stam.store.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.stam.store.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);

    }

    public void action1() {
        //((TextView) findViewById(R.id.noteTextView)).setText("Fruit - Фрукты");
    }

    public void action2() {
        //((TextView) findViewById(R.id.noteTextView)).setText("Milk - Молоко");
    }

    public void action3() {
        //((TextView) findViewById(R.id.noteTextView)).setText("Refregirator - Холодильник");
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.fruit_button:
                action1();
                break;

            case R.id.milk_button:
                action2();
                break;

            case R.id.ref_button:
                action3();
                break;
        }
    }
}
