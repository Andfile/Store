package com.stam.store.view;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.stam.store.R;
import com.stam.store.model.Fruit;
import com.stam.store.model.IProduct;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   public Dictionary dict = new Hashtable();
   public ArrayList<IProduct> cart = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);
        initStore();
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollmilk).setVisibility(View.GONE);
        findViewById(R.id.fruit_addToCart).setVisibility(View.GONE);


    }

    public void actionAddToCart(){




    }

    public void actionFruit() {
        findViewById(R.id.scrollFruit).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.scrollmilk).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
        findViewById(R.id.fruit_addToCart).setVisibility(View.GONE);
    }

    public void actionMilk() {
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollmilk).setVisibility(View.VISIBLE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
        findViewById(R.id.fruit_addToCart).setVisibility(View.GONE);
    }

    public void actionRef() {
        findViewById(R.id.scrollRef).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollmilk).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
        findViewById(R.id.fruit_addToCart).setVisibility(View.GONE);
    }

    public void actionBanana() {
        Resources res = getResources();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.banana_80));
        findViewById(R.id.fruit_addToCart).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
        findViewById(R.id.scrollmilk).setVisibility(View.GONE);
        Fruit fruit1 = new Fruit();
        fruit1 = (Fruit) dict.get("Banana");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());
    }

    public void actionApple() {
        findViewById(R.id.fruit_addToCart).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
        findViewById(R.id.scrollmilk).setVisibility(View.GONE);
        Resources res = getResources();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.apple_image_80));
        Fruit fruit1 = new Fruit();
        fruit1 = (Fruit) dict.get("Apple");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());
    }

    public void actionWaterMelon(){
        findViewById(R.id.fruit_addToCart).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
        findViewById(R.id.scrollmilk).setVisibility(View.GONE);
        Resources res = getResources();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.woterm));
        Fruit fruit1 = new Fruit();
        fruit1 = (Fruit) dict.get("WaterMelon");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());
    }

    public void actionGrusha(){
        findViewById(R.id.fruit_addToCart).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
        findViewById(R.id.scrollmilk).setVisibility(View.GONE);
        Resources res = getResources();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.grusha_80));
        Fruit fruit1 = new Fruit();
        fruit1 = (Fruit) dict.get("Grusha");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());

    }

    public void actionGranat() {
        Resources res = getResources();
        findViewById(R.id.fruit_addToCart).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
        findViewById(R.id.scrollmilk).setVisibility(View.GONE);
        Fruit fruit1 = new Fruit();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.pomegranate_85));
        fruit1 = (Fruit) dict.get("Granat");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());
    }

    public void actionGrape() {
        Resources res = getResources();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.grape_80));
        findViewById(R.id.fruit_addToCart).setVisibility(View.VISIBLE);
        findViewById(R.id.scrollFruit).setVisibility(View.GONE);
        findViewById(R.id.scrollRef).setVisibility(View.GONE);
        findViewById(R.id.firstScreen).setVisibility(View.GONE);
        findViewById(R.id.scrollmilk).setVisibility(View.GONE);
        Fruit fruit1 = new Fruit();
        fruit1 = (Fruit) dict.get("Grape");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());


    }

    public void initStore(){

        dict.put("Apple", new Fruit("Apple", 0.0, 12.5));
        dict.put("Banana", new Fruit("Banana", 0.0, 14.5));
        dict.put("WaterMelon", new Fruit("WaterMelon", 0.0, 4.5));
        dict.put("Grusha", new Fruit("Grusha", 0.0, 11.90));
        dict.put("Granat", new Fruit("Granat", 0.0, 20.5));
        dict.put("Grape", new Fruit("Grape", 0.0, 4.5));

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.apple_img:
                actionApple();
                break;

            case R.id.banana_img:
                actionBanana();
                break;

            case R.id.grape_img:
                actionGrape();
                break;

            case R.id.granat_img:
                actionGranat();
                break;

            case R.id.woterm_img:
                actionWaterMelon();
                break;

            case R.id.grusha_img:
                actionGrusha();
                break;

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
