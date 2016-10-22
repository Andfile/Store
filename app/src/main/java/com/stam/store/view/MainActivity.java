package com.stam.store.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.stam.store.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.VISIBLE);


    }

    public void actionFruit() {
        findViewById(R.id.scrollFruit).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
    }

    public void actionMilk() {
        //((TextView) findViewById(R.id.noteTextView)).setText("Milk - Молоко");
    }

    public void actionRef() {
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollRef).setVisibility(View.VISIBLE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.fruit_button:
                actionFruit();
                break;

            case R.id.milk_button:
                actionMilk();
                break;

            case R.id.ref_button:
                actionRef();
                break;
        }
    }
}
