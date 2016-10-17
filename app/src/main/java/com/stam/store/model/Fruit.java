package com.stam.store.model;

import java.util.Date;

/**
 * Created by Vito on 10/14/2016.
 */

public class Fruit implements IFood {

    private int mID;
    private Date mDate;

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
