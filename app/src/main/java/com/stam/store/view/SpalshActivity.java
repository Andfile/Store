package com.stam.store.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.stam.store.R;

public class SpalshActivity extends AppCompatActivity {

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);


// пример с тредом который сделал я,но вито сказал что лучше нижний вариант.
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(2000);
//
//                    Intent intent = new Intent(SpalshActivity.this, MainActivity.class);
//                    intent.putExtra("extraInfoKey", "hochu stejk");
//                    startActivity(intent);
//
//                    finish();
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();


        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                    Intent intent = new Intent(SpalshActivity.this, MainActivity.class);
                    startActivity(intent);

                    finish();

            }
        }, 2000);
    }
}
