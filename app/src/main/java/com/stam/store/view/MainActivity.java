package com.stam.store.view;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.stam.store.R;
import com.stam.store.model.Fruit;
import com.stam.store.model.interfaces.IProduct;
import com.stam.store.view.Fragments.FruitFragment;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Dictionary dict = new Hashtable();
    public ArrayList<IProduct> cart = new ArrayList<>();
    ScrollView container;
    LinearLayout shopList;
    IProduct mCurrentProduct;
    Fragment mNewFragment ;

    FragmentManager fragmentManager = getFragmentManager();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_main);
        initStore();
        container = (ScrollView) findViewById(R.id.container);

    }


    public void actionAddToCart() {

        cart.add(mCurrentProduct);
        Log.e("ADD----SIZE OF LIST----", "" + cart.size());
        actionFruit();
    }

    public void listCartProduct() {
        container.removeAllViews();

        if (shopList != null) {shopList.removeAllViews();}
        Log.e("LIST-------------", "start");

        for (IProduct a : cart) {
            Log.e("", a.getName());
            actionAddProduct(a);

        }

        container.addView(shopList);

    }

    public void actionAddProduct(IProduct product) {
        if (shopList == null) {
            shopList = new LinearLayout(this);
            shopList.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams paramsShopList = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
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

       // actionSwitch(R.layout.fruits_layout);

        //для того чтоб вызвать фрагмент нам нужно использовать фрагмнет транзикуию
        //каждое изменение фрагмента(ремув,адд и тд и тп нужно подтверждать комитом)


        mNewFragment  = new FruitFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.add(R.id.fragmentContainier, mNewFragment);
        transaction.commit();



    }

    public void actionMilk() {
        actionSwitch(R.layout.milk_layout);
    }

    public void actionRef() {
        actionSwitch(R.layout.refrigerators_layout);
    }

    private void fillProductDitales(IProduct mCurrentProduct) {
        Resources res = getResources();
        switch (mCurrentProduct.getName()) {

            case "Apple":
                ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.apple_image_80));
                break;
            case "WaterMelon":
                    ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.woterm));
                break;
            case "Banana" :
                ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.banana_80));
                break;
            case "Grusha":
                ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.grusha_80));
                break;
            case "Granat" :
                ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.pomegranate_85));
                break;
            case "Grape":
                ((ImageView) findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.grape_80));
                break;
        }

        ((TextView) findViewById(R.id.textViewPrice)).setText(Double.toString(mCurrentProduct.getPrice()));
        ((TextView) findViewById(R.id.textViewCountry)).setText(mCurrentProduct.getCountry());
        ((TextView) findViewById(R.id.textViewName)).setText(mCurrentProduct.getName());
    }

    public void actionBanana() {
        Log.e("ADD----------------", "Banana test");
        actionSwitch(R.layout.add_fruits_layout);

        mCurrentProduct = (Fruit) dict.get("Banana");

        fillProductDitales(mCurrentProduct);
    }

    public void actionWaterMelon() {
        Log.e("ADD----------------", "WaterMelon test");
        actionSwitch(R.layout.add_fruits_layout);

        mCurrentProduct = (Fruit) dict.get("WaterMelon");

        fillProductDitales(mCurrentProduct);
    }

    public void actionApple() {
        Log.e("ADD----------------", "Apple test");
        actionSwitch(R.layout.add_fruits_layout);

        mCurrentProduct = (Fruit) dict.get("Apple");

        fillProductDitales(mCurrentProduct);
    }

    public void actionGrusha() {
        Log.e("ADD----------------", "Grusha test");
        actionSwitch(R.layout.add_fruits_layout);

        mCurrentProduct = (Fruit) dict.get("Grusha");

        fillProductDitales(mCurrentProduct);
    }

    public void actionGranat() {
        Log.e("ADD----------------", "Granat test");
        actionSwitch(R.layout.add_fruits_layout);

        mCurrentProduct = (Fruit) dict.get("Granat");

        fillProductDitales(mCurrentProduct);
    }

    public void actionGrape() {
            Log.e("ADD----------------", "Grape test");
            actionSwitch(R.layout.add_fruits_layout);

            mCurrentProduct = (Fruit) dict.get("Grape");

            fillProductDitales(mCurrentProduct);
        }

    public void initStore() {

        dict.put("Apple", new Fruit("Apple", 1.0, 12.5));
        dict.put("Banana", new Fruit("Banana", 2.0, 14.5));
        dict.put("WaterMelon", new Fruit("WaterMelon", 3.0, 4.5));
        dict.put("Grusha", new Fruit("Grusha", 4.0, 11.90));
        dict.put("Granat", new Fruit("Granat", 5.0, 20.5));
        dict.put("Grape", new Fruit("Grape", 6.0, 4.5));

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
