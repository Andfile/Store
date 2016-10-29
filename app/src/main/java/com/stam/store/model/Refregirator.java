package com.stam.store.model;

import com.stam.store.model.interfaces.IElectric;

/**
 * Created by Andfile on 10/14/2016.
 */

public  class Refregirator implements IElectric {

    private String mManufacture, mName, mCountry;
    private int mID, mVoltage;
    private double mPrice;


    public Refregirator(){}

    public Refregirator(int mID, String mName, String mManufacture, String mCountry, int mVoltage, double mPrice) {
        this.mCountry = mCountry;
        this.mManufacture = mManufacture;
        this.mName = mName;
        this.mID = mID;
        this.mVoltage = mVoltage;
        this.mPrice = mPrice;
    }

    public String getManufactor() {
        return mManufacture;
    }
    public void setManufactor(String mManufactor) {
        this.mManufacture = mManufactor;
    }


    @Override
    public int getSupportedVoltage() {
        return mVoltage;
    }
    @Override
    public void setSupportedVoltage(int mVoltage) {
        this.mVoltage = mVoltage;
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


    public String getName() {
        return mName;
    }
    @Override
    public void setName(String mName) {
        this.mName = mName;
    }


    @Override
    public double getPrice() {
        return mPrice;
    }
    @Override
    public void setPrice(double mPrice) {
        this.mPrice  = mPrice;
    }
}
