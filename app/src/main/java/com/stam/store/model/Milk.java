package com.stam.store.model;

import java.util.Date;

/**
 * Created by Vito on 10/14/2016.
 */

public class Milk implements IFood {

    private int mFat;

    public int getmFat() {
        return mFat;
    }

    public void setmFat(int mFat) {
        this.mFat = mFat;
    }

    @Override
    public Date getExpDate() {
        return null;
    }

    @Override
    public void setExpDate(Date date) {

    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId(int id) {

    }
}
