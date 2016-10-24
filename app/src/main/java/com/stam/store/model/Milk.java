package com.stam.store.model;

import java.util.Date;

/**
 * Created by Andfile on 10/14/2016.
 */

public class Milk implements IFood {

    private int mFat;
    private int mID;
    private Date mDate;
    private String mName, mCountry;
    private double mPrice;

    public Milk() {
    }
    public Milk(int mID, String mName, String mCountry, Date mDate, int mFat, double mPrice) {
        this.mFat = mFat;
        this.mID = mID;
        this.mDate = mDate;
        this.mName = mName;
        this.mCountry = mCountry;
        this.mPrice = mPrice;
    }

    public int getFat() {
        return mFat;
    }
    public void setFat(int mFat) {
        this.mFat = mFat;
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
        return mCountry ;
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
