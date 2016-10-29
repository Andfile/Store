package com.stam.store.model.interfaces;

/**
 * Created by Andfile on 10/14/2016.
 */

public interface IElectric extends IProduct {

    int getSupportedVoltage();
    void setSupportedVoltage(int voltage);
}
