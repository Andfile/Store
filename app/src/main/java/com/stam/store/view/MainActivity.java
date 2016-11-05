package com.stam.store.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.stam.store.R;
import com.stam.store.model.Fruit;
import com.stam.store.model.interfaces.IProduct;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Dictionary dict = new Hashtable();
    public ArrayList<Fruit> cart = new ArrayList<>();
    ScrollView container;
    LinearLayout shopList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_main);
        initStore();
        container = (ScrollView) findViewById(R.id.container);

//        findViewById(R.id.scrollRef).setVisibility(View.GONE);
//        findViewById(R.id.firstScreen).setVisibility(View.VISIBLE);
//        findViewById(R.id.scrollmilk).setVisibility(View.GONE);
        //  findViewById(R.id.fruit_addToCart).setVisibility(View.GONE);

    }

    public void actionAddToCart() {

        String key1;
        Log.e("ADD----------------","prepare textViewTo Key1");
        key1 = findViewById(R.id.textViewName).toString();
        Log.e("ADD----------------","add textViewTo Key1");
        cart.add((Fruit) dict.get(key1));
        Log.e("ADD----------------",""+cart.size());
        actionFruit();
    }

    public void listCartProduct (){
        container.removeAllViews();
        Log.e("LIST-------------","start");
        for (Fruit a : cart){
            Log.e("",a.getName());
            actionAddProduct(a);

        }

        container.addView(shopList);

    }

    public void actionAddProduct(Fruit product) {
        if (shopList == null) {
            shopList = new LinearLayout(this);
            shopList.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams paramsShopList = new  LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            shopList.setLayoutParams(paramsShopList);
        }
        View newItem = getLayoutInflater().inflate(R.layout.list_item_layout, null, false);
        shopList.addView(newItem);


    }


    public void actionSwitch(int newLayoutId) {
        container.removeAllViews();
        getLayoutInflater().inflate(newLayoutId, container, true);
    }

    public void actionFruit() {
        actionSwitch(R.layout.fruits_layout);
    }

    public void actionMilk() {
        actionSwitch(R.layout.milk_layout);
    }

    public void actionRef() {
        actionSwitch(R.layout.refrigerators_layout);
    }

    public void actionBanana() {
        actionSwitch(R.layout.add_fruits_layout);
        Resources res = getResources();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.banana_80));
        Fruit fruit1 = new Fruit();
        fruit1 = (Fruit) dict.get("Banana");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());
    }

    public void actionApple() {
        Log.e("ADD----------------","Apple test");
        actionSwitch(R.layout.add_fruits_layout);
        Resources res = getResources();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.apple_image_80));
        Fruit fruit1 = new Fruit();
        fruit1 = (Fruit) dict.get("Apple");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());

    }

    public void actionWaterMelon() {
        actionSwitch(R.layout.add_fruits_layout);
        Resources res = getResources();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.woterm));
        Fruit fruit1 = new Fruit();
        fruit1 = (Fruit) dict.get("WaterMelon");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());
    }

    public void actionGrusha() {
        actionSwitch(R.layout.add_fruits_layout);
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
        actionSwitch(R.layout.add_fruits_layout);
        Fruit fruit1 = new Fruit();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.pomegranate_85));
        fruit1 = (Fruit) dict.get("Granat");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());
    }

    public void actionGrape() {
        actionSwitch(R.layout.add_fruits_layout);
        Resources res = getResources();
        Fruit fruit1 = new Fruit();
        ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.grape_80));
        fruit1 = (Fruit) dict.get("Grape");
        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(fruit1.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(fruit1.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(fruit1.getName());


    }

    public void initStore() {

        dict.put("Apple", new Fruit("Apple", 0.0, 12.5));
        dict.put("Banana", new Fruit("Banana", 0.0, 14.5));
        dict.put("WaterMelon", new Fruit("WaterMelon", 0.0, 4.5));
        dict.put("Grusha", new Fruit("Grusha", 0.0, 11.90));
        dict.put("Granat", new Fruit("Granat", 0.0, 20.5));
        dict.put("Grape", new Fruit("Grape", 0.0, 4.5));

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();
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

            case R.id.add_to_cart_button:
                actionAddToCart();
                break;

            case R.id.cart:
                listCartProduct();
                break;
        }
    }
}
