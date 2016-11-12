package com.stam.store.view.Fragments;


import android.content.res.Resources;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.stam.store.R;
import com.stam.store.model.interfaces.IProduct;


// y
/**
 * A simple {@link Fragment} subclass.
 */
public class AddToCartFragment extends Fragment {
    private IProduct mCurrentFruit;

    //на данный момент реализовал таким способом передачу и прорисовку данных. далее надо будет
    //подумать как изменить эту ситуацию
    //проблемы, если оставить эту реализацию то надо в ручную прописать все варианты при смене орентации

    // реализовать передачу данных для прорисовки лейаунта через аргументы бандла.
    //поговорить с цуром о том что на самом деле выгоднее для мня

    public AddToCartFragment(){

    }
    public AddToCartFragment(IProduct mCurrentProduct) {
        mCurrentFruit = mCurrentProduct;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_to_cart, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        fillProductDitales(mCurrentFruit);
    }

    public void fillProductDitales(IProduct mCurrentProduct) {
        Resources res = getResources();
        switch (mCurrentProduct.getName()) {

            case "Apple":
                ((ImageView) getView().findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.apple_image_80));
                break;
            case "WaterMelon":
                ((ImageView) getView().findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.woterm));
                break;
            case "Banana" :
                ((ImageView) getView().findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.banana_80));
                break;
            case "Grusha":
                ((ImageView) getView().findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.grusha_80));
                break;
            case "Granat" :
                ((ImageView) getView().findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.pomegranate_85));
                break;
            case "Grape":
                ((ImageView) getView().findViewById(R.id.productImage)).setImageDrawable(res.getDrawable(R.drawable.grape_80));
                break;
        }

        ((TextView) getView().findViewById(R.id.textViewPrice)).setText(Double.toString(mCurrentProduct.getPrice()));
        ((TextView) getView().findViewById(R.id.textViewCountry)).setText(mCurrentProduct.getCountry());
        ((TextView) getView().findViewById(R.id.textViewName)).setText(mCurrentProduct.getName());
    }
}
