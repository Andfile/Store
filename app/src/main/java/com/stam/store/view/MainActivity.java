package com.stam.store.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.stam.store.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);

      /*  ((TextView) findViewById(R.id.txtText)).setText("hellow 2 world");
        findViewById(R.id.txtText).setVisibility(View.GONE);*/

        findViewById(R.id.fruit_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action1(v);
            }
        });

        findViewById(R.id.milk_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action2(v);
            }
        });

        findViewById(R.id.ref_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.noteTextView)).setText("");
                action3(v);
            }
        });
    }

    public void action1(View v) {
        ((TextView) findViewById(R.id.noteTextView)).setText("Fruit - Фрукты");
    }

    public void action2(View v) {
        ((TextView) findViewById(R.id.noteTextView)).setText("Milk - Молоко");
    }

    public void action3(View v) {
        ((TextView) findViewById(R.id.noteTextView)).setText("Refregirator - Холодильник");
    }
}
