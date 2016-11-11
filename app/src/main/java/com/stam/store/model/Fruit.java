package com.stam.store.model;

import com.stam.store.model.interfaces.IFood;

import java.util.Date;

public class Fruit implements IFood {

    private int mID;
    private Date mDate;
    private String mName, mCountry;
    private double mWeight, mPrice;


    public Fruit(){}
    public Fruit(String mName,double mWeight, double mPrice){
        this.mID = 1;
        this.mDate = null;
        this.mName = mName;
        this.mCountry = "Israel";
        this.mWeight = mWeight;
    this.mPrice = mPrice;
}




    public double getWeight() {
        return mWeight;
    }
    public void setWeight(double mWeight) {
        this.mWeight = mWeight;
    }


    @Override
    public Date getExpDate() {
        return mDate;
    }
    @Override
    public void setExpDate(Date mDate) {
        this.mDate = mDate;
    }


    @Override
    public int getId() {
        return mID;
    }
    @Override
    public void setId(int mID) {
        this.mID = mID;
    }


    @Override
    public String getCountry() {
        return mCountry;
    }
    @Override
    public void setCountry(String mCountry) {
        this.mCountry = mCountry;
    }


    @Override
    public void setName(String mName) {
        this.mName = mName;
    }
    @Override
    public String getName() {
        return mName;
    }


    @Override
    public double getPrice() {
        return mPrice;
    }
    @Override
    public void setPrice(double mPrice) {
        this.mPrice = mPrice;
    }

}
