package com.stam.store.model;

/**
 * Created by Vito on 10/14/2016.
 */

public  class Refregirator implements IElectric {

    @Override
    public int getSupportedVoltage() {
        return 0;
    }

    @Override
    public void setSupportedVoltage(int voltage) {

    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId(int id) {

    }
}
